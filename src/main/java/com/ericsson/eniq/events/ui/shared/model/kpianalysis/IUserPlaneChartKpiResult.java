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
        @FieldMappingInfo(fieldName = "kpiTime", columnName = "KPI_TIME"),
		@FieldMappingInfo(fieldName = "Downlink Throughput Samples", columnName = "DL_TP_SAMPLE"),
        @FieldMappingInfo(fieldName = "Uplink Throughput Samples", columnName = "UL_TP_SAMPLE"),
        @FieldMappingInfo(fieldName = "RTT Terminal Samples", columnName = "RTT_TERM_SAMPLE"),
        @FieldMappingInfo(fieldName = "RTT Server Samples", columnName = "RTT_NET_SAMPLE"),
        @FieldMappingInfo(fieldName = "Packet Loss Terminal Samples", columnName = "PACKET_LOSS_TERM_SAMPLE"),
        @FieldMappingInfo(fieldName = "Packet Loss Server Samples", columnName = "PACKET_LOSS_NET_SAMPLE"),
        @FieldMappingInfo(fieldName = "Downlink Throughput", columnName = "Downlink Throughput"),
        @FieldMappingInfo(fieldName = "Uplink Throughput", columnName = "Uplink Throughput"),
        @FieldMappingInfo(fieldName = "RTT Terminal", columnName = "RTT Terminal"),
        @FieldMappingInfo(fieldName = "RTT Server", columnName = "RTT Network"),
        @FieldMappingInfo(fieldName = "Packet Loss Terminal", columnName = "Packet Loss Terminal"),
        @FieldMappingInfo(fieldName = "Packet Loss Server", columnName = "Packet Loss Network")})
public interface IUserPlaneChartKpiResult extends IEventData {
    Map<String, Object> getKpiResults();
}
