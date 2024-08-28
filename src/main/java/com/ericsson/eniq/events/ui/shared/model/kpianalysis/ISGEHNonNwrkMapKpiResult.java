package com.ericsson.eniq.events.ui.shared.model.kpianalysis;

import com.ericsson.eniq.events.ui.shared.annotations.FieldMappingInfo;
import com.ericsson.eniq.events.ui.shared.annotations.ResultSetMappingInfo;
import com.ericsson.eniq.events.ui.shared.model.sessionbrowser.details.IEventData;

import java.util.Map;

/**
 * <ul>Notes:
 * <li>Do NOT change <tt>fieldName</tt>s without change in
 * {@link com.ericsson.eniq.events.ui.shared.enums.SGEHKpiType}.</li>
 * <li>This interface is used by EE server side.</li>
 * </ul>
 *
 * @author eeidpar
 * @see com.ericsson.eniq.events.ui.shared.enums.SGEHKpiType
 * @since 02 2012
 */
@ResultSetMappingInfo(fieldMappings = {
        @FieldMappingInfo(fieldName = "cellId", columnName = "HIERARCHY_1"),
        @FieldMappingInfo(fieldName = "rat", columnName = "RAT"),
        @FieldMappingInfo(fieldName = "vendor", columnName = "VENDOR"),
        @FieldMappingInfo(fieldName = "rncName", columnName = "HIERARCHY_3"),
        @FieldMappingInfo(fieldName = "cellName", columnName = "CELL_ID"),
        @FieldMappingInfo(fieldName = "Attach Success Rate", columnName = "Attach Success Rate", groupId = "kpis"),
        @FieldMappingInfo(fieldName = "PDP Context Activation Success Rate", columnName = "PDP Context Activation Success Rate", groupId = "kpis"),
        @FieldMappingInfo(fieldName = "RAU Success Rate", columnName = "RAU Success Rate", groupId = "kpis"),
        @FieldMappingInfo(fieldName = "ISRAU Success Rate", columnName = "ISRAU Success Rate", groupId = "kpis"),
        @FieldMappingInfo(fieldName = "PDP Context Cutoff Ratio", columnName = "PDP Context Cutoff Ratio", groupId = "kpis"),
        @FieldMappingInfo(fieldName = "Detach Success Rate", columnName = "Detach Success Rate", groupId = "kpis"),
        @FieldMappingInfo(fieldName = "Service Request Failure Ratio", columnName = "Service Request Failure Ratio", groupId = "kpis"),
        @FieldMappingInfo(fieldName = "Paging Failure Ratio", columnName = "Paging Failure Ratio", groupId = "kpis")
})

        public interface ISGEHNonNwrkMapKpiResult extends IEventData {
    Map<String, Object> getKpiResults();
}
