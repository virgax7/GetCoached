package com.getcoached.account.controllers;

import com.getcoached.account.vo.AccountVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/account", produces = "application/json")
public class AccountServiceController {

    @GetMapping("/{accountId}")
    public AccountVO getProfile(@PathVariable("accountId") final int id) {
        // TODO: make a mock object, later retrieve from db
        return AccountVO.accountBuilder()
                .firstName("helen")
                .lastName("nguyen")
                .zipCode("12345")
                .build();
    }

}
