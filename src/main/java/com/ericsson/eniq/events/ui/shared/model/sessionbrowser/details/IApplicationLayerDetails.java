package com.ericsson.eniq.events.ui.shared.model.sessionbrowser.details;

import com.ericsson.eniq.events.ui.shared.annotations.FieldMappingInfo;
import com.ericsson.eniq.events.ui.shared.annotations.ResultSetMappingInfo;

/**
 * Created by IntelliJ IDEA.
 * User: eeidpar
 * Date: 22/02/12
 * Time: 08:50
 * To change this template use File | Settings | File Templates.
 */
@ResultSetMappingInfo(fieldMappings = {
        @FieldMappingInfo(fieldName = "eventTime", columnName = "EVENT_TIME", isTimeStamp = true),
        @FieldMappingInfo(fieldName = "uplinkBytes", columnName = "BYTE_UPLINK"),
        @FieldMappingInfo(fieldName = "downlinkBytes", columnName = "BYTE_DOWNLINK"),
        @FieldMappingInfo(fieldName = "function", columnName = "FUNCTION_DESC") })
public interface IApplicationLayerDetails {
    String getEventTime();

    double getUplinkBytes();

    double getDownlinkBytes();

    String getFunction();
}
