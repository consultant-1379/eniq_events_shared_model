package com.ericsson.eniq.events.ui.shared.model.sessionbrowser.popup;

import com.ericsson.eniq.events.ui.shared.annotations.FieldMappingInfo;
import com.ericsson.eniq.events.ui.shared.annotations.ResultSetMappingInfo;

import java.util.Map;

/**
 * Popup details for the WCDMA Handover Failure Analysis, InterRadioAccessTechnology Handover fail event.
 *
 * @author eeidpar
 * @since 06 2012
 */
@ResultSetMappingInfo(fieldMappings = {
        @FieldMappingInfo(fieldName = "MSISDN", columnName = "MSISDN", groupId = "Subscriber Identity"),
        @FieldMappingInfo(fieldName = "IMSI", columnName = "IMSI", groupId = "Subscriber Identity"),
        @FieldMappingInfo(fieldName = "Terminal", columnName = "TERMINAL", groupId = "Subscriber Identity"),
        @FieldMappingInfo(fieldName = "Network", columnName = "Network", groupId = "Subscriber Identity"),

        @FieldMappingInfo(fieldName = "Source Cell", columnName = "SOURCE_CELL",groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "Source RAT Id", columnName = "SOURCE_RAT_ID",groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "Source Vendor", columnName = "SOURCE_VENDOR",groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "Source RNC", columnName = "SOURCE_CONTROLLER",groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "Source LAC", columnName = "SOURCE_LAC",groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "Source RAC", columnName = "SOURCE_RAC",groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "Target Cell", columnName = "TARGET_CELL",groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "Target RAT Id", columnName = "TARGET_RAT_ID",groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "Target Vendor", columnName = "TARGET_VENDOR",groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "Target RNC", columnName = "TARGET_CONTROLLER",groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "Target LAC", columnName = "LAC_TARGET_ID",groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "Target PLMN", columnName = "PLMN_TARGET_ID",groupId = "Handover Details"),

        @FieldMappingInfo(fieldName = "Event Type", columnName = "EVENT_ID_DESC",groupId = "Event Summary Details"),
        @FieldMappingInfo(fieldName = "Event Time", columnName = "EVENT_TIME",groupId = "Event Summary Details", isTimeStamp = true),
        @FieldMappingInfo(fieldName = "Event Trigger", columnName = "EVENT_TRIGGER_DESC",groupId = "Event Summary Details"),
        @FieldMappingInfo(fieldName = "Procedure Indicator", columnName = "PROCEDURE_INDICATOR_DESC",groupId = "Event Summary Details"),
        @FieldMappingInfo(fieldName = "Cause Value", columnName = "CAUSE_VALUE_DESC",groupId = "Event Summary Details"),
        @FieldMappingInfo(fieldName = "Sub Cause Value", columnName = "SUB_CAUSE_VALUE_DESC",groupId = "Event Summary Details"),
        @FieldMappingInfo(fieldName = "Evaluation Case", columnName = "EVALUATION_CASE_DESC",groupId = "Event Summary Details"),
        @FieldMappingInfo(fieldName = "Exception Class", columnName = "EXCEPTION_CLASS_DESC",groupId = "Event Summary Details"),
        @FieldMappingInfo(fieldName = "Source Configuration", columnName = "SOURCE_CONF",groupId = "Event Summary Details"),

        @FieldMappingInfo(fieldName = "CPICH Ec/No Source Cell (dB)", columnName = "CPICH_EC_NO_SOURCE_CELL",groupId = "Event Summary Details"),
        @FieldMappingInfo(fieldName = "RSCP Source Cell (dBm)", columnName = "RSCP_SOURCE_CELL",groupId = "Event Summary Details"),
        @FieldMappingInfo(fieldName = "RSSI (dBm)", columnName = "RSSI",groupId = "Event Summary Details"),
        @FieldMappingInfo(fieldName = "Target Configuration", columnName = "TARGET_CONF",groupId = "Event Summary Details"),
        @FieldMappingInfo(fieldName = "Serving HSDSCH Rnc Id", columnName = "CRNC_ID_SERV_HSDSCH_CELL",groupId = "Event Summary Details"),
        @FieldMappingInfo(fieldName = "Serving HSDSCH_Cell Id", columnName = "C_ID_SERV_HSDSCH_CELL",groupId = "Event Summary Details"),
        @FieldMappingInfo(fieldName = "C_ID_1_SS_HSDSCH_CELL", columnName = "C_ID_1_SS_HSDSCH_CELL",groupId = "Event Summary Details"),
        @FieldMappingInfo(fieldName = "UE Context", columnName = "UE_CONTEXT",groupId = "Event Summary Details"),
        @FieldMappingInfo(fieldName = "RNC Module Id", columnName = "RNC_MODULE_ID",groupId = "Event Summary Details"),
        @FieldMappingInfo(fieldName = "Ne Version", columnName = "NE_VERSION",groupId = "Event Summary Details"),
        @FieldMappingInfo(fieldName = "Scanner Id", columnName = "SCANNER_ID",groupId = "Event Summary Details")
        })
public interface IHfaIRatPopupDetails {
    /**
     * Get the details for the rab event as a map of maps. The key for the first map is Category Name, the key
     * @return
     */
    Map<String, Map<String,Object>> getDetails();
}
