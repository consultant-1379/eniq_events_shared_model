package com.ericsson.eniq.events.ui.shared.model.sessionbrowser.details;

import com.ericsson.eniq.events.ui.shared.annotations.FieldMappingInfo;
import com.ericsson.eniq.events.ui.shared.annotations.ResultSetMappingInfo;
import com.ericsson.eniq.events.ui.shared.enums.EventClassType;
import com.ericsson.eniq.events.ui.shared.enums.EventType;

/**
 * Created by IntelliJ IDEA.
 * User: eeidpar
 * Date: 21/02/12
 * Time: 16:14
 * To change this template use File | Settings | File Templates.
 */
@ResultSetMappingInfo(fieldMappings = {
        @FieldMappingInfo(fieldName = "eventTime", columnName = "EVENT_TIME", isTimeStamp = true),
        @FieldMappingInfo(fieldName = "eventType", columnName = "EVENT_ID", isLookupEnum = true, enumType = EventType.class, lookupMethod = "fromEventId"),
        @FieldMappingInfo(fieldName = "startCellId", columnName = "START_CELL_ID"),
        @FieldMappingInfo(fieldName = "endCellId", columnName = "END_CELL_ID"),
        @FieldMappingInfo(fieldName = "startCId", columnName = "START_C_ID"),
        @FieldMappingInfo(fieldName = "endCId", columnName = "END_C_ID"),
        @FieldMappingInfo(fieldName = "startRncId", columnName = "START_RNC_ID"),
        @FieldMappingInfo(fieldName = "endRncId", columnName = "END_RNC_ID"),
        @FieldMappingInfo(fieldName = "distinctCellCount", columnName = "DISTINCT_CELL_CNT"),
        @FieldMappingInfo(fieldName = "tac", columnName = "TAC"),
        @FieldMappingInfo(fieldName = "eventClassType", columnName = "", isLookupEnum = true, enumType = EventClassType.class, lookupMethod = "valueOf", defaultEnumValue = "RAB") })
public interface IDataBearerSessionEventData extends ISessionEventData {
    int getRscpAverage();

    int getEcnoAverage();

    int getUlInterference();

    int getAvgUsersInCell();

    String getStartCellId();

    String getEndCellId();

    String getStartCId();

    String getEndCId();

    int getDuration();

    String getTac();

    String getStartRncId();

    String getEndRncId();

    int getDistinctCellCount();

    boolean getIsSignallingRab();
}
