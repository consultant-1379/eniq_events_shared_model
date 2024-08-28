package com.ericsson.eniq.events.ui.shared.model.sessionbrowser.details;

import com.ericsson.eniq.events.ui.shared.annotations.FieldMappingInfo;
import com.ericsson.eniq.events.ui.shared.annotations.ResultSetMappingInfo;
import com.ericsson.eniq.events.ui.shared.enums.EventClassType;

/**
 * Created by IntelliJ IDEA.
 * User: eeidpar
 * Date: 21/02/12
 * Time: 16:14
 * To change this template use File | Settings | File Templates.
 */
@ResultSetMappingInfo(fieldMappings = {
        @FieldMappingInfo(fieldName = "eventTime", columnName = "EVENT_TIME", isTimeStamp = true),
        @FieldMappingInfo(fieldName = "rscpAverage", columnName = "RSCP_AVG"),
        @FieldMappingInfo(fieldName = "ecnoAverage", columnName = "ECNO_AVG"),
        @FieldMappingInfo(fieldName = "ulInterference", columnName = "UL_INTERFERENCE_AVG"),
        @FieldMappingInfo(fieldName = "avgUsersInCell", columnName = "HSDSCH_AVG_USERS"),
        @FieldMappingInfo(fieldName = "eventClassType", columnName = "", isLookupEnum = true, enumType = EventClassType.class, lookupMethod = "valueOf", defaultEnumValue = "RAB") })
public interface IRadioCellConditionsEventData extends ISessionEventData {
    int getRscpAverage();

    int getEcnoAverage();

    int getUlInterference();

    int getAvgUsersInCell();
}
