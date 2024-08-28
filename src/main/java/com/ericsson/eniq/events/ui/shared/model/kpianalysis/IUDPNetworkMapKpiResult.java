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
        @FieldMappingInfo(fieldName = "rat", columnName = "RAT"),
        @FieldMappingInfo(fieldName = "vendor", columnName = "VENDOR"),
        @FieldMappingInfo(fieldName = "rncName", columnName = "HIERARCHY_3"),
        @FieldMappingInfo(fieldName = "Uplink Throughput", columnName = "Uplink Throughput", groupId = "kpis"),
        @FieldMappingInfo(fieldName = "Downlink Throughput", columnName = "Downlink Throughput", groupId = "kpis"),
        @FieldMappingInfo(fieldName = "RTT Terminal", columnName = "RTT Terminal", groupId = "kpis"),
        @FieldMappingInfo(fieldName = "RTT Server", columnName = "RTT Network", groupId = "kpis"),
        @FieldMappingInfo(fieldName = "Packet Loss Terminal", columnName = "Packet Loss Terminal", groupId = "kpis"),
        @FieldMappingInfo(fieldName = "Packet Loss Server", columnName = "Packet Loss Network", groupId = "kpis")

})




    public interface IUDPNetworkMapKpiResult extends IEventData {
     Map<String, Object> getKpiResults();
}
