package se.arbetsformedlingen.mall.data.modulea.api;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import se.arbetsformedlingen.mall.data.shared.events.OrderCreatedEvent;

class ModuleAServiceTest {

    @Test
    void processOrderPublishesOrderCreatedEvent() {
        List<Object> events = new ArrayList<>();
        ModuleAService service = new ModuleAService(events::add);

        String response = service.processOrder("123");

        assertThat(response).isEqualTo("Order 123 processed by Module A");
        assertThat(events).containsExactly(new OrderCreatedEvent("123", "demo-customer"));
    }
}
