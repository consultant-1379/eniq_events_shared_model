package com.ericsson.eniq.events.ui.shared.model.sessionbrowser.popup;

import java.util.Map;

import com.ericsson.eniq.events.ui.shared.annotations.FieldMappingInfo;
import com.ericsson.eniq.events.ui.shared.annotations.ResultSetMappingInfo;
import com.ericsson.eniq.events.ui.shared.model.ConnectionPropertiesKeys;

/**
 * Popup details for the WCDMA Handover Failure Analysis, HSDSCH success event.
 *
 * @author eeidpar
 * @since 06 2012
 */
@ResultSetMappingInfo(fieldMappings = {

        @FieldMappingInfo(fieldName = "MSISDN", columnName = "MSISDN", groupId = "Subscriber Identity"),
        @FieldMappingInfo(fieldName = "IMSI", columnName = "IMSI", groupId = "Subscriber Identity"),
        @FieldMappingInfo(fieldName = "Network", columnName = "NETWORK", groupId = "Subscriber Identity"),

        @FieldMappingInfo(fieldName = "Source Cell Id", columnName = "SOURCE_CELL_ID", groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "Source CID", columnName = "SOURCE_CID", groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "Source RNC", columnName = "SOURCE_CONTROLLER", groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "Source Sec. Serving Hsdsch Cell", columnName = "SRC_C_ID_1_SEC_SERV_HSDSCH_CELL", groupId = "Handover Details"),

        @FieldMappingInfo(fieldName = "Target Cell Id", columnName = "TARGET_CELL_ID", groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "Target CID", columnName = "TARGET_CID", groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "Target RNC", columnName = "TARGET_CONTROLLER", groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "Target Sec. Serving Hsdsch Cell", columnName = "TARG_C_ID_1_SEC_SERV_HSDSCH_CELL", groupId = "Handover Details"),

        @FieldMappingInfo(fieldName = "Ec/No Source Cell (dB)", columnName = "CPICH_EC_NO_SOURCE_CELL", groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "Ec/No Target Cell (dB)", columnName = "CPICH_EC_NO_TARGET_CELL", groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "RSCP Source Cell (dBm)", columnName = "CPICH_RSCP_SOURCE_CELL", groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "RSCP Target Cell (dBm)", columnName = "CPICH_RSCP_TARGET_CELL", groupId = "Handover Details"),

        @FieldMappingInfo(fieldName = "Event Time", columnName = "EVENT_TIME", groupId = "Event Details", isTimeStamp = true),
        @FieldMappingInfo(fieldName = "Event Trigger", columnName = "EVENT_TRIGGER_DESC", groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "RAB Type", columnName = "RABTYPE_DESC", groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "GBR Uplink (bps)", columnName = "GBR_UL", groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "GBR Downlink (bps)", columnName = "GBR_DL", groupId = "Event Details"),

        @FieldMappingInfo(fieldName = "Source Connection Prop", columnName = "SRC_CONN_PROP", groupId = "Event Details", connectionPropertiesKey = ConnectionPropertiesKeys.HFA_SOURCE_CONNECTION_PROPERTIES),
        @FieldMappingInfo(fieldName = "Target Connection Prop", columnName = "TARG_CONN_PROP", groupId = "Event Details", connectionPropertiesKey = ConnectionPropertiesKeys.HFA_TARGET_CONNECTION_PROPERTIES),
        @FieldMappingInfo(fieldName = "Source Connection Prop Ext.", columnName = "SOURCE_CONN_PROPS_EXT", groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Target Connection Prop Ext.", columnName = "TARGET_CONN_PROPS_EXT", groupId = "Event Details"),

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
        @FieldMappingInfo(fieldName = "Source RNC 4", columnName = "SOURCE_ALTERNATIVE_FDN_4", groupId = "Active Set Details") })
public interface IHfaHSDSCHSuccessPopupDetails {
    /**
     * Get the details for the rab event as a map of maps. The key for the first map is Category Name, the key
     * @return
     */
    Map<String, Map<String, Object>> getDetails();
}
