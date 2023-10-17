package com.boxafrica.demateradmin.domain.port.output.publisher;

import com.boxafrica.demateradmin.domain.event.NotificationCreatingEvent;
import com.boxafrica.demateradmin.domain.event.NotificationDeletingEvent;
import com.boxafrica.demateradmin.domain.event.NotificationsGettingEvent;

public interface NotificationEventPublisher {
    void publishNotificationCreating(NotificationCreatingEvent event);
    void publishNotificationGetting(NotificationsGettingEvent event);
    void publishNotificationDeleting(NotificationDeletingEvent event);
}
