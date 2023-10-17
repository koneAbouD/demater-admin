package com.boxafrica.demateradmin.domain.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

import static java.time.LocalDateTime.now;

@Builder
@AllArgsConstructor
@Getter
public class UserGettingEvent {
    private LocalDateTime date;
    public UserGettingEvent(){this.date = now();}
}