package com.ericsson.eniq.events.ui.shared.enums;

/**
 * -----------------------------------------------------------------------
 * Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
public enum KpiRangeType {
    GOOD("GoodHigh"), //Threshold colours range from RED (0%) to GREY (100%)
    BAD("BadHigh"),   //Threshold colours range from GREY (0%) to RED (100%)
    INDIFFERENT("Indifferent");

    private final String kpiRangeType;

    KpiRangeType(final String type) {
        this.kpiRangeType = type;
    }

    public static KpiRangeType fromString(final String type) {
        for (final KpiRangeType kpiRangeType : KpiRangeType.values()) {
            if (kpiRangeType.toString().equals(type)) {
                return kpiRangeType;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return kpiRangeType;
    }}
