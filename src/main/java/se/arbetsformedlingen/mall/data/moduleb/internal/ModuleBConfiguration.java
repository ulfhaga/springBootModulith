package se.arbetsformedlingen.mall.data.moduleb.internal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import se.arbetsformedlingen.mall.data.moduleb.api.ModuleBService;

@Configuration
public class ModuleBConfiguration {

    @Bean
    public ModuleBService moduleBService() {
        return new ModuleBService();
    }
    // Additional internal configuration for Module A can be added here.
}
