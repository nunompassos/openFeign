package com.test.openfeign;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.test.openfeign.model.EchoResponse;

@SpringBootTest
public class EchoClientTest {

    @Autowired
    private EchoClient echoClient;

    @Test
    void getEcho() {
        final EchoResponse response = echoClient.getEcho("ola", "turma");

        Assertions.assertThat(response.getArgs().getParam1()).isEqualTo("ola");
        Assertions.assertThat(response.getArgs().getParam2()).isEqualTo("turma");
    }
}
