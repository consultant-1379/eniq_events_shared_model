#!/bin/bash

if [ "$2" == "" ]; then
    	echo usage: $0 \<Branch\> \<RState\>
    	exit -1
else
	versionProperties=install/version.properties
	theDate=\#$(date +"%c")
	module=$1
	branch=$2
	workspace=$3
fi

function getProductNumber {
        product=`cat $workspace/build.cfg | grep $module | grep $branch | awk -F " " '{print $3}'`
}


function setRstate {

        revision=`cat $workspace/build.cfg | grep $module | grep $branch | awk -F " " '{print $4}'`

       	if git tag | grep $product-$revision; then
	        rstate=`git tag | grep $revision | tail -1 | sed s/.*-// | perl -nle 'sub nxt{$_=shift;$l=length$_;sprintf"%0${l}d",++$_}print $1.nxt($2) if/^(.*?)(\d+$)/';`
        else
                ammendment_level=01
                rstate=$revision$ammendment_level
        fi
	echo "Building R-State:$rstate"

}


function nexusDeploy {
	RepoURL=https://arm1s11-eiffel004.eiffel.gic.ericsson.se:8443/nexus/content/repositories/assure-releases

	GroupId=com.ericsson.eniq
	ArtifactId=eniq_events_shared_model

	
	echo "****"	
	echo "Deploying the jar /eniq-data-model-1.0.jar as ${ArtifactId}${rstate}.jar to Nexus...."
	echo "****"	

	if [ "$branch" == "master" ]; then 
	   	mvn deploy:deploy-file \
	        	-Durl=${RepoURL} \
		        -DrepositoryId=assure-releases \
		        -Dpackaging=jar \
		        -DgroupId=${GroupId} \
		        -Dversion=${rstate} \
		        -DartifactId=${ArtifactId} \
		        -Dfile=target/eniq-data-model-1.0.jar
	else
       		mvn deploy:deploy-file \
                        -Durl=${RepoURL} \
	                -DrepositoryId=assure-releases \
	                -Dpackaging=jar \
	                -DgroupId=${GroupId} \
	                -Dversion=${rstate} \
	                -DartifactId=${ArtifactId} \
	                -Dfile=target/eniq-data-model-1.0.jar
	fi

}

getProductNumber
setRstate
git checkout $branch
git pull origin $branch

mvn clean install
rsp=$?


if [ $rsp == 0 ]; then

  git tag $product-$rstate
  git pull
  git push --tag origin $branch
  mkdir install
  touch $versionProperties
  echo $theDate >> $versionProperties
  echo module.name=eventsui >> $versionProperties
  echo module.version=$rstate >> $versionProperties
  echo build.tag=b999 >> $versionProperties
  echo author=$USER >> $versionProperties
  echo module.build=999 >> $versionProperties
  echo product.number=$product >> $versionProperties
  echo product.label=$product-$rstate >> $versionProperties

  zip eventssharedmodel_$rstate.zip install/* target/*.jar
  cp eventssharedmodel_$rstate.zip /home/$USER/eniq_events_releases

  nexusDeploy

  \rm -rf eventssharedmodel_$rstate.zip
  \rm -rf install
fi

exit $rsp

