package com.ericsson.eniq.events.ui.shared.model.sessionbrowser.popup;

import com.ericsson.eniq.events.ui.shared.annotations.FieldMappingInfo;
import com.ericsson.eniq.events.ui.shared.annotations.ResultSetMappingInfo;

/**
 * Details for the WCDMA Server distribution popup dialog.
 *
 * @author eeidpar
 * @since 06 2012
 */
@ResultSetMappingInfo(fieldMappings = {
        @FieldMappingInfo(fieldName = "host", columnName = "HOST"),
        @FieldMappingInfo(fieldName = "dataVolumeDownlink", columnName = "DV_DL"),
        @FieldMappingInfo(fieldName = "dataVolumeUplink", columnName = "DV_UL"),
        @FieldMappingInfo(fieldName = "samplesDownlink", columnName = "SAMPLE_DL"),
        @FieldMappingInfo(fieldName = "samplesUplink", columnName = "SAMPLE_UL"),
        @FieldMappingInfo(fieldName = "throughputDownlink", columnName = "TP_DL"),
        @FieldMappingInfo(fieldName = "throughputUplink", columnName = "TP_UL"),
        @FieldMappingInfo(fieldName = "setupTimeTerm", columnName = "SETUP_TIME_TERM"),
        @FieldMappingInfo(fieldName = "setupTimeNet", columnName = "SETUP_TIME_NET"),
        @FieldMappingInfo(fieldName = "packetLossTerm", columnName = "PACKET_LOSS_TERM"),
        @FieldMappingInfo(fieldName = "packetLossNet", columnName = "PACKET_LOSS_NET")})
public interface IServerDistribution {
    String getHost();
    long getDataVolumeDownlink();
    long getDataVolumeUplink();
    int getSamplesDownlink();
    int getSamplesUplink();
    long getThroughputDownlink();
    long getThroughputUplink();
    int getSetupTimeTerm();
    int getSetupTimeNet();
    double getPacketLossTerm();
    double getPacketLossNet();
}


