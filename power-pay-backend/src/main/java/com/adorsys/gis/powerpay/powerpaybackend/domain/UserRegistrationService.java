package com.adorsys.gis.powerpay.powerpaybackend.domain;

import jakarta.validation.constraints.NotNull;

public interface UserRegistrationService {

    User registerUser(@NotNull Integer registrationId, String pin, String otp);

    UserRegistration createProcedure(String phoneNumber, String userName);

}
