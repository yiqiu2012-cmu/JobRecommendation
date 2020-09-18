package com.laioffer.job.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RegisterRequestBody {
//    @JsonProperty(name), tells Jackson ObjectMapper to map the JSON property name to the annotated Java field's name.
    @JsonProperty("user_id")
    public String userId;

    public String password;

    @JsonProperty("first_name")
    public String firstName;

    @JsonProperty("last_name")
    public String lastName;
}
