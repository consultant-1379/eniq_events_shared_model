package com.ericsson.eniq.events.ui.shared.model.sessionbrowser.popup;

import com.ericsson.eniq.events.ui.shared.annotations.FieldMappingInfo;
import com.ericsson.eniq.events.ui.shared.annotations.ResultSetMappingInfo;

import java.util.Map;

@ResultSetMappingInfo(fieldMappings = {
        @FieldMappingInfo(fieldName = "MSISDN", columnName = "MSISDN", groupId = "Subscriber Identity"),
        @FieldMappingInfo(fieldName = "IMSI", columnName = "IMSI", groupId = "Subscriber Identity"),
        @FieldMappingInfo(fieldName = "Terminal", columnName = "TERMINAL", groupId = "Subscriber Identity"),
        @FieldMappingInfo(fieldName = "Network", columnName = "NETWORK", groupId = "Subscriber Identity"),

        @FieldMappingInfo(fieldName = "SGSN", columnName = "SGSN", groupId = "Network Location"),
        @FieldMappingInfo(fieldName = "Controller", columnName = "CONTROLLER", groupId = "Network Location"),
        @FieldMappingInfo(fieldName = "PLMN", columnName = "PLMN", groupId = "Network Location"),
        @FieldMappingInfo(fieldName = "Location Area", columnName = "LAC", groupId = "Network Location"),
        @FieldMappingInfo(fieldName = "Routing Area", columnName = "ROUTING_AREA", groupId = "Network Location" ),
        @FieldMappingInfo(fieldName = "Service Area", columnName = "SERVING_AREA", groupId = "Network Location" ),

        @FieldMappingInfo(fieldName = "Event Type", columnName = "EVENT_TYPE", groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Event Time", columnName = "EVENT_TIME", groupId = "Event Details", isTimeStamp = true),
        @FieldMappingInfo(fieldName = "Event Result", columnName = "EVENT_RESULT", groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Duration (ms)", columnName = "DURATION", groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Radio Access Technology", columnName = "RAT", groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Activation Type", columnName = "ACTIVATION_TYPE_DESC", groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Access Point", columnName = "APN", groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "IP Address", columnName = "IP_ADDRESS", groupId = "Event Details"),
        @FieldMappingInfo(fieldName = "Request Retries", columnName = "REQUEST_RETRIES", groupId = "Event Details"),


        @FieldMappingInfo(fieldName = "Cause Code", columnName = "CAUSE_CODE", groupId = "Event Outcome"),
        @FieldMappingInfo(fieldName = "Cause Code Description", columnName = "CAUSE_CODE_DESC", groupId = "Event Outcome"),
        @FieldMappingInfo(fieldName = "Sub Cause Code", columnName = "SUB_CAUSE_CODE", groupId = "Event Outcome"),
        @FieldMappingInfo(fieldName = "Sub Cause Code Description", columnName = "SUB_CAUSE_CODE_DESC", groupId = "Event Outcome")})
public interface ICorePopupDetailsEventActivate {
    /**
     * Get the details for the rab event as a map of maps. The key for the first map is Category Name, the key
     * @return
     */
    Map<String, Map<String,Object>> getDetails();
}
