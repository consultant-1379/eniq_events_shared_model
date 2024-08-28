package com.ericsson.eniq.events.ui.shared.model.sessionbrowser.details;

import com.ericsson.eniq.events.ui.shared.annotations.FieldMappingInfo;
import com.ericsson.eniq.events.ui.shared.annotations.ResultSetMappingInfo;
import com.ericsson.eniq.events.ui.shared.enums.EventClassType;
import com.ericsson.eniq.events.ui.shared.enums.EventType;

/**
 * Created by IntelliJ IDEA.
 * User: eeidpar
 * Date: 21/02/12
 * Time: 16:15
 * To change this template use File | Settings | File Templates.
 */
@ResultSetMappingInfo(fieldMappings = {
        @FieldMappingInfo(fieldName = "eventTime", columnName = "EVENT_TIME", isTimeStamp = true),
        @FieldMappingInfo(fieldName = "eventType", columnName = "EVENT_ID", isLookupEnum = true, enumType = EventType.class, lookupMethod = "fromEventId"),
        @FieldMappingInfo(fieldName = "cId", columnName = "CID"),
        @FieldMappingInfo(fieldName = "cellId", columnName = "CELL_ID"),
        @FieldMappingInfo(fieldName = "serviceArea", columnName = "SERVING_AREA"),
        @FieldMappingInfo(fieldName = "duration", columnName = "DURATION"),
        @FieldMappingInfo(fieldName = "tac", columnName = "TAC"),
        @FieldMappingInfo(fieldName = "errFlag", columnName = "ERR_FLAG", isBoolean = true),
        @FieldMappingInfo(fieldName = "eventClassType", columnName = "", isLookupEnum = true, enumType = EventClassType.class, lookupMethod = "valueOf", defaultEnumValue = "CORE") })
public interface ICoreEventData extends ISessionEventData {
    String getCellId();

    String getCId();

    String getServiceArea();

    String getTac();

    int getDuration();
}
