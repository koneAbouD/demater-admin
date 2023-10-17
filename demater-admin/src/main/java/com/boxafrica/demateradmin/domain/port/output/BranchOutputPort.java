package com.boxafrica.demateradmin.domain.port.output;

import com.boxafrica.demateradmin.domain.model.branch.Branch;

import java.util.List;

public interface BranchOutputPort {
    Branch getBranch(String nameBranch);
    List<Branch> getAllBranchs();
    Branch updateBranch(Branch branch);
    List<Branch> updateAllBranchs(List<Branch> branches);
}