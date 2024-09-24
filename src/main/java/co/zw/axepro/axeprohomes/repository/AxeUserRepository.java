package co.zw.axepro.axeprohomes.repository;

import co.zw.axepro.axeprohomes.model.AxeUser;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface AxeUserRepository extends JpaRepository<AxeUser, Long> {
    Optional<AxeUser> findByUsername(String username);
}
