package com.ericsson.eniq.events.ui.shared.model.sessionbrowser.summary;

import com.ericsson.eniq.events.ui.shared.annotations.FieldMappingInfo;
import com.ericsson.eniq.events.ui.shared.annotations.ResultSetMappingInfo;

/**
 * Created by IntelliJ IDEA.
 * User: eeidpar
 * Date: 22/02/12
 * Time: 09:06
 * To change this template use File | Settings | File Templates.
 */
@ResultSetMappingInfo(fieldMappings = {
        @FieldMappingInfo(fieldName = "goodCoverageBadSignal", columnName = "TOTAL_GC_BS"),
        @FieldMappingInfo(fieldName = "goodCoverageGoodSignal", columnName = "TOTAL_GC_GS"),
        @FieldMappingInfo(fieldName = "badCoverageBadSignal", columnName = "TOTAL_BC_BS"),
        @FieldMappingInfo(fieldName = "badCoverageGoodSignal", columnName = "TOTAL_BC_GS"),
        @FieldMappingInfo(fieldName = "goodCoverageBadSignalPercentage", columnName = "PERCENTAGE_GC_BS"),
        @FieldMappingInfo(fieldName = "goodCoverageGoodSignalPercentage", columnName = "PERCENTAGE_GC_GS"),
        @FieldMappingInfo(fieldName = "badCoverageBadSignalPercentage", columnName = "PERCENTAGE_BC_BS"),
        @FieldMappingInfo(fieldName = "badCoverageGoodSignalPercentage", columnName = "PERCENTAGE_BC_GS"),
        @FieldMappingInfo(fieldName = "averageEcno", columnName = "ECNO_AVG", outputAsString = true),
        @FieldMappingInfo(fieldName = "averageRscp", columnName = "RSCP_AVG", outputAsString = true),
        @FieldMappingInfo(fieldName = "noMeasurementReports", columnName = "TOTAL_SAMPLES", outputAsString = true) })
public interface IRadioConditionsSummary {
    int getGoodCoverageBadSignal();

    int getGoodCoverageGoodSignal();

    int getBadCoverageBadSignal();

    int getBadCoverageGoodSignal();

    int getAverageEcno();

    int getAverageRscp();

    int getNoMeasurementReports();
}
