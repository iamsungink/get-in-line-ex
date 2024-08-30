package com.uno.getinlineex.controller.api;

import com.uno.getinlineex.dto.APIDataResponse;
import com.uno.getinlineex.dto.AdminRequest;
import com.uno.getinlineex.dto.LoginRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class APIAuthController {

    @PostMapping("/sign-up")
    public APIDataResponse<String> signUp(@RequestBody AdminRequest adminRequest) {
        return APIDataResponse.empty();
    }

    @PostMapping("/login")
    public APIDataResponse<String> login(@RequestBody LoginRequest loginRequest) {
        return APIDataResponse.empty();
    }

}
