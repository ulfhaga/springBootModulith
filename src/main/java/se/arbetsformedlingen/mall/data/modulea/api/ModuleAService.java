package se.arbetsformedlingen.mall.data.modulea.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import se.arbetsformedlingen.mall.data.shared.events.OrderCreatedEvent;

@Service
@Transactional
public class ModuleAService {

    private static final Logger log = LoggerFactory.getLogger(ModuleAService.class);

    private final ApplicationEventPublisher events;

    public ModuleAService(ApplicationEventPublisher events) {
        this.events = events;
    }

    public String processOrder(String orderId) {
        // Business logic placeholder
        events.publishEvent(new OrderCreatedEvent(orderId, "demo-customer"));
        log.info("Module A processed order: orderId={}", orderId);

        return "Order %s processed by Module A".formatted(orderId);
    }
}
