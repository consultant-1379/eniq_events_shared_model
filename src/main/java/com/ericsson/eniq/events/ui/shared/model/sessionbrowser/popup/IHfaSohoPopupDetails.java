package com.ericsson.eniq.events.ui.shared.model.sessionbrowser.popup;

import java.util.Map;

import com.ericsson.eniq.events.ui.shared.annotations.FieldMappingInfo;
import com.ericsson.eniq.events.ui.shared.annotations.ResultSetMappingInfo;
import com.ericsson.eniq.events.ui.shared.model.ConnectionPropertiesKeys;

/**
 * Popup details for the WCDMA Handover Failure Analysis, SoftHandover fail event.
 *
 * @author eeidpar
 * @since 06 2012
 */
@ResultSetMappingInfo(fieldMappings = {
        @FieldMappingInfo(fieldName = "MSISDN", columnName = "MSISDN", groupId = "Subscriber Identity"),
        @FieldMappingInfo(fieldName = "IMSI", columnName = "IMSI", groupId = "Subscriber Identity"),
        @FieldMappingInfo(fieldName = "Terminal", columnName = "TERMINAL", groupId = "Subscriber Identity"),
        @FieldMappingInfo(fieldName = "Network", columnName = "Network", groupId = "Subscriber Identity"),

        @FieldMappingInfo(fieldName = "Handover Type", columnName = "HANDOVER_TYPE_DESC", groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "Source Cell Id", columnName = "SOURCE_CELL_ID", groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "Source CID", columnName = "SOURCE_CID", groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "Source RNC", columnName = "SOURCE_CONTROLLER", groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "Source LAC", columnName = "SOURCE_LAC", groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "Source RAC", columnName = "SOURCE_RAC", groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "Source Sec. Serving HSDSCH CID", columnName = "SRC_C_ID_1_SS_HSDSCH_CELL", groupId = "Handover Details"),

        @FieldMappingInfo(fieldName = "Target Cell Id", columnName = "TARGET_CELL_ID", groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "Target CID", columnName = "TARGET_CID", groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "Target RNC", columnName = "TARGET_CONTROLLER", groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "Ec/No Evaluation Cell (dB)", columnName = "CPICH_EC_NO_EVAL_CELL", groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "RSCP Evaluation Cell (dBm)", columnName = "RSCP_EVAL_CELL", groupId = "Handover Details"),

        @FieldMappingInfo(fieldName = "Event Time", columnName = "EVENT_TIME", groupId = "Event Details", isTimeStamp = true),
        @FieldMappingInfo(fieldName = "Event Trigger", columnName = "EVENT_TRIGGER_DESC", groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Cause Value", columnName = "CAUSE_VALUE_DESC", groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Sub Cause Value", columnName = "SUB_CAUSE_VALUE_DESC", groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Source Connection Prop", columnName = "SOURCE_CONNECTION_PROP", groupId = "Event Details", connectionPropertiesKey = ConnectionPropertiesKeys.HFA_SOURCE_CONNECTION_PROPERTIES),

        @FieldMappingInfo(fieldName = "Source Cell ID 1", columnName = "SOURCE_CELL_ID_1", groupId = "Active Set Details"),
        @FieldMappingInfo(fieldName = "Source CID 1", columnName = "SOURCE_CID_1", groupId = "Active Set Details"),
        @FieldMappingInfo(fieldName = "Source RNC 1", columnName = "SOURCE_ALTERNATIVE_FDN_1", groupId = "Active Set Details"),
        @FieldMappingInfo(fieldName = "Source Cell ID 2", columnName = "SOURCE_CELL_ID_2", groupId = "Active Set Details"),
        @FieldMappingInfo(fieldName = "Source CID 2", columnName = "SOURCE_CID_2", groupId = "Active Set Details"),
        @FieldMappingInfo(fieldName = "Source RNC 2", columnName = "SOURCE_ALTERNATIVE_FDN_2", groupId = "Active Set Details"),
        @FieldMappingInfo(fieldName = "Source Cell ID 3", columnName = "SOURCE_CELL_ID_3", groupId = "Active Set Details"),
        @FieldMappingInfo(fieldName = "Source CID 3", columnName = "SOURCE_CID_3", groupId = "Active Set Details"),
        @FieldMappingInfo(fieldName = "Source RNC 3", columnName = "SOURCE_ALTERNATIVE_FDN_3", groupId = "Active Set Details"),
        @FieldMappingInfo(fieldName = "Source Cell ID 4", columnName = "SOURCE_CELL_ID_4", groupId = "Active Set Details"),
        @FieldMappingInfo(fieldName = "Source CID 4", columnName = "SOURCE_CID_4", groupId = "Active Set Details"),
        @FieldMappingInfo(fieldName = "Source RNC 4", columnName = "SOURCE_ALTERNATIVE_FDN_4", groupId = "Active Set Details")

})
public interface IHfaSohoPopupDetails {
    /**
     * Get the details for the rab event as a map of maps. The key for the first map is Category Name, the key
     * @return
     */
    Map<String, Map<String, Object>> getDetails();
}
