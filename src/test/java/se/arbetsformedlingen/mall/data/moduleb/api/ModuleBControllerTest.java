package se.arbetsformedlingen.mall.data.moduleb.api;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

class ModuleBControllerTest {

    @Test
    void handlePaymentDelegatesToService() throws Exception {
        ModuleBService service = mock(ModuleBService.class);
        when(service.handlePayment("456")).thenReturn("Payment 456 handled by Module B");
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(new ModuleBController(service)).build();

        mockMvc.perform(post("/api/module-b/payments/456"))
                .andExpect(status().isOk())
                .andExpect(content().string("Payment 456 handled by Module B"));

        verify(service).handlePayment("456");
    }
}
