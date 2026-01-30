package se.arbetsformedlingen.mall.data.modulea.internal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import se.arbetsformedlingen.mall.data.modulea.api.ModuleAService;

@Configuration
public class ModuleAConfiguration {

    @Bean
    public ModuleAService moduleAService() {
        return new ModuleAService();
    }
    // Additional internal configuration for Module A can be added here.
}
