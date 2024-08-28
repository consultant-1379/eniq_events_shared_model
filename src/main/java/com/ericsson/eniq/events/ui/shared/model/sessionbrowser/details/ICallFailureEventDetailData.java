/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2014
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.eniq.events.ui.shared.model.sessionbrowser.details;

import com.ericsson.eniq.events.ui.shared.annotations.FieldMappingInfo;
import com.ericsson.eniq.events.ui.shared.annotations.ResultSetMappingInfo;
import com.ericsson.eniq.events.ui.shared.enums.EventClassType;
import com.ericsson.eniq.events.ui.shared.enums.EventType;

@ResultSetMappingInfo(fieldMappings = {
        @FieldMappingInfo(fieldName = "eventTime", columnName = "EVENT_TIME", isTimeStamp = true),
        @FieldMappingInfo(fieldName = "eventType", columnName = "EVENT_ID", isLookupEnum = true, enumType = EventType.class, lookupMethod = "fromEventId"),
        @FieldMappingInfo(fieldName = "tac", columnName = "TAC"),
        @FieldMappingInfo(fieldName = "cId", columnName = "CID"),
        @FieldMappingInfo(fieldName = "cellId", columnName = "CELL_ID"),
        @FieldMappingInfo(fieldName = "eventClassType", columnName = "", isLookupEnum = true, enumType = EventClassType.class, lookupMethod = "valueOf", defaultEnumValue = "CALL_FAILURE"),
        @FieldMappingInfo(fieldName = "cfaEvent", columnName = "CFA_EVENT") })
public interface ICallFailureEventDetailData extends ISessionEventData {
    String getCellId();

    String getCId();

    String getTac();
}
