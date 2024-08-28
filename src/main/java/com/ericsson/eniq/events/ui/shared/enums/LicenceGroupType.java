package com.ericsson.eniq.events.ui.shared.enums;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author ealeerm - Alexey Ermykin
 * @since 03 2012
 */
public enum LicenceGroupType {

    // TODO: review & check

    _2G_3G("2G3G", "2G/3G Core Network KPIs", "2G/3G Core Network KPIs"),
    _4G("4G", "4G Core Network KPIs", "4G Core Network KPIs"),
    VOICE_SMS("VOICE_SMS", "Voice and SMS Network KPIs", "Voice and SMS Network KPIs"),
    SGEH("SGEH", "SGEH Data", "Control Plane KPIs"),
    UPD("UPD", "User Plane Data", "User Plane KPIs"),
    WCDMA_HFA_SOURCE("WCDMA_HFA_SOURCE", "WCDMA Handover Source", "WCDMA Handover Source"),
    WCDMA_HFA_TARGET("WCDMA_HFA_TARGET", "WCDMA Handover Target", "WCDMA Handover Target");

    private static final IKpiType[] kpiGroupTypes;

    private final String id;
    private final String fullName;
    private final String fullVisibleName;

    static {
        List<IKpiType> list = createKpiGroupTypes();
        kpiGroupTypes = list.toArray(new IKpiType[list.size()]);
    }

    LicenceGroupType(String id, String fullName, String fullVisibleName) {
        this.id = id;
        this.fullName = fullName;
        this.fullVisibleName = fullVisibleName;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getFullVisibleName() {
        if (fullVisibleName != null) {
            return fullVisibleName;
        } else if (getFullName() != null) {
            return getFullName();
        } else {
            return getId();
        }
    }

    /**
     * Note: KPI is key performance indicator.
     *
     * @return KPI group types that are shown in KPI Analysis wizard
     */
    public static IKpiType[] getKpiGroupTypes() {
        return kpiGroupTypes;
    }

    public static LicenceGroupType valueById(String id) {
        for (LicenceGroupType licenceGroupType : values()) {
            if (licenceGroupType.getId().equals(id)) {
                return licenceGroupType;
            }
        }
        return null;
    }
    
    private static List<IKpiType> createKpiGroupTypes() {
        SGEHKpiType[] sgehTypes = SGEHKpiType.values();
        UpdKpiType[] updTypes = UpdKpiType.values();
        List<IKpiType> kpiGroupTypes = new ArrayList<IKpiType>(sgehTypes.length + updTypes.length);
        Collections.addAll(kpiGroupTypes, sgehTypes);
        Collections.addAll(kpiGroupTypes, updTypes);
        return kpiGroupTypes;
    }
}
