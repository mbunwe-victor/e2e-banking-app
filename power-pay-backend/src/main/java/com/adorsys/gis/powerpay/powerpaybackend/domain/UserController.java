package com.adorsys.gis.powerpay.powerpaybackend.domain;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class UserController {
    private final UserRegistrationService service = null;

    @PostMapping("/register")
    public UserRegistration registerUser(@Valid UserRegistrationForm form) {
       // its a magic logic using the service
       var ur = service.createProcedure(form.getPhoneNumber(), form.getUserName());
       return ur;
    }
   

    @PostMapping("/api/users")
    public ResponseEntity<String> createUser(@RequestBody @Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            // Handle validation errors
            return ResponseEntity.badRequest().body("Validation errors found.");
        }
        // Process user and create a new user
        return ResponseEntity.ok("User created successfully.");
    }
}