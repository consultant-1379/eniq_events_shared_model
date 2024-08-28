package com.ericsson.eniq.events.ui.shared.model.sessionbrowser.popup;

import java.util.Map;

import com.ericsson.eniq.events.ui.shared.annotations.FieldMappingInfo;
import com.ericsson.eniq.events.ui.shared.annotations.ResultSetMappingInfo;
import com.ericsson.eniq.events.ui.shared.model.ConnectionPropertiesKeys;

/**
 * Popup details for the WCDMA Handover Failure Analysis, HardHandover fail event.
 *
 * @author eeidpar
 * @since 06 2012
 */
@ResultSetMappingInfo(fieldMappings = {
        /**
         * Group: Subscriber Identity.
         */
		@FieldMappingInfo(fieldName = "MSISDN", columnName = "MSISDN", groupId = "Subscriber Identity"),
        @FieldMappingInfo(fieldName = "IMSI", columnName = "IMSI", groupId = "Subscriber Identity"),
        @FieldMappingInfo(fieldName = "Network", columnName = "NETWORK", groupId = "Subscriber Identity"),
        /**
         * Group: Handover Details.
         */

        @FieldMappingInfo(fieldName = "Source Rab Type", columnName = "SOURCE_RAB", groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "Wanted Rab Type", columnName = "WANTED_RAB", groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "Target Rab Type", columnName = "TARGET_RAB", groupId = "Handover Details"),

        @FieldMappingInfo(fieldName = "Source Cell ID 1", columnName = "SOURCE_CELL_ID", groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "Source CID 1", columnName = "SOURCE_CID", groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "Source RNC 1", columnName = "SOURCE_ALTERNATIVE_FDN", groupId = "Handover Details"),

        /* Value (e.g.): 61253 */
        @FieldMappingInfo(fieldName = "Serving HSDSCH CID", columnName = "C_ID_SERV_HSDSCH_CELL", groupId = "Handover Details"),

        /* PLMN - Public Land Mobile Network. Value (e.g.): MCC.MNC*/
        @FieldMappingInfo(fieldName = "Target PLMN", columnName = "TARGET_PLMN", groupId = "Handover Details"),

        /* LAC - Location Area Code. Value (e.g.): 3 */
        @FieldMappingInfo(fieldName = "Target Location Area", columnName = "TARGET_LAC", groupId = "Handover Details"),

        @FieldMappingInfo(fieldName = "Target Cell Id", columnName = "TARGET_CELL_ID", groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "Target CID", columnName = "TARGET_CID", groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "Target Controller", columnName = "TARGET_CONTROLLER", groupId = "Handover Details"),
		
		@FieldMappingInfo(fieldName = "Ec/No Cell 1 (dB)", columnName = "ECNO_CELL_1", groupId = "Handover Details"),
		@FieldMappingInfo(fieldName = "RSCP Cell 1 (dBm)", columnName = "RSCP_CELL_1", groupId = "Handover Details"),

        /* Value (e.g.): 63 */
        @FieldMappingInfo(fieldName = "Target Cell RSSI (dBm)", columnName = "TARGET_CELL_RSSI", groupId = "Handover Details"),

        /* Value (e.g.): 26 */
        @FieldMappingInfo(fieldName = "Target Cell Ec/No (dB)", columnName = "TARGET_CELL_ECNO", groupId = "Handover Details"),
        @FieldMappingInfo(fieldName = "Target Cell RSCP (dBm)", columnName = "TARGET_CELL_RSCP", groupId = "Handover Details"),
        /**
         * Group: Event Summary Details.
         */

        /* Value (e.g.): 31-JAN-2012 10:56:12.xx */
        @FieldMappingInfo(fieldName = "Event Time", columnName = "EVENT_TIME", groupId = "Event Details", isTimeStamp = true),

        /* Value (e.g.): NOT_APPLICABLE */
        @FieldMappingInfo(fieldName = "Procedure Indicator", columnName = "PROCEDURE_INDICATOR_DESC", groupId = "Event Details"),

        /* Value (e.g.): GAN_MOBILITY */
        @FieldMappingInfo(fieldName = "Evaluation Case", columnName = "EVALUATION_CASE_DESC", groupId = "Event Details"),

        /* Value (e.g.): NO_FACH_DCH_HS_USERS_LICENSE_LIMIT_EXCEEDED */
        @FieldMappingInfo(fieldName = "Source Connection Properties", columnName = "SOURCE_CONN_PROPERTIES", groupId = "Event Details", connectionPropertiesKey = ConnectionPropertiesKeys.HFA_SOURCE_CONNECTION_PROPERTIES),
        @FieldMappingInfo(fieldName = "Wanted Connection Properties", columnName = "WANTED_CONN_PROPERTIES", groupId = "Event Details", connectionPropertiesKey = ConnectionPropertiesKeys.HFA_WANTED_CONNECTION_PROPERTIES),
        @FieldMappingInfo(fieldName = "Target Connection Properties", columnName = "TARGET_CONN_PROPERTIES", groupId = "Event Details", connectionPropertiesKey = ConnectionPropertiesKeys.HFA_TARGET_CONNECTION_PROPERTIES),

        @FieldMappingInfo(fieldName = "Source Cell Id 2", columnName = "CELL_ID_2", groupId = "Active Set Details"),
        @FieldMappingInfo(fieldName = "Source CID 2", columnName = "CID_2", groupId = "Active Set Details"),
        @FieldMappingInfo(fieldName = "Source RNC 2", columnName = "ALTERNATIVE_FDN_2", groupId = "Active Set Details"),

        @FieldMappingInfo(fieldName = "Source Cell Id 3", columnName = "CELL_ID_3", groupId = "Active Set Details"),
        @FieldMappingInfo(fieldName = "Source CID 3", columnName = "CID_3", groupId = "Active Set Details"),
        @FieldMappingInfo(fieldName = "Source RNC 3", columnName = "ALTERNATIVE_FDN_3", groupId = "Active Set Details"),

        @FieldMappingInfo(fieldName = "Source Cell Id 4", columnName = "CELL_ID_4", groupId = "Active Set Details"),
        @FieldMappingInfo(fieldName = "Source CID 4", columnName = "CID_4", groupId = "Active Set Details"),
        @FieldMappingInfo(fieldName = "Source RNC 4", columnName = "ALTERNATIVE_FDN_4", groupId = "Active Set Details"),

        @FieldMappingInfo(fieldName = "Ec/No Cell 2 (dB)", columnName = "ECNO_CELL_2", groupId = "Active Set Details"),
        @FieldMappingInfo(fieldName = "Ec/No Cell 3 (dB)", columnName = "ECNO_CELL_3", groupId = "Active Set Details"),
        @FieldMappingInfo(fieldName = "Ec/No Cell 4 (dB)", columnName = "ECNO_CELL_4", groupId = "Active Set Details"),
		
        @FieldMappingInfo(fieldName = "RSCP Cell 2 (dBm)", columnName = "RSCP_CELL_2", groupId = "Active Set Details"),
        @FieldMappingInfo(fieldName = "RSCP Cell 3 (dBm)", columnName = "RSCP_CELL_3", groupId = "Active Set Details"),
        @FieldMappingInfo(fieldName = "RSCP Cell 4 (dBm)", columnName = "RSCP_CELL_4", groupId = "Active Set Details")

        

})
public interface IHhoPopupDetails {
    /**
     * Get the details for the rab event as a map of maps. The key for the first map is Category Name, the key
     * @return
     */
    Map<String, Map<String, Object>> getDetails();
}
