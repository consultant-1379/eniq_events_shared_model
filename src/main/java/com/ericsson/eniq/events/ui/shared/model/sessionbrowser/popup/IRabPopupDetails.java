package com.ericsson.eniq.events.ui.shared.model.sessionbrowser.popup;

import java.util.Map;

import com.ericsson.eniq.events.ui.shared.annotations.FieldMappingInfo;
import com.ericsson.eniq.events.ui.shared.annotations.ResultSetMappingInfo;

/**
 * Popup details for the WCDMA Databearer session event.
 *
 * @author eeidpar
 * @since 06 2012
 */
@ResultSetMappingInfo(fieldMappings = {
        @FieldMappingInfo(fieldName = "MSISDN", columnName = "MSISDN", groupId = "Subscriber Identity"),
        @FieldMappingInfo(fieldName = "IMSI", columnName = "IMSI", groupId = "Subscriber Identity"),
        @FieldMappingInfo(fieldName = "Terminal", columnName = "TERMINAL", groupId = "Subscriber Identity"),
        @FieldMappingInfo(fieldName = "Network", columnName = "NETWORK", groupId = "Subscriber Identity"),

        @FieldMappingInfo(fieldName = "Starting SGSN", columnName = "START_SGSN", groupId = "Network Location"),
        @FieldMappingInfo(fieldName = "Ending SGSN", columnName = "END_SGSN", groupId = "Network Location"),
        @FieldMappingInfo(fieldName = "Starting RNC", columnName = "START_RNC_ALTERNATIVE_FDN", groupId = "Network Location"),
        @FieldMappingInfo(fieldName = "Ending RNC", columnName = "END_RNC_ALTERNATIVE_FDN", groupId = "Network Location"),
        @FieldMappingInfo(fieldName = "Starting Cell ID", columnName = "START_CELL_ID", groupId = "Network Location"),
        @FieldMappingInfo(fieldName = "Ending Cell ID", columnName = "END_CELL_ID", groupId = "Network Location"),
        @FieldMappingInfo(fieldName = "Starting CID", columnName = "START_C_ID", groupId = "Network Location"),
        @FieldMappingInfo(fieldName = "Ending CID", columnName = "END_C_ID", groupId = "Network Location"),

        @FieldMappingInfo(fieldName = "PS RAB Activity Start Time", columnName = "PS_RAB_ACTIVITY_START_TIME",groupId = "Session Properties", isTimeStamp = true),
        @FieldMappingInfo(fieldName = "PS RAB Activity End Time", columnName = "PS_RAB_ACTIVITY_END_TIME", groupId = "Session Properties", isTimeStamp = true),
        @FieldMappingInfo(fieldName = "Starting RAB", columnName = "START_RAB", groupId = "Session Properties" ),
        @FieldMappingInfo(fieldName = "Ending RAB", columnName = "END_RAB", groupId = "Session Properties" ),
        @FieldMappingInfo(fieldName = "No. of new PS RAB", columnName = "PS_RAB_ESTABLISH_CNT",groupId = "Session Properties"),
        @FieldMappingInfo(fieldName = "IP Address Assigned", columnName = "IP_ADDR", groupId = "Session Properties"),
        @FieldMappingInfo(fieldName = "Starting Access Point", columnName = "START_APN", groupId = "Session Properties"),
        @FieldMappingInfo(fieldName = "Ending Access Point", columnName = "END_APN", groupId = "Session Properties"),
        @FieldMappingInfo(fieldName = "Radio Access Technology", columnName = "RAT", groupId = "Session Properties" ),
        @FieldMappingInfo(fieldName = "HS Category", columnName = "HS_CATEGORY_DESC", groupId = "Session Properties" ),
        @FieldMappingInfo(fieldName = "EUL Category", columnName = "EUL_CATEGORY_DESC", groupId = "Session Properties" ),

        @FieldMappingInfo(fieldName = "No. of RRC Meas. Reports", columnName = "NO_RRC_MEAS_REPORTS", groupId = "Radio Conditions"),
        @FieldMappingInfo(fieldName = "No. of new RRC Connections", columnName = "RRC_CONNECTION_CNT", groupId = "Radio Conditions"),
        @FieldMappingInfo(fieldName = "RRC Connection Start Time", columnName = "RRC_CONN_START",groupId = "Radio Conditions",isTimeStamp = true),
        @FieldMappingInfo(fieldName = "RRC Connection End Time", columnName = "RRC_CONN_END",groupId = "Radio Conditions", isTimeStamp = true),
        @FieldMappingInfo(fieldName = "Average RSCP (dBm)", columnName = "RSCP_AVG", groupId = "Radio Conditions"),
        @FieldMappingInfo(fieldName = "Average Ec/No (dB)", columnName = "ECNO_AVG", groupId = "Radio Conditions"),
        @FieldMappingInfo(fieldName = "Average Uplink Interference (dB)", columnName = "UL_INTERFERENCE_AVG", groupId = "Radio Conditions"),
        @FieldMappingInfo(fieldName = "No. Samples in Good Coverage, Good Signal", columnName = "TOTAL_GC_GS", groupId = "Radio Conditions"),
        @FieldMappingInfo(fieldName = "No. Samples in Good Coverage, Poor Signal", columnName = "TOTAL_GC_BS", groupId = "Radio Conditions"),
        @FieldMappingInfo(fieldName = "No. Samples in Poor Coverage, Good Signal", columnName = "TOTAL_BC_GS", groupId = "Radio Conditions"),
        @FieldMappingInfo(fieldName = "No. Samples in Poor Coverage, Poor Signal", columnName = "TOTAL_BC_BS", groupId = "Radio Conditions"),
        @FieldMappingInfo(fieldName = "Average no of HS users in Cell", columnName = "HSDSCH_AVG_USERS", groupId = "Radio Conditions"),
        @FieldMappingInfo(fieldName = "Average DL non-HS TX power", columnName = "DL_NON_HS_TX_POWER_AVG", groupId = "Radio Conditions"),

        @FieldMappingInfo(fieldName = "No. of Cells Visited", columnName = "VISITED_CELL_CNT", groupId = "Mobility"),
        @FieldMappingInfo(fieldName = "No. of Successful Routing Area Updates", columnName = "RAU_SUC_CNT", groupId = "Mobility"),
        @FieldMappingInfo(fieldName = "No. of Successful Inter Frequency handovers", columnName = "IFHO_EXEC_SUC_CNT", groupId = "Mobility"),
        @FieldMappingInfo(fieldName = "No. of Successful IRAT handovers", columnName = "IRAT_EXEC_SUC_CNT", groupId = "Mobility"),
        @FieldMappingInfo(fieldName = "No. of Successful Soft handovers", columnName = "SOHO_EXEC_SUC_CNT", groupId = "Mobility"),
        @FieldMappingInfo(fieldName = "No. of Successful HS cell changes", columnName = "HS_CELL_CHANGE_SUC_CNT", groupId = "Mobility"),
        @FieldMappingInfo(fieldName = "No. of Failed Routing Area Updates", columnName = "RAU_ERR_CNT", groupId = "Mobility"),
        @FieldMappingInfo(fieldName = "No. of Failed Inter Frequency handovers", columnName = "IFHO_EXEC_ERR_CNT", groupId = "Mobility"),
        @FieldMappingInfo(fieldName = "No. of Failed IRAT handovers", columnName = "IRAT_EXEC_ERR_CNT", groupId = "Mobility"),
        @FieldMappingInfo(fieldName = "No. of Failed Soft handovers", columnName = "SOHO_EXEC_ERR_CNT", groupId = "Mobility"),
        @FieldMappingInfo(fieldName = "No. of Failed HS cell changes", columnName = "HS_CELL_CHANGE_ERR_CNT", groupId = "Mobility"),
        @FieldMappingInfo(fieldName = "No. of times in Compressed Mode", columnName = "SUM_CM_CNT", groupId = "Mobility"),
        @FieldMappingInfo(fieldName = "Time spent in Compressed Mode (ms)", columnName = "SUM_CM_DURATION", groupId = "Mobility"),
        @FieldMappingInfo(fieldName = "No. of times in UL Compressed Mode", columnName = "SUM_CM_UL_CNT", groupId = "Mobility"),
        @FieldMappingInfo(fieldName = "No. of times in DL Compressed Mode", columnName = "SUM_CM_DL_CNT", groupId = "Mobility"),
        @FieldMappingInfo(fieldName = "No. of times in UL and DL Compressed Mode", columnName = "SUM_CM_ULDL_CNT", groupId = "Mobility"),
        @FieldMappingInfo(fieldName = "Avg No. of Compressed Mode users", columnName = "AVG_CM_USER_CNT", groupId = "Mobility"),

        @FieldMappingInfo(fieldName = "% Time Spent in DCH/HS Activity", columnName = "ACTIVITY", groupId = "Traffic Channel Usage"),
        @FieldMappingInfo(fieldName = "% Time Spent in HS", columnName = "HS_RATIO", groupId = "Traffic Channel Usage"),
        @FieldMappingInfo(fieldName = "% Time Spent in EUL", columnName = "EUL_RATIO", groupId = "Traffic Channel Usage"),
        @FieldMappingInfo(fieldName = "No. of channel upswitches", columnName = "CUS", groupId = "Traffic Channel Usage"),
        @FieldMappingInfo(fieldName = "-CUS Attempt", columnName = "CUS_ATT_COUNT", groupId = "Traffic Channel Usage"),
        @FieldMappingInfo(fieldName = "-CUS Success", columnName = "CUS_SUCC_CNT", groupId = "Traffic Channel Usage"),
        @FieldMappingInfo(fieldName = "-CUS Failure", columnName = "CUS_ERR_CNT", groupId = "Traffic Channel Usage"),
        @FieldMappingInfo(fieldName = "No. of channel downswitches", columnName = "CDS", groupId = "Traffic Channel Usage"),
        @FieldMappingInfo(fieldName = "-CDS Attempt", columnName = "CDS_ATT_COUNT", groupId = "Traffic Channel Usage"),
        @FieldMappingInfo(fieldName = "-CDS Success", columnName = "CDS_SUCC_CNT", groupId = "Traffic Channel Usage"),
        @FieldMappingInfo(fieldName = "-CDS Failure", columnName = "CDS_ERR_CNT", groupId = "Traffic Channel Usage"),
        @FieldMappingInfo(fieldName = "No. of switches due to UE activity", columnName = "CS_REASON_UE_ACTIVITY", groupId = "Traffic Channel Usage"),
        @FieldMappingInfo(fieldName = "No. of switches due to capacity", columnName = "CS_REASON_CAPACITY", groupId = "Traffic Channel Usage"),
        @FieldMappingInfo(fieldName = "No. of switches due to mobility coverage", columnName = "CS_REASON_MOBILITY_COVERAGE", groupId = "Traffic Channel Usage"),
        @FieldMappingInfo(fieldName = "No. of switches due to Qos DCH", columnName = "CS_REASON_QOS_DCH", groupId = "Traffic Channel Usage"),
        @FieldMappingInfo(fieldName = "No. of switches due to queue", columnName = "CS_REASON_QUEUE", groupId = "Traffic Channel Usage"),
        @FieldMappingInfo(fieldName = "No. of switches due to other reason", columnName = "CS_REASON_OTHER", groupId = "Traffic Channel Usage"),

        @FieldMappingInfo(fieldName = "Downlink Volume (Bytes)", columnName = "DL_VOL", groupId = "Application Performance"),
        @FieldMappingInfo(fieldName = "Uplink Volume (Bytes)", columnName = "UL_VOL", groupId = "Application Performance"),
        @FieldMappingInfo(fieldName = "RTT (UE <-> Server) (ms)", columnName = "RTT_UE_SERVER", groupId = "Application Performance"),
        @FieldMappingInfo(fieldName = "RTT (UE <-> Gn) (ms)", columnName = "RTT_UE_GN", groupId = "Application Performance"),
        @FieldMappingInfo(fieldName = "RTT (Gn <-> Server) (ms)", columnName = "RTT_GN_SERVER", groupId = "Application Performance"),

        @FieldMappingInfo(fieldName = "% Packet loss (Terminal -> Server)", columnName = "PACKET_LOSS_UE_SERVER", groupId = "Application Performance"),
        @FieldMappingInfo(fieldName = "% Packet loss (Server -> Terminal)", columnName = "PACKET_LOSS_SERVER_UE", groupId = "Application Performance"),

        @FieldMappingInfo(fieldName = "Traffic Type", columnName = "FUNCTION_DESC", groupId = "Application Traffic Mix"),
        @FieldMappingInfo(fieldName = "Traffic Volume", columnName = "TRAFFIC", groupId = "Application Traffic Mix")})

public interface IRabPopupDetails {

    Map<String, Map<String,Object>> getDetails();
}
