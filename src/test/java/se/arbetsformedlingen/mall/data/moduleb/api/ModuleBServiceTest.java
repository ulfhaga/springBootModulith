package se.arbetsformedlingen.mall.data.moduleb.api;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import se.arbetsformedlingen.mall.data.shared.events.PaymentHandledEvent;

class ModuleBServiceTest {

    @Test
    void handlePaymentPublishesPaymentHandledEvent() {
        List<Object> events = new ArrayList<>();
        ModuleBService service = new ModuleBService(events::add);

        String response = service.handlePayment("456");

        assertThat(response).isEqualTo("Payment 456 handled by Module B");
        assertThat(events).containsExactly(new PaymentHandledEvent("456"));
    }
}
