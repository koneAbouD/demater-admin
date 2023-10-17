package com.boxafrica.demateradmin.domain.port.input.notification;

import com.boxafrica.demateradmin.domain.model.notification.Notification;
import com.boxafrica.demateradmin.domain.model.user.User;

import java.util.UUID;

public interface GetNotificationDetailsUseCase {
    Notification getNotificationDetails(UUID id);
}
