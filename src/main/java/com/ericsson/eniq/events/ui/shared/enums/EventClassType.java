package com.ericsson.eniq.events.ui.shared.enums;

import com.ericsson.eniq.events.ui.shared.model.sessionbrowser.details.ICallFailureEventData;
import com.ericsson.eniq.events.ui.shared.model.sessionbrowser.details.ICoreEventData;
import com.ericsson.eniq.events.ui.shared.model.sessionbrowser.details.IEventData;
import com.ericsson.eniq.events.ui.shared.model.sessionbrowser.details.IHandoverFailureEventData;
import com.ericsson.eniq.events.ui.shared.model.sessionbrowser.details.IHandoverFailureSessionEventData;
import com.ericsson.eniq.events.ui.shared.model.sessionbrowser.details.IRRCMeasurementReportEventData;
import com.ericsson.eniq.events.ui.shared.model.sessionbrowser.details.IDataBearerSessionEventData;
import com.ericsson.eniq.events.ui.shared.model.sessionbrowser.details.ISessionEventVisitor;

public enum EventClassType {

    CALL_FAILURE(ICallFailureEventData.class) {
        @Override
        protected <V> void doVisit(final ISessionEventVisitor<V> visitor, final IEventData eventData, final V data) {
            visitor.visit((ICallFailureEventData) eventData, data);
        }
    },
    CORE(ICoreEventData.class) {
        @Override
        protected <V> void doVisit(final ISessionEventVisitor<V> visitor, final IEventData eventData, final V data) {
            visitor.visit((ICoreEventData) eventData, data);
        }
    },
    HANDOVER_FAILURE(IHandoverFailureEventData.class) {
        @Override
        protected <V> void doVisit(final ISessionEventVisitor<V> visitor, final IEventData eventData, final V data) {
            visitor.visit((IHandoverFailureEventData) eventData, data);
        }
    },
    HANDOVER_FAILURE_SESSION(IHandoverFailureSessionEventData.class) {
        @Override
        protected <V> void doVisit(final ISessionEventVisitor<V> visitor, final IEventData eventData, final V data) {
            visitor.visit((IHandoverFailureSessionEventData) eventData, data);
        }
    },
    RAB(IDataBearerSessionEventData.class) {
        @Override
        protected <V> void doVisit(final ISessionEventVisitor<V> visitor, final IEventData eventData, final V data) {
            visitor.visit((IDataBearerSessionEventData) eventData, data);
        }
    },
    RRC_MEAS_REPORT(IRRCMeasurementReportEventData.class) {
        @Override
        protected <V> void doVisit(final ISessionEventVisitor<V> visitor, final IEventData eventData, final V data) {
            visitor.visit((IRRCMeasurementReportEventData) eventData, data);
        }
    };

    private final Class<? extends IEventData> clazz;

    EventClassType(final Class<? extends IEventData> clazz) {
        this.clazz = clazz;
    }

    public <T> void accept(final ISessionEventVisitor<T> visitor, final IEventData eventData, final T data) {
        if (isVisitable(eventData)) {
            doVisit(visitor, eventData, data);
        }
    }

    protected abstract <V> void doVisit(final ISessionEventVisitor<V> visitor, final IEventData eventData, final V data);

    private boolean isVisitable(IEventData eventData) {
        return eventData != null;
    }
}
