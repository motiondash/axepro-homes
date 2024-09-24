package co.zw.axepro.axeprohomes.service;

import co.zw.axepro.axeprohomes.model.AxeHomeOwner;
import co.zw.axepro.axeprohomes.model.AxeUser;
import co.zw.axepro.axeprohomes.model.dto.AxeHomeOwnerDTO;

import java.util.Optional;

public interface AxeHomeOwnerService {
    AxeHomeOwner registerAxeHomeOwner(AxeHomeOwnerDTO axeHomeOwnerDTO);
    Optional<AxeHomeOwner> findAxeHomeOwnerByUsername(String username);
}
