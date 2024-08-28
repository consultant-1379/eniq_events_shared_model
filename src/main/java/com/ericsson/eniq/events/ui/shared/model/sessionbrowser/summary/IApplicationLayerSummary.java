package com.ericsson.eniq.events.ui.shared.model.sessionbrowser.summary;

import com.ericsson.eniq.events.ui.shared.annotations.FieldMappingInfo;
import com.ericsson.eniq.events.ui.shared.annotations.ResultSetMappingInfo;

/**
 * Created by IntelliJ IDEA.
 * User: eeidpar
 * Date: 22/02/12
 * Time: 08:50
 * To change this template use File | Settings | File Templates.
 */
@ResultSetMappingInfo(fieldMappings = { @FieldMappingInfo(fieldName = "totalDownload", columnName = "TOTAL_DL"),
        @FieldMappingInfo(fieldName = "totalUpload", columnName = "TOTAL_UL"),
        @FieldMappingInfo(fieldName = "function", columnName = "FUNCTION_DESC"),
        @FieldMappingInfo(fieldName = "totalApplicationFlows", columnName = "TOTAL_APP_FLOW") })
public interface IApplicationLayerSummary {
    long getTotalDownload();

    long getTotalUpload();

    String getFunction();

    int getTotalApplicationFlows();
}
