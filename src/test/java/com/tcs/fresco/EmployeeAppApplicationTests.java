package com.tcs.fresco;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


@SpringBootTest
@RunWith(SpringRunner.class)
public class EmployeeAppApplicationTests {

	   private MockMvc mockMvc;
	    
	    @Autowired
	    WebApplicationContext context;
	    
	    
		@Before
		public void setup() {
			mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
		}
		
		
		@Test
		public void test1() {
			try {
				 mockMvc.perform(get("/employees/1" )).andDo(print())
	             .andExpect(status().isOk())
	                .andExpect(MockMvcResultMatchers.jsonPath("$.name").exists())
	                .andExpect(MockMvcResultMatchers.jsonPath("$.location").exists())
	                .andExpect(MockMvcResultMatchers.jsonPath("$.id").exists())
	                .andExpect(MockMvcResultMatchers.jsonPath("$.education").exists())
	                .andExpect(MockMvcResultMatchers.jsonPath("$.yearsOfEmployment").exists());
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
}
