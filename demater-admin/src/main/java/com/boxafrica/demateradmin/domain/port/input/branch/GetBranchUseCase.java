package com.boxafrica.demateradmin.domain.port.input.branch;


import com.boxafrica.demateradmin.domain.model.branch.Branch;

public interface GetBranchUseCase {
    Branch getBranch(String nameBranch);
}
