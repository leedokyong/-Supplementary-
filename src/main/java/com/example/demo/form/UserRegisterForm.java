package com.example.demo.form;

import lombok.Data;

@Data
public class UserRegisterForm {
    private String username;
    private String password;
    private String nickname;
    private String email;
}
