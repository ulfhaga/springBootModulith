package se.arbetsformedlingen.mall.data.modulea.api;

import org.springframework.modulith.events.ApplicationModuleListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.moduleb.api.ModuleBEvent;

import se.arbetsformedlingen.mall.data.shared.events.*;


@Service
@Transactional
public class ModuleAService {

    public String processOrder(String orderId) {
        // Business logic
        return "Order " + orderId + " processed by Module A";
    }

    // Listen to events from other modules
    @ApplicationModuleListener
    public void onOrderCreated(OrderCreatedEvent event) {
        System.out.println("Module A received order created event: " + event.getOrderId());
    }

    @ApplicationModuleListener
    public void onModuleBEvent(ModuleBEvent event) {
        System.out.println("Module A received Module B event: " + event.getMessage());
    }
}
