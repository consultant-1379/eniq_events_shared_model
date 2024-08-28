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
@ResultSetMappingInfo(fieldMappings = { @FieldMappingInfo(fieldName = "cellId", columnName = "CELL_ID"),
        @FieldMappingInfo(fieldName = "cId", columnName = "CID"),
        @FieldMappingInfo(fieldName = "controller", columnName = "RNC_ALTERNATIVE_FDN"),
        @FieldMappingInfo(fieldName = "startTime", columnName = "START_TIME", isTimeStamp = true),
        @FieldMappingInfo(fieldName = "durationInCell", columnName = "Duration"),
        @FieldMappingInfo(fieldName = "samplesGoodCoverageBadSignal", columnName = "GC_BS"),
        @FieldMappingInfo(fieldName = "samplesBadCoverageBadSignal", columnName = "BC_BS"),
        @FieldMappingInfo(fieldName = "samplesBadCoverageGoodSignal", columnName = "BC_GS"),
        @FieldMappingInfo(fieldName = "samplesGoodCoverageGoodSignal", columnName = "GC_GS") })
public interface IRadioConditionsVisitedCellsSummary {
    String getCellId();

    String getCId();

    String getController();

    long getStartTime();

    int getDurationInCell();

    int getSamplesGoodCoverageBadSignal();

    int getSamplesBadCoverageBadSignal();

    int getSamplesBadCoverageGoodSignal();

    int getSamplesGoodCoverageGoodSignal();
}
