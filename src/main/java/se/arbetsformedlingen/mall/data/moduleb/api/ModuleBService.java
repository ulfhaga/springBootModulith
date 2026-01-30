package se.arbetsformedlingen.mall.data.moduleb.api;


import org.springframework.modulith.events.ApplicationModuleListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ModuleBService {

    public String handlePayment(String paymentId) {
        // Business logic
        return "Payment " + paymentId + " handled by Module B";
    }

    @ApplicationModuleListener
    public void onModuleAEvent(ModuleBEvent event) {
        System.out.println("Module B received Module A event: " + event.message());
    }
}