package com.ericsson.eniq.events.ui.shared.enums;

/**
 * KPI drill categories for SGEH for both RNC and cell.
 * <p/>
 * Note: KPI is key performance indicator.
 *
 * @author ealeerm - Alexey Ermykin
 * @since 03 2012
 */
public enum SgehKpiDrillCategory implements IKpiDrillCategory {

    // TODO: review & check

    TAC("TAC", "TAC"),
    MAKE("MANUFACTURER", "Make"),
    MAKE_MODEL("MAKE_MODEL", "Make-Model");

    private final String id;
    private final String fullName;

    private static final SgehKpiDrillCategory[] kpiDrillCategories;

    static {
        kpiDrillCategories = values();
    }

    SgehKpiDrillCategory(String id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    /**
     * Data for service path parameters.
     *
     * @return id that used in server request
     */
    @Override public String getId() {
        return id;
    }

    @Override public String getFullName() {
        return fullName;
    }

    @Override public LicenceGroupType getGroupType() {
        return LicenceGroupType.SGEH;
    }

    public static LicenceGroupType getLicenceGroupType() {
        return LicenceGroupType.SGEH;
    }

    /**
     * @param ne network element which the categories requested for
     * @return KPI cell drill categories that are shown in KPI Analysis wizard
     */
    public static IKpiDrillCategory[] getKpiDrillCategories(NE ne) {
        // Note: for RNCs and Cells we have the same list now
        return kpiDrillCategories;
    }
}