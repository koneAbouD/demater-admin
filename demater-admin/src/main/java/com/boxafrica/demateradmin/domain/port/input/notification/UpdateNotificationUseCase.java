package com.boxafrica.demateradmin.domain.port.input.notification;

import com.boxafrica.demateradmin.domain.model.notification.Notification;

public interface UpdateNotificationUseCase {
    Notification updateNotification(Notification notification);
}
