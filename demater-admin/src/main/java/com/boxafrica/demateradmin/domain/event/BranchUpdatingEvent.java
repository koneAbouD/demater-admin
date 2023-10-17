package com.boxafrica.demateradmin.domain.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

import static java.time.LocalDateTime.now;

@Builder
@AllArgsConstructor
@Getter
public class BranchUpdatingEvent {
    private String designation;
    private LocalDateTime date;

    public BranchUpdatingEvent(String designation) {
        this.designation = designation;
        this.date = now();
    }}
