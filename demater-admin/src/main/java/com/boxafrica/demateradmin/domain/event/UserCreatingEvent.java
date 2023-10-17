package com.boxafrica.demateradmin.domain.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import static java.time.LocalDateTime.now;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UserCreatingEvent {
    private String designation;
    private LocalDateTime date;

    public UserCreatingEvent(String designation) {
        this.designation = designation;
        this.date = now();
    }
}
