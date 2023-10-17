package com.boxafrica.demateradmin.domain.port.input.user;

import com.boxafrica.demateradmin.domain.model.user.User;

import java.util.List;

public interface GetAllUserUseCase {
    List<User> getAllusers ();
}
