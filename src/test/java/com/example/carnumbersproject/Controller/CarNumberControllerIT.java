package com.example.carnumbersproject.Controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CarNumberControllerIT {

    @Autowired
    private TestRestTemplate template;


    // todo: ... improve test
    @Test
    public void getNext() {
        ResponseEntity<String> response = template.getForEntity("/number/next", String.class);
        assertThat(response.getBody()).isEqualTo("А000АА 116 RUS");
        response = template.getForEntity("/number/next", String.class);
        assertThat(response.getBody()).isEqualTo("А001АА 116 RUS");
    }

    @Test
    public void getRandom() {
        ResponseEntity<String> response = template.getForEntity("/number/random", String.class);
        assertEquals(14, response.getBody().length());
    }

}