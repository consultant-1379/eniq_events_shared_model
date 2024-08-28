package com.ericsson.eniq.events.ui.shared.model.sessionbrowser.popup;

import com.ericsson.eniq.events.ui.shared.annotations.FieldMappingInfo;
import com.ericsson.eniq.events.ui.shared.annotations.ResultSetMappingInfo;
import com.ericsson.eniq.events.ui.shared.enums.EventType;

import java.util.Map;

/**
 * Popup details for the WCDMA RRC Measurement Report events.
 *
 * @author eeidpar
 * @since 06 2012
 */
@ResultSetMappingInfo(fieldMappings = {
		@FieldMappingInfo(fieldName = "MSISDN", columnName = "MSISDN", groupId = "Subscriber Identity"),
        @FieldMappingInfo(fieldName = "IMSI", columnName = "IMSI", groupId = "Subscriber Identity"),
        @FieldMappingInfo(fieldName = "Network", columnName = "Network", groupId = "Subscriber Identity"),

        @FieldMappingInfo(fieldName = "Event Time", columnName = "EVENT_TIME", groupId = "Event Details", isTimeStamp = true),
        @FieldMappingInfo(fieldName = "Measurement Type", columnName = "MEASUREMENT_TYPE",groupId = "Event Details"),
        
		@FieldMappingInfo(fieldName = "Scrambling Code", columnName = "MEAS_SCRAMBLINGCODE", groupId = "Measured Results", canHaveMultiples = true),
		@FieldMappingInfo(fieldName = "BSIC", columnName = "BSIC", groupId = "Measured Results", canHaveMultiples = true),
		@FieldMappingInfo(fieldName = "Ec/No", columnName = "ECNO", groupId = "Measured Results", canHaveMultiples = true),
		@FieldMappingInfo(fieldName = "RSCP", columnName = "RSCP", groupId = "Measured Results", canHaveMultiples = true),
		@FieldMappingInfo(fieldName = "MEAS_RSLTS_ORD_NO", columnName = "MEAS_RSLTS_ORD_NO", groupId = "Measured Results", canHaveMultiples = true, isHidden=true),
		
        @FieldMappingInfo(fieldName = "Reporting Event", columnName = "REPORTING_EVENT", groupId = "Event Results", canHaveMultiples = true),
        @FieldMappingInfo(fieldName = "Reporting Event Description", columnName = "REPORTING_EVENT_DESC", groupId = "Event Results", canHaveMultiples = true),
        @FieldMappingInfo(fieldName = "Event Results Scrambling Code", columnName = "ERS_SCRAMBLINGCODE", groupId = "Event Results", canHaveMultiples = true),
		@FieldMappingInfo(fieldName = "EVENT_RSLTS_ORD_NO", columnName = "EVENT_RSLTS_ORD_NO", groupId = "Event Results", canHaveMultiples = true, isHidden=true),
        
        
        @FieldMappingInfo(fieldName = "Cell Id 1", columnName = "CELL_ID_1", groupId = "Active Set Details"),
		@FieldMappingInfo(fieldName = "CID 1", columnName = "CID_1", groupId = "Active Set Details"),
		@FieldMappingInfo(fieldName = "RNC Id 1", columnName = "ALTERNATIVE_FDN_1", groupId = "Active Set Details"),
		
		
        @FieldMappingInfo(fieldName = "Cell Id 2", columnName = "CELL_ID_2", groupId = "Active Set Details"),
		@FieldMappingInfo(fieldName = "CID 2", columnName = "CID_2", groupId = "Active Set Details"),
		@FieldMappingInfo(fieldName = "RNC Id 2", columnName = "ALTERNATIVE_FDN_2", groupId = "Active Set Details"),
		
		
        @FieldMappingInfo(fieldName = "Cell Id 3", columnName = "CELL_ID_3", groupId = "Active Set Details"),
		@FieldMappingInfo(fieldName = "CID 3", columnName = "CID_3", groupId = "Active Set Details"),
		@FieldMappingInfo(fieldName = "RNC Id 3", columnName = "ALTERNATIVE_FDN_3", groupId = "Active Set Details"),
		
		
        @FieldMappingInfo(fieldName = "Cell Id 4", columnName = "CELL_ID_4", groupId = "Active Set Details"),
		@FieldMappingInfo(fieldName = "CID 4", columnName = "CID_4", groupId = "Active Set Details"),
		@FieldMappingInfo(fieldName = "RNC Id 4", columnName = "ALTERNATIVE_FDN_4", groupId = "Active Set Details")

        
        })
public interface IRRCMeasurementReportPopupDetails {
    /**
     * Get the details for the rab event as a map of maps. The key for the first map is Category Name, the key
     * @return
     */
    Map<String, Map<String,Object>> getDetails();
}
