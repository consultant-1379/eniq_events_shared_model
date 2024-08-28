package com.ericsson.eniq.events.ui.shared.enums;

/**
 * NE - Network element
 *
 * @author ealeerm - Alexey Ermykin
 * @since 03 2012
 */
public enum NE {

    Cell("Cell", "Cell", "Cell"),
    RNC("RNC", "RNC", "Radio Network Controller");

    private final String id;
    private final String name;
    private final String fullName;

    private NE(String id, String name, String fullName) {
        this.id = id;
        this.name = name;
        this.fullName = fullName;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return fullName;
    }

    /**
     * @return network elements that are shown in KPI Analysis wizard
     */
    public static NE[] getKpiNetworkElements() {
        // Note: only RNC and Cells are shown now
        return values();
    }
}
