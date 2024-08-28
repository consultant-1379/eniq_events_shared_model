package com.ericsson.eniq.events.ui.shared.model.kpianalysis;

import com.ericsson.eniq.events.ui.shared.annotations.FieldMappingInfo;
import com.ericsson.eniq.events.ui.shared.annotations.ResultSetMappingInfo;
import com.ericsson.eniq.events.ui.shared.model.sessionbrowser.details.IEventData;

import java.util.Map;

/**
 * <ul>Notes:
 * <li>Do NOT change <tt>fieldName</tt>s without change in
 * {@link com.ericsson.eniq.events.ui.shared.enums.UpdKpiType}.</li>
 * <li>This interface is used by EE server side.</li>
 * </ul>
 *
 * @author eeidpar
 * @see com.ericsson.eniq.events.ui.shared.enums.UpdKpiType
 * @since 02 2012
 */
@ResultSetMappingInfo(fieldMappings = {
        @FieldMappingInfo(fieldName = "Value", columnName = "value"),
        @FieldMappingInfo(fieldName = "DrillBy", columnName = "drillBy"),
        @FieldMappingInfo(fieldName = "Samples", columnName = "samples")})
public interface IUserPlaneChartDrillKpiResult extends IEventData {
    Map<String, Object> getKpiResults();
}
