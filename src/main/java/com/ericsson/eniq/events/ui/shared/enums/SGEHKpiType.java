package com.ericsson.eniq.events.ui.shared.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

import static com.ericsson.eniq.events.ui.shared.enums.LicenceGroupType.SGEH;

/**
 * <ul>Notes:
 * <li>Do NOT change <tt>eventDescription</tt>s without change in other classes (see them in <code>See
 * Also</code> section).</li>
 * <li>This enum is used by EE UI.</li>
 * </ul>
 *
 * @author eeidpar
 * @see com.ericsson.eniq.events.ui.shared.model.kpianalysis.ISGEHChartDrillKpiResult
 * @see com.ericsson.eniq.events.ui.shared.model.kpianalysis.ISGEHChartKpiResult
 * @see com.ericsson.eniq.events.ui.shared.model.kpianalysis.ISGEHNetworkMapKpiResult
 * @see com.ericsson.eniq.events.ui.shared.model.kpianalysis.ISGEHRncMapKpiResult
 * @since 02 2012
 */
public enum SGEHKpiType implements IKpiType {

    // TODO: review & check
    //NB: Do not change enum values
    //They are used by Services templates
    SERVICE_REQUEST_FAILURE_RATIO(0, "Service Request Failure Ratio", KpiUnitType.PERCENTAGE, KpiRangeType.BAD),
    PAGING_FAILURE_RATIO(1, "Paging Failure Ratio", KpiUnitType.PERCENTAGE, KpiRangeType.BAD),
    RAU_SUCCESS_RATE(2, "RAU Success Rate", KpiUnitType.PERCENTAGE, KpiRangeType.GOOD),
    PDP_CONTEXT_ACTIVATION_SUCCESS_RATE(3, "PDP Context Activation Success Rate", KpiUnitType.PERCENTAGE, KpiRangeType.GOOD),
    ISRAU_SUCCESS_RATE(4, "ISRAU Success Rate", KpiUnitType.PERCENTAGE, KpiRangeType.GOOD),
    DETACH_SUCCESS_RATE(5, "Detach Success Rate", KpiUnitType.PERCENTAGE, KpiRangeType.GOOD),
    ATTACH_SUCCESS_RATE(6, "Attach Success Rate", KpiUnitType.PERCENTAGE, KpiRangeType.GOOD),
    PDP_CONTEXT_CUTOFF_RATIO(7, "PDP Context Cutoff Ratio", KpiUnitType.PERCENTAGE, KpiRangeType.BAD);

    private static final Map<Integer, SGEHKpiType> lookup = new HashMap<Integer, SGEHKpiType>();

    static {
        for (SGEHKpiType kpiType : EnumSet.allOf(SGEHKpiType.class)) {
            lookup.put(kpiType.kpiId(), kpiType);
        }
    }

    private final int kpiId;
    private final String eventDescription;
    private final KpiUnitType unitType;
    private final KpiRangeType rangeType;

    private SGEHKpiType(int kpiId, String eventDescription, KpiUnitType unitType, KpiRangeType rangeType) {
        this.kpiId = kpiId;
        this.eventDescription = eventDescription;
        this.unitType = unitType;
        this.rangeType = rangeType;
    }

    public int kpiId() {
        return kpiId;
    }

    public String eventDescription() {
        return eventDescription;
    }

    public static SGEHKpiType fromKpiId(int eventId) {
        return lookup.get(eventId);
    }

    public LicenceGroupType groupType() {
        return SGEH;
    }

    @Override
    public KpiUnitType unitType() {
        return unitType;
    }

    @Override
    public KpiRangeType rangeType() {
        return this.rangeType;
    }

    public static SGEHKpiType getKPIFromDescription(String description) {
        for(Map.Entry<Integer, SGEHKpiType> entry : lookup.entrySet()){
            if(entry.getValue().eventDescription().equalsIgnoreCase(description)){
                return entry.getValue();
            }
        }
        return null;
    }

    public static LicenceGroupType licenceGroupType() {
        return SGEH;
    }


}
