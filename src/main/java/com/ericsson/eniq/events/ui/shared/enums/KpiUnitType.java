/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.eniq.events.ui.shared.enums;

/**
 * author: egallou
 * Date: 10/2012
 */

public enum KpiUnitType {

    PERCENTAGE("Percentage", "%"), THROUGHPUT("Throughput", "kbps"), RATE("Rate", "ms");

    private final String kpiUnitType;

    private final String units;

    KpiUnitType(final String type, final String units) {
        this.kpiUnitType = type;
        this.units = units;
    }

    public static KpiUnitType fromString(final String type) {
        for (final KpiUnitType kpiUnitType : KpiUnitType.values()) {
            if (kpiUnitType.toString().equals(type)) {
                return kpiUnitType;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return kpiUnitType;
    }

    public String getUnits() {
        return this.units;
    }
}