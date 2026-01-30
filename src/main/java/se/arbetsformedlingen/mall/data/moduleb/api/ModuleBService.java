package se.arbetsformedlingen.mall.data.moduleb.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.modulith.events.ApplicationModuleListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import se.arbetsformedlingen.mall.data.modulea.api.ModuleAEvent;

@Service
@Transactional
public class ModuleBService {

    private static final Logger log = LoggerFactory.getLogger(ModuleBService.class);

    public String handlePayment(String paymentId) {
        // Business logic placeholder
        return "Payment %s handled by Module B".formatted(paymentId);
    }

    @ApplicationModuleListener
    public void onModuleAEvent(ModuleAEvent event) {
        log.info("Module B received Module A event: message={}, source={}",
                event.message(), event.source());
    }
}