package com.ericsson.eniq.events.ui.shared.enums;

/**
 * KPI drill categories for User Plain Data (UPD) for both RNC and cell.
 * <p/>
 * Note: KPI is key performance indicator.
 *
 * @author ealeerm - Alexey Ermykin
 * @since 03 2012
 */
public enum UpdKpiDrillCategory implements IKpiDrillCategory {

    // TODO: review & check

    TYPE_TAC("TAC", "TAC"),
    TYPE_APN("APN", "APN"),
    HS_CATEGORY("HS_CATEGORY", "HS Category"),
    EUL_CATEGORY("EUL_CATEGORY", "EUL Category"),
    START_CELL("START_CELL_ID", "Start Cell Id"), //only for RNC view
    END_CELL("END_CELL_ID", "End Cell Id"), // only for RNC view
    HS_RATIO("HS_RATIO", "HS Ratio"),
    EUL_RATIO("EUL_RATIO", "EUL Ratio"),
    DCH_ACT("DCH_ACTIVITY", "DCH Activity"),
    ECNO("ECNO_AVG", "Ec/No"),
    RSCP("RSCP_AVG", "RSCP"),
    UL_INER("UL_INTERFERENCE_AVG", "UL Interference"),
    HS_USER("HSDSCH_AVG_USERS", "Num of HS Users in cell"),
    DL_NON_HS_TX_POWER_AVG("DL_NON_HS_TX_POWER_AVG","DL Non HS TX Power"),
    MANUFACTURER("MANUFACTURER","Make"),
    MAKE_MODEL("MAKE_MODEL","Make-Model");

    private static final UpdKpiDrillCategory[] cellCategories;
    private static final UpdKpiDrillCategory[] rncCategories;
    private static final UpdKpiDrillCategory[] defaultCategories;

    private final String id;
    private final String fullName;

    static {
        rncCategories = new UpdKpiDrillCategory[]{
                TYPE_TAC, TYPE_APN, HS_CATEGORY, EUL_CATEGORY, START_CELL, END_CELL, HS_RATIO,
                EUL_RATIO, DCH_ACT, ECNO, RSCP, UL_INER, HS_USER, DL_NON_HS_TX_POWER_AVG, MANUFACTURER, MAKE_MODEL
        };
        cellCategories = new UpdKpiDrillCategory[]{
                TYPE_TAC, TYPE_APN, HS_CATEGORY, EUL_CATEGORY, HS_RATIO,
                EUL_RATIO, DCH_ACT, ECNO, RSCP, UL_INER, HS_USER, DL_NON_HS_TX_POWER_AVG, MANUFACTURER, MAKE_MODEL
        };
        defaultCategories = new UpdKpiDrillCategory[0];
    }

    UpdKpiDrillCategory(String id, String fullName) {
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
        return LicenceGroupType.UPD;
    }

    public static LicenceGroupType getLicenceGroupType() {
        return LicenceGroupType.UPD;
    }

    /**
     * @param ne network element which the categories requested for
     * @return KPI cell drill categories that are shown in KPI Analysis wizard
     */
    public static IKpiDrillCategory[] getKpiDrillCategories(NE ne) {
        switch (ne) {
            case Cell:
                return cellCategories;
            case RNC:
                return rncCategories;
            default:
                return defaultCategories;
        }
    }
}