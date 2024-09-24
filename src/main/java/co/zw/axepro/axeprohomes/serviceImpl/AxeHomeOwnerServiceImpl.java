package co.zw.axepro.axeprohomes.serviceImpl;

import co.zw.axepro.axeprohomes.model.AxeHomeOwner;
import co.zw.axepro.axeprohomes.model.AxeUser;
import co.zw.axepro.axeprohomes.model.dto.AxeHomeOwnerDTO;
import co.zw.axepro.axeprohomes.repository.AxeHomeOwnerRepository;
import co.zw.axepro.axeprohomes.repository.AxeUserRepository;
import co.zw.axepro.axeprohomes.service.AxeHomeOwnerService;
import co.zw.axepro.axeprohomes.service.AxeUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AxeHomeOwnerServiceImpl implements AxeHomeOwnerService {

    @Autowired
    private AxeHomeOwnerRepository axeHomeOwnerRepository;


    @Override
    public AxeHomeOwner registerAxeHomeOwner(AxeHomeOwnerDTO axeHomeOwnerDTO) {
        return null;
    }

    @Override
    public Optional<AxeHomeOwner> findAxeHomeOwnerByUsername(String username) {
        return Optional.empty();
    }
}
