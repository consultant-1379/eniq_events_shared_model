package com.ericsson.eniq.events.ui.shared.model.sessionbrowser.popup;

import com.ericsson.eniq.events.ui.shared.annotations.FieldMappingInfo;
import com.ericsson.eniq.events.ui.shared.annotations.ResultSetMappingInfo;
import com.ericsson.eniq.events.ui.shared.model.ConnectionPropertiesKeys;

import java.util.Map;

/**
 * Popup details for the WCDMA Call Failure Analysis, InternalSystemRelease event.
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

        @FieldMappingInfo(fieldName = "Rab Type", columnName = "SOURCE_RAB_TYPE",groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Rab Type (Attempted Reconfigure)", columnName = "TARGET_RAB_TYPE",groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Trigger Point", columnName = "TRIGGER_POINT",groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "UTRAN RANAP Cause", columnName = "UTRAN_RANAP_CAUSE",groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "CN RANAP Cause", columnName = "CN_RANAP_CAUSE",groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "GBR Uplink (bps)", columnName = "GBR_UL",groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "GBR Downlink (bps)", columnName = "GBR_DL",groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Serving HSDSCH Cell Id", columnName = "C_ID_SERV_HSDSCH_CELL_ID",groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Serving HSDSCH CID", columnName = "C_ID_SERV_HSDSCH_CELL",groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Serving HSDSCH Cell RNC Id", columnName = "CRNC_ID_SERV_HSDSCH_CELL",groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Procedure Indicator", columnName = "PROCEDURE_INDICATOR_DESC",groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Cause Value", columnName = "CAUSE_VALUE_DESC",groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Extended Cause Value", columnName = "EXTENDED_CAUSE_VALUE_DESC",groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Evaluation Case", columnName = "EVALUATION_CASE_DESC",groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Exception Class", columnName = "EXCEPTION_CLASS_DESC",groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Disconnection Description", columnName = "DISCONNECTION_DESC",groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Disconnection Code", columnName = "DISCONNECTION_CODE",groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Disconnection Sub Code", columnName = "DISCONNECTION_SUBCODE",groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Source Connection Prop", columnName = "SOURCE_CONNECTION_PROPERTIES",groupId = "Event Details",
                connectionPropertiesKey = ConnectionPropertiesKeys.CFA_SOURCE_CONNECTION_PROPERTIES),
        @FieldMappingInfo(fieldName = "Target Connection Prop", columnName = "TARGET_CONNECTION_PROPERTIES",groupId = "Event Details",
                connectionPropertiesKey = ConnectionPropertiesKeys.CFA_TARGET_CONNECTION_PROPERTIES),
        @FieldMappingInfo(fieldName = "Wanted Connection Prop", columnName = "WANTED_CONNECTION_PROPERTIES",groupId = "Event Details",
                connectionPropertiesKey = ConnectionPropertiesKeys.CFA_WANTED_CONNECTION_PROPERTIES),

        @FieldMappingInfo(fieldName = "RSCP Cell 1 (dBm)", columnName = "RSCP_CELL_1",groupId = "Active Set Measurements"),
        @FieldMappingInfo(fieldName = "RSCP Cell 2 (dBm)", columnName = "RSCP_CELL_2",groupId = "Active Set Measurements"),
        @FieldMappingInfo(fieldName = "RSCP Cell 3 (dBm)", columnName = "RSCP_CELL_3",groupId = "Active Set Measurements"),
        @FieldMappingInfo(fieldName = "RSCP Cell 4 (dBm)", columnName = "RSCP_CELL_4",groupId = "Active Set Measurements"),
        @FieldMappingInfo(fieldName = "RSCP Cell 1 Added Cell (dBm)", columnName = "RSCP_CELL_1_ADDED_CELL",groupId = "Active Set Measurements"),
        @FieldMappingInfo(fieldName = "CPICH Ec/No Cell 1 (dB)", columnName = "CPICH_EC_NO_CELL_1",groupId = "Active Set Measurements"),
        @FieldMappingInfo(fieldName = "CPICH Ec/No Cell 2 (dB)", columnName = "CPICH_EC_NO_CELL_2",groupId = "Active Set Measurements"),
        @FieldMappingInfo(fieldName = "CPICH Ec/No Cell 3 (dB)", columnName = "CPICH_EC_NO_CELL_3",groupId = "Active Set Measurements"),
        @FieldMappingInfo(fieldName = "CPICH Ec/No Cell 4 (dB)", columnName = "CPICH_EC_NO_CELL_4",groupId = "Active Set Measurements"),
        @FieldMappingInfo(fieldName = "CPICH Ec/No Added Cell (dB)", columnName = "CPICH_EC_NO_ADDED_CELL",groupId = "Active Set Measurements"),
        @FieldMappingInfo(fieldName = "Scambling Code Cell 1", columnName = "SCRAMBLING_CODE_CELL_1",groupId = "Active Set Measurements"),
        @FieldMappingInfo(fieldName = "Scambling Code Cell 2", columnName = "SCRAMBLING_CODE_CELL_2",groupId = "Active Set Measurements"),
        @FieldMappingInfo(fieldName = "Scambling Code Cell 3", columnName = "SCRAMBLING_CODE_CELL_3",groupId = "Active Set Measurements"),
        @FieldMappingInfo(fieldName = "Scambling Code Cell 4", columnName = "SCRAMBLING_CODE_CELL_4",groupId = "Active Set Measurements"),
        @FieldMappingInfo(fieldName = "Scambling Code Added Cell", columnName = "SCRAMBLING_CODE_ADDED_CELL",groupId = "Active Set Measurements"),
        @FieldMappingInfo(fieldName = "UL Interference Cell 1 (dB)", columnName = "UL_INT_CELL1",groupId = "Active Set Measurements"),
        @FieldMappingInfo(fieldName = "UL Interference Cell 2 (dB)", columnName = "UL_INT_CELL2",groupId = "Active Set Measurements"),
        @FieldMappingInfo(fieldName = "UL Interference Cell 3 (dB)", columnName = "UL_INT_CELL3",groupId = "Active Set Measurements"),
        @FieldMappingInfo(fieldName = "UL Interference Cell 4 (dB)", columnName = "UL_INT_CELL4",groupId = "Active Set Measurements")
        })


public interface ICfaSystemReleasePopupDetails {
    /**
     * Get the details for the rab event as a map of maps. The key for the first map is Category Name, the key
     * @return
     */
    Map<String, Map<String,Object>> getDetails();
}
