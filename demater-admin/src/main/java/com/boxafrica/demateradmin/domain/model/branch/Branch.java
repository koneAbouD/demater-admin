package com.boxafrica.demateradmin.domain.model.branch;

import com.boxafrica.demateradmin.domain.model.user.User;
import lombok.*;

import java.util.Set;
import java.util.UUID;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Branch {
    private UUID id;
    private String codeBranch;
    private String nameBranch;
    private Set<User> users;
}
