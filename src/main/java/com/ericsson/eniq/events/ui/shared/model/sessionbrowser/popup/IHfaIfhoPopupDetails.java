package com.ericsson.eniq.events.ui.shared.model.sessionbrowser.popup;

import com.ericsson.eniq.events.ui.shared.annotations.FieldMappingInfo;
import com.ericsson.eniq.events.ui.shared.annotations.ResultSetMappingInfo;
import com.ericsson.eniq.events.ui.shared.model.ConnectionPropertiesKeys;

import java.util.Map;

/**
 * Popup details for the WCDMA Handover Failure Analysis, InterFrequencyHandover fail event.
 *
 * @author eeidpar
 * @since 06 2012
 */
@ResultSetMappingInfo(fieldMappings = {
		@FieldMappingInfo(fieldName = "MSISDN", columnName = "MSISDN", groupId = "Subscriber Identity"),
        @FieldMappingInfo(fieldName = "IMSI", columnName = "IMSI", groupId = "Subscriber Identity"),
        @FieldMappingInfo(fieldName = "Terminal", columnName = "TERMINAL", groupId = "Subscriber Identity"),
        @FieldMappingInfo(fieldName = "Network", columnName = "Network", groupId = "Subscriber Identity"),

        @FieldMappingInfo(fieldName = "Source Cell Id", columnName = "SOURCE_CELL_ID",groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "Source CID", columnName = "SOURCE_CID",groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "Source RNC", columnName = "SOURCE_ALTERNATIVE_FDN",groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "Unused Target Cell Id", columnName = "TARGET_CELL_ID",groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "Unused Target CID", columnName = "TARGET_CID",groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "Unused Target Cell RNC", columnName = "TARGET_ALTERNATIVE_FDN",groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "Ec/No Unused Target Cell (dB)", columnName = "CPICH_EC_NU_FREQ_TARGET_CELL",groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "RSCP Unused Target Cell (dBm)", columnName = "RSCP_NU_FREQ_TARGET_CELL",groupId = "Handover Details"),

        
        @FieldMappingInfo(fieldName = "Event Time", columnName = "EVENT_TIME",groupId = "Event Details", isTimeStamp = true),
        @FieldMappingInfo(fieldName = "Source Cell Id 2", columnName = "CELL_ID_2",groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Source CID 2", columnName = "CID_2",groupId = "Event Details"),
		@FieldMappingInfo(fieldName = "Source RNC 2", columnName = "ALTERNATIVE_FDN_2",groupId = "Event Details"),
		
		@FieldMappingInfo(fieldName = "Source Cell Id 3", columnName = "CELL_ID_3",groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Source CID 3", columnName = "CID_3",groupId = "Event Details"),
		@FieldMappingInfo(fieldName = "Source RNC 3", columnName = "ALTERNATIVE_FDN_3",groupId = "Event Details"),
		
		@FieldMappingInfo(fieldName = "Source Cell Id 4", columnName = "CELL_ID_4",groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Source CID 4", columnName = "CID_4",groupId = "Event Details"),
		@FieldMappingInfo(fieldName = "Source RNC 4", columnName = "ALTERNATIVE_FDN_4",groupId = "Event Details"),
		
		@FieldMappingInfo(fieldName = "Event Trigger", columnName = "EVENT_TRIGGER_DESC",groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Result", columnName = "RESULT",groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Failure Reason", columnName = "FAILURE_REASON",groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Source Rab Type", columnName = "SOURCE_RABTYPE",groupId = "Event Details"),
		
        @FieldMappingInfo(fieldName = "Source Connection Prop", columnName = "SOURCE_CONNECTION_PROP",groupId = "Event Details",
                connectionPropertiesKey = ConnectionPropertiesKeys.HFA_SOURCE_CONNECTION_PROPERTIES),
        @FieldMappingInfo(fieldName = "Target Connection Prop", columnName = "TARGET_CONNECTION_PROP",groupId = "Event Details",
                connectionPropertiesKey = ConnectionPropertiesKeys.HFA_TARGET_CONNECTION_PROPERTIES)
      
})
public interface IHfaIfhoPopupDetails {
    /**
     * Get the details for the rab event as a map of maps. The key for the first map is Category Name, the key
     * @return
     */
    Map<String, Map<String,Object>> getDetails();
}
