package com.boxafrica.demateradmin.domain.service;

import com.boxafrica.demateradmin.domain.event.BranchUpdatingEvent;
import com.boxafrica.demateradmin.domain.event.BranchsGettingEvent;
import com.boxafrica.demateradmin.domain.event.BranchsUpdatingEvent;
import com.boxafrica.demateradmin.domain.model.branch.Branch;
import com.boxafrica.demateradmin.domain.port.input.branch.GetAllBranchsUseCase;
import com.boxafrica.demateradmin.domain.port.input.branch.GetBranchUseCase;
import com.boxafrica.demateradmin.domain.port.input.branch.UpdateAllBranchsUseCase;
import com.boxafrica.demateradmin.domain.port.input.branch.UpdateBranchUseCase;
import com.boxafrica.demateradmin.domain.port.output.BranchOutputPort;
import com.boxafrica.demateradmin.domain.port.output.publisher.BranchEventPublisher;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class BranchService implements GetBranchUseCase, GetAllBranchsUseCase, UpdateBranchUseCase, UpdateAllBranchsUseCase {
    private final BranchOutputPort branchOutputPort;
    private final BranchEventPublisher branchEventPublisher;
    @Override
    public List<Branch> getAllBranchs() {
        List<Branch> branches = branchOutputPort.getAllBranchs();
        branchEventPublisher.publishBranchsGetting(new BranchsGettingEvent());
        return branches;
    }
    @Override
    public Branch updateBranch(Branch branch) {
        Branch branchUpdated = branchOutputPort.updateBranch(branch);
        branchEventPublisher.publishBranchUpdating(new BranchUpdatingEvent(branchUpdated.getNameBranch()));
        return branchUpdated;
    }
    @Override
    public List<Branch> updateAllBranchs(List<Branch> branches) {
        List<Branch> branchesUpdated = branchOutputPort.updateAllBranchs(branches);
        branchEventPublisher.publishBranchsUpdating(new BranchsUpdatingEvent());
        return branchesUpdated;
    }

    @Override
    public Branch getBranch(String nameBranch) {
        Branch branch = branchOutputPort.getBranch(nameBranch);
        branchEventPublisher.publishBranchUpdating(new BranchUpdatingEvent(branch.getNameBranch()));
        return branch;
    }
}
