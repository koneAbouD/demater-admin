package com.boxafrica.demateradmin.domain.model.notification;

import lombok.*;

import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Notification {
    private UUID id;
    private String title;
    private String description;
    private String content;
    private String picture;
    private String type;
}
