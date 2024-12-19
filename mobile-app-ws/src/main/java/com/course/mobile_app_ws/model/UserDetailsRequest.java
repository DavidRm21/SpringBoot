package com.course.mobile_app_ws.model;

public record UserDetailsRequest (

        String firstName,
        String lastName,
        String email,
        String gender,
        String ipAddress
){
}
