package com.boxafrica.demateradmin.domain.port.output;

import com.boxafrica.demateradmin.domain.model.notification.Notification;

import java.util.List;
import java.util.UUID;

public interface NotificationOutputPort {
    Notification createNotification(Notification notification);
    Notification updateNotification(Notification notification);
    Notification getNotificationDetails(UUID id);
    List<Notification> getAllNotification();
    void deleteNotification(UUID uuid);
}
