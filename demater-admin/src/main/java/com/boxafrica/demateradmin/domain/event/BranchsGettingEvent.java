package com.boxafrica.demateradmin.domain.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import static java.time.LocalDateTime.now;
@Builder
@AllArgsConstructor
@Getter
public class BranchsGettingEvent {
    private LocalDateTime date;
    public BranchsGettingEvent(){this.date = now();}
}
