package org.neat0n.configServer;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@EnableAutoConfiguration
@SpringBootTest
public class WorkedTest {
    @Autowired
    MockMvc mockMvc;
    
    @Test
    void testHomepage() throws Exception {
        this.mockMvc.perform(get("/")).andExpect(status().isOk());
    }
    
    @Test
    void healthTest() throws Exception {
        this.mockMvc.perform(get("/actuator/health/")).andExpect(status().isOk());
    }
}
