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
        @FieldMappingInfo(fieldName = "tac", columnName = "TAC"),
        @FieldMappingInfo(fieldName = "sourceCellId", columnName = "SOURCE_CELL_ID"),
        @FieldMappingInfo(fieldName = "targetCellId", columnName = "TARGET_CELL_ID"),
        @FieldMappingInfo(fieldName = "eventClassType", columnName = "", isLookupEnum = true, enumType = EventClassType.class, lookupMethod = "valueOf", defaultEnumValue = "HANDOVER_FAILURE_SESSION") })
public interface IHandoverFailureSessionEventData extends ISessionEventData {
    String getSourceCellId();

    String getTargetCellId();

    String getTac();
}
