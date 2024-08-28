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
        @FieldMappingInfo(fieldName = "kpiTime", columnName = "KPI_TIME"),
        @FieldMappingInfo(fieldName = "Attach Success Rate", columnName = "Attach Success Rate"),
        @FieldMappingInfo(fieldName = "PDP Context Activation Success Rate", columnName = "PDP Context Activation Success Rate"),
        @FieldMappingInfo(fieldName = "RAU Success Rate", columnName = "RAU Success Rate"),
        @FieldMappingInfo(fieldName = "ISRAU Success Rate", columnName = "ISRAU Success Rate"),
        @FieldMappingInfo(fieldName = "PDP Context Cutoff Ratio", columnName = "PDP Context Cutoff Ratio"),
        @FieldMappingInfo(fieldName = "Detach Success Rate", columnName = "Detach Success Rate"),
        @FieldMappingInfo(fieldName = "Service Request Failure Ratio", columnName = "Service Request Failure Ratio"),
        @FieldMappingInfo(fieldName = "Paging Failure Ratio", columnName = "Paging Failure Ratio")})
public interface ISGEHChartKpiResult extends IEventData {
    Map<String, Object> getKpiResults();
}
