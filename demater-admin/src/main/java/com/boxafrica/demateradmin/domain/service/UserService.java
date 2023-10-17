package com.boxafrica.demateradmin.domain.service;

import com.boxafrica.demateradmin.domain.event.UserDetailsGettingEvent;
import com.boxafrica.demateradmin.domain.event.UserGettingEvent;
import com.boxafrica.demateradmin.domain.model.user.User;
import com.boxafrica.demateradmin.domain.port.input.user.CreateUserUseCase;
import com.boxafrica.demateradmin.domain.port.input.user.GetAllUserUseCase;
import com.boxafrica.demateradmin.domain.port.input.user.GetUserDetailsUseCase;
import com.boxafrica.demateradmin.domain.port.input.user.UpdateUserUserCase;
import com.boxafrica.demateradmin.domain.port.output.UserOutputPort;
import com.boxafrica.demateradmin.domain.port.output.publisher.UserEventPublisher;
import lombok.AllArgsConstructor;

import java.util.List;
@AllArgsConstructor
public class UserService implements GetAllUserUseCase, GetUserDetailsUseCase, CreateUserUseCase, UpdateUserUserCase {

    private final UserOutputPort userOutputPort;
    private final UserEventPublisher userEventPublisher;
    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public List<User> getAllusers() {
        List<User> users = userOutputPort.getAllUsers();
        userEventPublisher.publishUserGetting(new UserGettingEvent());
        return users;
    }

    @Override
    public User getUserDetails(String email) {
        User user = userOutputPort.getUserDetails(email);
        userEventPublisher.publishUserDetailsGetting(new UserDetailsGettingEvent(user.getEmail()));
        return user;
    }
}
