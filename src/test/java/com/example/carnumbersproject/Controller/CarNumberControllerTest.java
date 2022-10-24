package com.example.carnumbersproject.Controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


//todo:  we already have IT test for mvc. this test is not needed. just for fun

@SpringBootTest
@AutoConfigureMockMvc
public class CarNumberControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void getNext() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/number/next").accept(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("А000АА 116 RUS")));
        mvc.perform(MockMvcRequestBuilders.get("/number/next").accept(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("А001АА 116 RUS")));
    }

}