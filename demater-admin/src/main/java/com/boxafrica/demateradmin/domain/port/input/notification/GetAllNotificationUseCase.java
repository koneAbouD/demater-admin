package com.boxafrica.demateradmin.domain.port.input.notification;

import com.boxafrica.demateradmin.domain.model.notification.Notification;

import java.util.List;

public interface GetAllNotificationUseCase {
    List<Notification> getAllNotification();
}
