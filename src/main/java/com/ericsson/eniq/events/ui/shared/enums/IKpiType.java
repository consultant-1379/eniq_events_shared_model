package com.ericsson.eniq.events.ui.shared.enums;

/**
 * Note: KPI is key performance indicator.
 *
 * @author ealeerm - Alexey Ermykin
 * @since 03 2012
 */
public interface IKpiType {

    int kpiId();

    String eventDescription();

    LicenceGroupType groupType();

    KpiUnitType unitType();

    KpiRangeType rangeType();
}
