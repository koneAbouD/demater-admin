package com.boxafrica.demateradmin.domain.port.input.branch;

import com.boxafrica.demateradmin.domain.model.branch.Branch;

import java.util.List;

public interface GetAllBranchsUseCase {
    List<Branch> getAllBranchs();
}
