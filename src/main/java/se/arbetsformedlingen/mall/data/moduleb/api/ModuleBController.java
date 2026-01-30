package se.arbetsformedlingen.mall.data.moduleb.api;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/module-b")
public class ModuleBController {

    private final ModuleBService moduleBService;

    public ModuleBController(ModuleBService moduleBService) {
        this.moduleBService = moduleBService;
    }

    @PostMapping("/payments/{paymentId}")
    public String handlePayment(@PathVariable String paymentId) {
        return moduleBService.handlePayment(paymentId);
    }
}