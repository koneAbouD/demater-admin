package com.boxafrica.demateradmin.domain.port.input.branch;

import com.boxafrica.demateradmin.domain.model.branch.Branch;

import java.util.List;
import java.util.UUID;

public interface UpdateAllBranchsUseCase {
    List<Branch> updateAllBranchs(List<Branch> branches);
}
