package com.ericsson.eniq.events.ui.shared.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: eeidpar
 * Date: 10/02/12
 * Time: 08:35
 * To change this template use File | Settings | File Templates.
 */
public enum EventType {
    //values from DIM_E_RAN_SESSION_EVENTTYPE
    RAB(20000, "Data Bearer Session"),

    //values from DIM_E_SGEH_EVENTTYPE
    ATTACH(0, "Attach"),
    ACTIVATE(1, "PDP Activate"),
    RAU(2, "RAU"),
    ISRAU(3, "ISRAU"),
    DEACTIVATE(4, "PDP Deactivate"),
    DETACH(14, "Detach"),
    SERVICE_REQUEST(15, "Service Request"),

    //rrc measurement report
    RRC_MEASUREMENT_REPORT(8, "RRC Measurement Report"),

    //values from DIM_E_RAN_CFA_EVENTTYPE
    INTERNAL_SYSTEM_RELEASE(438, "Internal System Release"),
    INTERNAL_CALL_SETUP_FAIL(456,"Internal Call Setup Failure"),

    //values from DIM_E_RAN_HFA_EVENTTYPE
    INTERNAL_SOFT_HANDOVER_EVALUATION(407, "Internal Soft Handover Evaluation"),
    INTERNAL_SOFT_HANDOVER_EXECUTION(408,"Int Soft Handover Execution Failure", "Internal Soft Handover Execution Failure"),
    INTERNAL_IFHO_EVALUATION(421, "Internal IFHO Handover Evaluation"),
    INTERNAL_IFHO_EXECUTION_ACTIVE(423, "Int IFHO Handover Execution Failure", "Internal IFHO Handover Execution Failure"),
    INTERNAL_IRAT_HO_CC_EVALUATION(398,"Internal IRAT Handover CC Evaluation"),
    INTERNAL_OUT_HARD_HANDOVER_FAILURE(458,"Int Out Hard Handover Failure", "Internal Out Hard Handover Failure"),
    INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE(432,"Int Successful HSDSCH Cell Change", "Internal Successful HSDSCH Cell Change"),
    INTERNAL_FAILED_HSDSCH_CELL_CHANGE(433,"Int Failed HSDSCH Cell Change", "Internal Failed HSDSCH Cell Change"),
    INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED(436,"Int HSDSCH No Cell Selected", "Internal HSDSCH No Cell Selected");

    //Holding place for others
    private static final Map<Integer, EventType> lookup = new HashMap<Integer, EventType>();

    static {
        for (final EventType eventType : EnumSet.allOf(EventType.class))
            lookup.put(eventType.eventId(), eventType);
    }

    private int eventId;

    private String eventDescription;

    private String eventFullDescription;

    private EventType(final int eventId, final String eventDescription) {
        this(eventId,eventDescription,eventDescription);
    }

    private EventType(final int eventId, final String eventDescription, final String eventFullDescription) {
        this.eventId = eventId;
        this.eventDescription = eventDescription;
        this.eventFullDescription = eventFullDescription;
    }

    public int eventId() {
        return eventId;
    }

    public String eventDescription() {
        return eventDescription;
    }

    public static EventType fromEventId(final int eventId) {
        return lookup.get(eventId);
    }

    public String getEventFullDescription() {
        return eventFullDescription;
    }
}
