package com.demo.main;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class SpringBootWebApplicationTest {

	@Autowired
    DeveloperRepository developerRepository;

    @Autowired
    SkillRepository skillRepository;
    
    @Autowired
   	private MockMvc mockMvc;
    
	
	@Test
    public void contextLoads() throws Exception {
    }

    
    @Test
    public void shouldReturnDefaultMessage() throws Exception {
        this.mockMvc.perform(get("/developers")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Thiness")));
    }
 
 @Test
    public void shouldReturnDefaultMessage1() throws Exception {
        this.mockMvc.perform(get("/developer/1")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Raj")));
    }
 


@Test
public void shouldReturnDefaultMessage2() throws Exception {
    this.mockMvc.perform(get("/greeting#")).andDo(print()).andExpect(status().isOk())
            .andExpect(content().string(containsString("Message")));
}
 
	
	
	
	
}
