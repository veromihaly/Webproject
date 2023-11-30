package project.service;

import project.uito.OwnerUITO;

import java.util.List;

public interface OwnerService {
    OwnerUITO doSaveOwner(OwnerUITO ownerUiTO);

    List<OwnerUITO> doFetchAllOwner();

    OwnerUITO doGetOwner(OwnerUITO ownerUiTO);

    void doDeleteOwner(OwnerUITO ownerUiTO);
}
