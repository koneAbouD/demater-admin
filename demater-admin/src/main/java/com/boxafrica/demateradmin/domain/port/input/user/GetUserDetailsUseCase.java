package com.boxafrica.demateradmin.domain.port.input.user;

import com.boxafrica.demateradmin.domain.model.user.User;

public interface GetUserDetailsUseCase {
    User getUserDetails(String email);
}
