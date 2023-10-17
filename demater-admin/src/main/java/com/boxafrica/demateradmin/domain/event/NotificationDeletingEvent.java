package com.boxafrica.demateradmin.domain.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

import static java.time.LocalDateTime.now;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class NotificationDeletingEvent {
    private UUID id;
    private LocalDateTime date;

    public NotificationDeletingEvent(UUID id) {
        this.id = id;
        this.date = now();
    }
}
