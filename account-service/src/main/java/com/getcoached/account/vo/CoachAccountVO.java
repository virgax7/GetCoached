package com.getcoached.account.vo;

import lombok.Builder;
import lombok.Getter;

@Getter
public class CoachAccountVO extends AccountVO {

    private final CoachAccountDetails coachAccountDetails;

    public CoachAccountVO(final String firstName, final String lastName, final String phoneNumber,
                          final String address, final String city, final String state,
                          final String zipCode, final CoachAccountDetails coachAccountDetails) {
        super(firstName, lastName, phoneNumber, address, city, state, zipCode);
        this.coachAccountDetails = coachAccountDetails;
    }

    @Builder(builderMethodName = "coachAccountBuilder")
    public static CoachAccountVO newCoachAccountVO(final String firstName, final String lastName, final String phoneNumber,
                          final String address, final String city, final String state,
                          final String zipCode, final CoachAccountDetails coachAccountDetails) {
        return new CoachAccountVO(firstName, lastName, phoneNumber, address, city, state, zipCode, coachAccountDetails);
    }
}
