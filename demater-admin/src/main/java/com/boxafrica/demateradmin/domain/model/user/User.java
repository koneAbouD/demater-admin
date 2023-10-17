package com.boxafrica.demateradmin.domain.model.user;

import lombok.*;

import java.util.UUID;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    private boolean valid;
    private String password;
    private Role role;

    @Override
    public String toString() {
        return id + " - " + firstName + " " + lastName + " -> Address : " + address;
    }
}
