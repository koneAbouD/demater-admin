package com.boxafrica.demateradmin.domain.port.input.notification;

import com.boxafrica.demateradmin.domain.model.notification.Notification;

import java.util.UUID;

public interface DeleteNotificationUseCase {
    void deleteNotification(UUID id);
}
