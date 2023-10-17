package com.boxafrica.demateradmin.domain.port.output;

import com.boxafrica.demateradmin.domain.model.user.User;

import java.util.List;

public interface UserOutputPort {
    List<User> getAllUsers();
    User getUserDetails(String email);
    User createUser (User user);
    User updateUser (User user);
}
