package se.arbetsformedlingen.mall.data.modulea.api;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

class ModuleAControllerTest {

    @Test
    void processOrderDelegatesToService() throws Exception {
        ModuleAService service = mock(ModuleAService.class);
        when(service.processOrder("123")).thenReturn("Order 123 processed by Module A");
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(new ModuleAController(service)).build();

        mockMvc.perform(post("/api/module-a/orders/123"))
                .andExpect(status().isOk())
                .andExpect(content().string("Order 123 processed by Module A"));

        verify(service).processOrder("123");
    }
}
