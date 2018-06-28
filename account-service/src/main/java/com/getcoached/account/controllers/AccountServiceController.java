package com.getcoached.account.controllers;

import com.getcoached.account.vo.AccountVO;
import com.getcoached.account.vo.CoachAccountDetails;
import com.getcoached.account.vo.CoachAccountVO;
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
        if (id == 1)  {
            return AccountVO.accountBuilder()
                    .firstName("helen")
                    .lastName("nguyen")
                    .zipCode("12345")
                    .build();
        }
        return CoachAccountVO.coachAccountBuilder()
                .coachAccountDetails(new CoachAccountDetails("gentle"))
                .build();
    }

}
