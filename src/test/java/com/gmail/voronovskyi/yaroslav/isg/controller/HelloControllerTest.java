package com.gmail.voronovskyi.yaroslav.isg.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloControllerTest {

    private static final String HELLO_JENKINS_MESSAGE = "Hello from Jenkins";
    private static final String HELLO_EC2_MESSAGE = "Hello from EC2";
    private final HelloController helloController = new HelloController();

    @Test
    void shouldReturnExpectedMessageFromJenkins() {
        assertEquals(HELLO_JENKINS_MESSAGE, helloController.getHelloMessageFromJenkins());
    }

    @Test
    void shouldReturnExpectedMessageFromEC2() {
        assertEquals(HELLO_EC2_MESSAGE, helloController.getHelloMessageFromEC2());
    }
}
