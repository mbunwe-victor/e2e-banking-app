package com.adorsys.gis.powerpay.powerpaybackend.domain;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UserRegistrationForm {
    @NotBlank(message = "Enter your user name")
    private String userName;

    @Digits(message = "Enter your phone number Begin with your code code", fraction = 0, integer = 11)
    private String phoneNumber;

}
