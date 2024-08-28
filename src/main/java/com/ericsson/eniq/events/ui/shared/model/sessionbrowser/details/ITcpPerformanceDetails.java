package com.ericsson.eniq.events.ui.shared.model.sessionbrowser.details;

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
        @FieldMappingInfo(fieldName = "eventTime", columnName = "EVENT_TIME", isTimeStamp = true),
        @FieldMappingInfo(fieldName = "uplinkThroughput", columnName = "UL_TP"),
        @FieldMappingInfo(fieldName = "downlinkThroughput", columnName = "DL_TP"),
        @FieldMappingInfo(fieldName = "setupTimeNetwork", columnName = "SETUP_TIME_NET"),
        @FieldMappingInfo(fieldName = "setupTimeTerminal", columnName = "SETUP_TIME_TERM"),
        @FieldMappingInfo(fieldName = "packetLossNetwork", columnName = "PACKET_LOSS_NET"),
        @FieldMappingInfo(fieldName = "packetLossTerminal", columnName = "PACKET_LOSS_TERM") })
public interface ITcpPerformanceDetails {
    String getEventTime();

    double getUplinkThroughput();

    double getDownlinkThroughput();

    double getSetupTimeNetwork();

    double getSetupTimeTerminal();

    double getPacketLossNetwork();

    double getPacketLossTerminal();
}
