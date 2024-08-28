package com.ericsson.eniq.events.ui.shared.model.sessionbrowser.details;

public interface ISessionEventVisitor<T> {

    void visit(final ICallFailureEventData eventData, final T data);

    void visit(final IDataBearerSessionEventData eventData, final T data);

    void visit(final ICoreEventData eventData, final T data);

    void visit(final IHandoverFailureEventData eventData, final T data);

    void visit(final IHandoverFailureSessionEventData eventData, final T data);

    void visit(final IRRCMeasurementReportEventData eventData, final T data);
}