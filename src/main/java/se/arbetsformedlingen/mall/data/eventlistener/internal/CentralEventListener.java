package se.arbetsformedlingen.mall.data.eventlistener.internal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.modulith.events.ApplicationModuleListener;
import org.springframework.stereotype.Component;

import se.arbetsformedlingen.mall.data.shared.events.OrderCreatedEvent;
import se.arbetsformedlingen.mall.data.shared.events.PaymentHandledEvent;

/**
 * Central listener that reacts to events published by other application modules.
 */
@Component
class CentralEventListener {

    private static final Logger log = LoggerFactory.getLogger(CentralEventListener.class);

    @ApplicationModuleListener
    void onOrderCreated(OrderCreatedEvent event) {
        log.info("CentralEventListener received OrderCreatedEvent: orderId={}, customerId={}",
                event.orderId(), event.customerId());
    }

    @ApplicationModuleListener
    void onPaymentHandled(PaymentHandledEvent event) {
        log.info("CentralEventListener received PaymentHandledEvent: paymentId={}", event.paymentId());
    }
}

