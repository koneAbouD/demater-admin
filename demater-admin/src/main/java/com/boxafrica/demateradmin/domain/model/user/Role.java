package com.boxafrica.demateradmin.domain.model.user;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    private Long id;
    private ERole name;
}
