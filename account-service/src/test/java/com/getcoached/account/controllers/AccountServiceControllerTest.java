package com.getcoached.account.controllers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class AccountServiceControllerTest {
    @Autowired
    private AccountServiceController accountServiceController;

    @Test
    public void AccountServiceControllerIsWired() {
        assertNotNull(accountServiceController);
    }
}