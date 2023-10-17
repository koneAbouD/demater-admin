package com.boxafrica.demateradmin.domain.port.input.notification;

import com.boxafrica.demateradmin.domain.model.notification.Notification;

public interface CreateNotificationUseCase {
    Notification createNotification(Notification notification);
}
