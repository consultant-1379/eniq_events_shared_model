package com.ericsson.eniq.events.ui.shared.common;

import java.io.Serializable;

/**
 * Base class for all models, which has basic attributes used in every response.
 *
 * @author evyagrz
 * @since 02 2012
 */
public class ResponseData<T extends Model> implements Serializable{
    private boolean success;
    private String errorDescription;
    private long dataTimeFrom;
    private long dateTimeTo;
    private String timeZone;
    private T data;

    public ResponseData() {
    }

    public ResponseData(boolean success, String errorDescription, long dataTimeFrom, long dateTimeTo,
                        String timeZone, T data) {
        this.success = success;
        this.errorDescription = errorDescription;
        this.dataTimeFrom = dataTimeFrom;
        this.dateTimeTo = dateTimeTo;
        this.timeZone = timeZone;
        this.data = data;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    public long getDataTimeFrom() {
        return dataTimeFrom;
    }

    public void setDataTimeFrom(long dataTimeFrom) {
        this.dataTimeFrom = dataTimeFrom;
    }

    public long getDateTimeTo() {
        return dateTimeTo;
    }

    public void setDateTimeTo(long dateTimeTo) {
        this.dateTimeTo = dateTimeTo;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}