package se.arbetsformedlingen.mall.data.modulea.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/module-a")
public class ModuleAController {

    private final ModuleAService moduleAService;

    public ModuleAController(ModuleAService moduleAService) {
        this.moduleAService = moduleAService;
    }

    @PostMapping("/orders/{orderId}")
    public String processOrder(@PathVariable String orderId) {
        return moduleAService.processOrder(orderId);
    }
}
