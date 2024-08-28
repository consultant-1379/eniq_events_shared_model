package com.ericsson.eniq.events.ui.shared.model.sessionbrowser.summary;

import com.ericsson.eniq.events.ui.shared.annotations.FieldMappingInfo;
import com.ericsson.eniq.events.ui.shared.annotations.ResultSetMappingInfo;

/**
 * Created by IntelliJ IDEA.
 * User: eeidpar
 * Date: 22/02/12
 * Time: 09:06
 * To change this template use File | Settings | File Templates.
 */
@ResultSetMappingInfo(fieldMappings = {
        @FieldMappingInfo(fieldName = "tcpFlows", columnName = "TCP_FLOWS", outputAsString = true),
        @FieldMappingInfo(fieldName = "totalDataVolumeDownlink", columnName = "TOTAL_TP_DL", outputAsString = true),
        @FieldMappingInfo(fieldName = "totalDataVolumeUplink", columnName = "TOTAL_TP_UL", outputAsString = true),
        @FieldMappingInfo(fieldName = "averageThroughputDownlink", columnName = "AVG_TP_DL", outputAsString = true),
        @FieldMappingInfo(fieldName = "averageThroughputUplink", columnName = "AVG_TP_UL", outputAsString = true),
        @FieldMappingInfo(fieldName = "peakThroughputDownlink", columnName = "PEAK_TP_DL", outputAsString = true),
        @FieldMappingInfo(fieldName = "peakThroughputUplink", columnName = "PEAK_TP_UL", outputAsString = true),
        @FieldMappingInfo(fieldName = "peakHostDownlink", columnName = "PEAK_HOST_DL"),
        @FieldMappingInfo(fieldName = "peakHostUplink", columnName = "PEAK_HOST_UL"),
        @FieldMappingInfo(fieldName = "averageUeServerRTT", columnName = "AVG_RTT_UE_SERVER", outputAsString = true),
        @FieldMappingInfo(fieldName = "averageUeGnRTT", columnName = "AVG_RTT_UE_GN", outputAsString = true),
        @FieldMappingInfo(fieldName = "averageGnServerRTT", columnName = "AVG_RTT_GN_SERVER", outputAsString = true),
        @FieldMappingInfo(fieldName = "peakUeServerRTT", columnName = "PEAK_RTT_UE_SERVER", outputAsString = true),
        @FieldMappingInfo(fieldName = "peakUeGnRTT", columnName = "PEAK_RTT_UE_GN", outputAsString = true),
        @FieldMappingInfo(fieldName = "peakGnServerRTT", columnName = "PEAK_RTT_GN_SERVER", outputAsString = true),
        @FieldMappingInfo(fieldName = "worstHostRTT", columnName = "HIGHEST_RTT_HOST"),
        @FieldMappingInfo(fieldName = "maxPacketLossTerminal", columnName = "MAX_PACKET_LOSS_TERMINAL", outputAsString = true),
        @FieldMappingInfo(fieldName = "maxPacketLossServer", columnName = "MAX_PACKET_LOSS_SERVER", outputAsString = true),
        @FieldMappingInfo(fieldName = "maxPacketLossTerminalURI", columnName = "MAX_PACKET_LOSS_TERMINAL_URI", outputAsString = true),
        @FieldMappingInfo(fieldName = "maxPacketLossServerURI", columnName = "MAX_PACKET_LOSS_SERVER_URI", outputAsString = true) })
public interface ITcpPerformanceSummary {
    String getTcpFlows();

    String getTotalDataVolumeDownlink();

    String getTotalDataVolumeUplink();

    String getAverageThroughputDownlink();

    String getAverageThroughputUplink();

    String getPeakThroughputDownlink();

    String getPeakThroughputUplink();

    String getPeakHostDownlink();

    String getPeakHostUplink();

    String getAverageUeServerRTT();

    String getAverageUeGnRTT();

    String getAverageGnServerRTT();

    String getPeakUeServerRTT();

    String getPeakUeGnRTT();

    String getPeakGnServerRTT();

    String getWorstHostRTT();
}