package com.ericsson.eniq.events.ui.shared.model.sessionbrowser.popup;

import com.ericsson.eniq.events.ui.shared.annotations.FieldMappingInfo;
import com.ericsson.eniq.events.ui.shared.annotations.ResultSetMappingInfo;
import com.ericsson.eniq.events.ui.shared.model.ConnectionPropertiesKeys;

import java.util.Map;

/**
 * Popup details for the WCDMA Call Failure Analysis, CallSetupFailure event.
 *
 * @author eeidpar
 * @since 06 2012
 */
@ResultSetMappingInfo(fieldMappings = {
        @FieldMappingInfo(fieldName = "MSISDN", columnName = "MSISDN", groupId = "Subscriber Identity"),
        @FieldMappingInfo(fieldName = "IMSI", columnName = "IMSI", groupId = "Subscriber Identity"),
        @FieldMappingInfo(fieldName = "Terminal", columnName = "TERMINAL", groupId = "Subscriber Identity"),
        @FieldMappingInfo(fieldName = "Network", columnName = "Network", groupId = "Subscriber Identity"),

        @FieldMappingInfo(fieldName = "Controller", columnName = "Controller",groupId = "Network Location"),
        @FieldMappingInfo(fieldName = "PLMN", columnName = "PLMN",groupId = "Network Location"),
        @FieldMappingInfo(fieldName = "Location Area", columnName = "Location_Area",groupId = "Network Location"),
        @FieldMappingInfo(fieldName = "Routing Area", columnName = "Routing_Area",groupId = "Network Location"),
        @FieldMappingInfo(fieldName = "Cell Id", columnName = "CELL_ID",groupId = "Network Location"),
        @FieldMappingInfo(fieldName = "CID", columnName = "CID",groupId = "Network Location"),

        @FieldMappingInfo(fieldName = "Event Time", columnName = "EVENT_TIME",groupId = "Event Details", isTimeStamp = true),
        @FieldMappingInfo(fieldName = "Source Rab Type", columnName = "SOURCE_RAB_TYPE",groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Target Rab Type", columnName = "TARGET_RAB_TYPE",groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Wanted Rab Type", columnName = "WANTED_RAB_TYPE",groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Trigger Point", columnName = "TRIGGER_POINT",groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "UTRAN RANAP Cause", columnName = "UTRAN_RANAP_CAUSE",groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Data in DL RLC Buffers", columnName = "DATA_IN_DL_RLC_BUFFERS",groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Serving HSDSCH Cell Id", columnName = "C_ID_SERV_HSDSCH_CELL_ID",groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Serving HSDSCH CID", columnName = "C_ID_SERV_HSDSCH_CELL",groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Serving HSDSCH Cell RNC Id", columnName = "CRNC_ID_SERV_HSDSCH_CELL",groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Originating State", columnName = "ORIGINATING_STATE",groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Procedure Indicator", columnName = "PROCEDURE_INDICATOR_DESC",groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Cause Value", columnName = "CAUSE_VALUE_DESC",groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Extended Cause Value", columnName = "EXTENDED_CAUSE_VALUE_DESC",groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Evaluation Case", columnName = "EVALUATION_CASE_DESC",groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Exception Class", columnName = "EXCEPTION_CLASS_DESC",groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "RRC Establishment Cause", columnName = "RRC_ESTABLISHMENT_CAUSE",groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Cello AAL2NCI Reject Reason", columnName = "CELLO_AAL2NCI_REJECT_REASON",groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Source Connection Prop", columnName = "SOURCE_CONNECTION_PROPERTIES",groupId = "Event Details",
                connectionPropertiesKey = ConnectionPropertiesKeys.CFA_SOURCE_CONNECTION_PROPERTIES),
        @FieldMappingInfo(fieldName = "Target Connection Prop", columnName = "TARGET_CONNECTION_PROPERTIES",groupId = "Event Details",
                connectionPropertiesKey = ConnectionPropertiesKeys.CFA_TARGET_CONNECTION_PROPERTIES),
        @FieldMappingInfo(fieldName = "Wanted Connection Prop", columnName = "WANTED_CONNECTION_PROPERTIES",groupId = "Event Details",
                connectionPropertiesKey = ConnectionPropertiesKeys.CFA_WANTED_CONNECTION_PROPERTIES)

        })

/*@FieldMappingInfo(fieldName = "Last Reported RSCP", columnName = "LAST_RSCP_VALUE",groupId = "Radio Conditions"),
@FieldMappingInfo(fieldName = "Last Reported RSCP Time", columnName = "LAST_RSCP_TIMESTAMP",groupId = "Radio Conditions"),
@FieldMappingInfo(fieldName = "Last Reported Ec/No", columnName = "LAST_ECNO_VALUE",groupId = "Radio Conditions"),
@FieldMappingInfo(fieldName = "Last Reported Ec/No Time", columnName = "LAST_ECNO_TIMESTAMP",groupId = "Radio Conditions")  */
public interface ICfaCallSetupFailurePopupDetails {
    /**
     * Get the details for the rab event as a map of maps. The key for the first map is Category Name, the key
     * @return
     */
    Map<String, Map<String,Object>> getDetails();
}
