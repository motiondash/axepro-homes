package co.zw.axepro.axeprohomes.service;

import co.zw.axepro.axeprohomes.model.AxeUser;
import java.util.Optional;

public interface AxeUserService {
    AxeUser registerAxeUser(AxeUser axeUser);
    Optional<AxeUser> findAxeUserByUsername(String username);
}
