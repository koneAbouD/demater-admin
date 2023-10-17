package com.boxafrica.demateradmin.domain.service;

import com.boxafrica.demateradmin.domain.event.NotificationCreatingEvent;
import com.boxafrica.demateradmin.domain.event.NotificationDeletingEvent;
import com.boxafrica.demateradmin.domain.model.notification.Notification;
import com.boxafrica.demateradmin.domain.port.input.notification.CreateNotificationUseCase;
import com.boxafrica.demateradmin.domain.port.input.notification.DeleteNotificationUseCase;
import com.boxafrica.demateradmin.domain.port.input.notification.GetAllNotificationUseCase;
import com.boxafrica.demateradmin.domain.port.input.notification.UpdateNotificationUseCase;
import com.boxafrica.demateradmin.domain.port.output.BranchOutputPort;
import com.boxafrica.demateradmin.domain.port.output.NotificationOutputPort;
import com.boxafrica.demateradmin.domain.port.output.publisher.BranchEventPublisher;
import com.boxafrica.demateradmin.domain.port.output.publisher.NotificationEventPublisher;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
public class NotificationService implements CreateNotificationUseCase, GetAllNotificationUseCase, UpdateNotificationUseCase, DeleteNotificationUseCase {
    private final NotificationOutputPort notificationOutputPort;
    private final NotificationEventPublisher notificationEventPublisher;
    @Override
    public Notification createNotification(Notification notification) {
        Notification notificationCreated = notificationOutputPort.createNotification(notification);
        notificationEventPublisher.publishNotificationCreating(new NotificationCreatingEvent(notificationCreated.getTitle()));
        return notificationCreated;
    }

    @Override
    public void deleteNotification(UUID id) {
        notificationOutputPort.deleteNotification(id);
        notificationEventPublisher.publishNotificationDeleting(new NotificationDeletingEvent());

    }

    @Override
    public List<Notification> getAllNotification() {
        return null;
    }

    @Override
    public Notification updateNotification(Notification notification) {
        return null;
    }
}
