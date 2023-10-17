package com.boxafrica.demateradmin.domain.port.output.publisher;

import com.boxafrica.demateradmin.domain.event.*;

public interface BranchEventPublisher {
    void publishBranchUpdating(BranchUpdatingEvent event);
    void publishBranchsGetting(BranchsGettingEvent event);
    void publishBranchGetting();
    void publishBranchsUpdating(BranchsUpdatingEvent event);
}
