package se.arbetsformedlingen.mall.data.modulea.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.modulith.events.ApplicationModuleListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import se.arbetsformedlingen.mall.data.moduleb.api.ModuleBEvent;
import se.arbetsformedlingen.mall.data.shared.events.OrderCreatedEvent;

@Service
@Transactional
public class ModuleAService {

    private static final Logger log = LoggerFactory.getLogger(ModuleAService.class);

    public String processOrder(String orderId) {
        // Business logic placeholder
        return "Order %s processed by Module A".formatted(orderId);
    }

    // Listen to events from other modules
    @ApplicationModuleListener
    public void onOrderCreated(OrderCreatedEvent event) {
        log.info("Module A received order created event: orderId={}, customerId={}",
                event.orderId(), event.customerId());
    }

    @ApplicationModuleListener
    public void onModuleBEvent(ModuleBEvent event) {
        log.info("Module A received Module B event: message={}, source={}",
                event.message(), event.source());
    }
}
