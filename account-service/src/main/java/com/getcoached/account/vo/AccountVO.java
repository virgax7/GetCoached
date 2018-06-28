package com.getcoached.account.vo;

import lombok.Builder;
import lombok.Getter;

@Getter
public class AccountVO {
    private final String firstName;
    private final String lastName;
    private final String phoneNumber;
    private final String address;
    private final String city;
    private final String state;
    private final String zipCode;

    public AccountVO(final String firstName, final String lastName, final String phoneNumber, final String address, final String city, final String state, final String zipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    @Builder(builderMethodName = "accountBuilder")
    public static AccountVO newAccountVO(final String firstName, final String lastName, final String phoneNumber,
                          final String address, final String city, final String state, final String zipCode) {
        return new AccountVO(firstName, lastName, phoneNumber, address, city, state, zipCode);
    }
}
