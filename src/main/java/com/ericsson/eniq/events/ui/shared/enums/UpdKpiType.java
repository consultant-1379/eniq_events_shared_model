package com.ericsson.eniq.events.ui.shared.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

import static com.ericsson.eniq.events.ui.shared.enums.LicenceGroupType.UPD;

/**
 * User Plain Data (UPD) KPI Types
 *
 * <ul>Notes:
 * <li>Do NOT change <tt>eventDescription</tt>s without change in other classes (see them in <code>See
 * Also</code> section).</li>
 * <li>This enum is used by EE UI.</li>
 * </ul>
 *
 * @author ealeerm - Alexey Ermykin
 * @see com.ericsson.eniq.events.ui.shared.model.kpianalysis.IUserPlaneChartDrillKpiResult
 * @see com.ericsson.eniq.events.ui.shared.model.kpianalysis.IUserPlaneChartKpiResult
 * @since 03 2012
 */
public enum UpdKpiType implements IKpiType {

    // TODO: review & check
	//NB: Do not change enum values
	//They are used by Services templates
    TCP_THROUGHPUT_UPLINK(0, "Uplink Throughput", KpiUnitType.THROUGHPUT, KpiRangeType.GOOD),
    TCP_THROUGHPUT_DOWNLINK(1, "Downlink Throughput", KpiUnitType.THROUGHPUT, KpiRangeType.GOOD),
    RTT_TERMINAL(2, "RTT Terminal", KpiUnitType.RATE, KpiRangeType.BAD),
    RTT_SERVER(3, "RTT Server", KpiUnitType.RATE, KpiRangeType.BAD),
    PACKET_LOSS_TERMINAL(4, "Packet Loss Terminal", KpiUnitType.PERCENTAGE, KpiRangeType.BAD),
    PACKET_LOSS_SERVER(5, "Packet Loss Server", KpiUnitType.PERCENTAGE, KpiRangeType.BAD);

    private final int kpiId;
    private final String eventDescription;
    private final KpiUnitType unitType;
    private final KpiRangeType rangeType;

    private static final Map<Integer, UpdKpiType> lookup = new HashMap<Integer, UpdKpiType>();

    static {
        for (UpdKpiType kpiType : EnumSet.allOf(UpdKpiType.class)) {
            lookup.put(kpiType.kpiId(), kpiType);
        }
    }

    UpdKpiType(int kpiId, String eventDescription, KpiUnitType unitType, KpiRangeType rangeType) {
        this.kpiId = kpiId;
        this.eventDescription = eventDescription;
        this.unitType = unitType;
        this.rangeType = rangeType;
    }

    @Override public int kpiId() {
        return kpiId;
    }

    @Override public String eventDescription() {
        return eventDescription;
    }

    @Override public LicenceGroupType groupType() {
        return UPD;
    }

    @Override
    public KpiUnitType unitType() {
        return unitType;
    }

    @Override
    public KpiRangeType rangeType() {
        return this.rangeType;
    }

    public static UpdKpiType getKPIFromDescription(String description) {
        for(Map.Entry<Integer, UpdKpiType> entry : lookup.entrySet()){
            if(entry.getValue().eventDescription().equalsIgnoreCase(description)){
                return entry.getValue();
            }
        }
        return null;
    }


    public static LicenceGroupType licenceGroupType() {
        return UPD;
    }

    public static UpdKpiType fromKpiId(int eventId) {
        return lookup.get(eventId);
    }
}