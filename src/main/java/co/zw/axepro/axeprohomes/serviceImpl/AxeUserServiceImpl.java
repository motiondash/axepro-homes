package co.zw.axepro.axeprohomes.serviceImpl;

import co.zw.axepro.axeprohomes.model.AxeUser;
import co.zw.axepro.axeprohomes.repository.AxeUserRepository;
import co.zw.axepro.axeprohomes.service.AxeUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AxeUserServiceImpl implements AxeUserService {

    @Autowired
    private AxeUserRepository axeUserRepository;

    @Override
    public AxeUser registerAxeUser(AxeUser axeUser) {
        return axeUserRepository.save(axeUser);
    }

    @Override
    public Optional<AxeUser> findAxeUserByUsername(String username) {
        return axeUserRepository.findByUsername(username);
    }
}
