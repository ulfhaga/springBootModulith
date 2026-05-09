package se.arbetsformedlingen.mall.data.moduleb.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import se.arbetsformedlingen.mall.data.shared.events.PaymentHandledEvent;

@Service
@Transactional
public class ModuleBService {

    private static final Logger log = LoggerFactory.getLogger(ModuleBService.class);

    private final ApplicationEventPublisher events;

    public ModuleBService(ApplicationEventPublisher events) {
        this.events = events;
    }

    public String handlePayment(String paymentId) {
        // Business logic placeholder
        events.publishEvent(new PaymentHandledEvent(paymentId));
        log.info("Module B handled payment: paymentId={}", paymentId);

        return "Payment %s handled by Module B".formatted(paymentId);
    }
}