package com.boxafrica.demateradmin.domain.port.output.publisher;

import com.boxafrica.demateradmin.domain.event.*;

public interface UserEventPublisher {
    void publishUserCreating(UserCreatingEvent event);
    void publishUserGetting(UserGettingEvent event);
    void publishUserDeleting(UserDeletingEvent event);
    void publishUserDetailsGetting(UserDetailsGettingEvent event);
}
