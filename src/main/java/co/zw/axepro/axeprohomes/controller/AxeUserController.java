package co.zw.axepro.axeprohomes.controller;

import co.zw.axepro.axeprohomes.model.AxeHomeOwner;
import co.zw.axepro.axeprohomes.model.dto.AxeHomeOwnerDTO;
import co.zw.axepro.axeprohomes.model.dto.AxeUserDTO;
import co.zw.axepro.axeprohomes.model.AxeUser;
import co.zw.axepro.axeprohomes.service.AxeHomeOwnerService;
import co.zw.axepro.axeprohomes.service.AxeUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/axeUsers")
public class AxeUserController {

    @Autowired
    private AxeUserService axeUserService;
    @Autowired
    AxeHomeOwnerService axeHomeOwnerService;

    @PostMapping("/register/user")
    public ResponseEntity<AxeUser> registerAxeUser(@RequestBody AxeUserDTO axeUserDTO) {
        // Map DTO to Entity
        AxeUser axeUser = new AxeUser();
        axeUser.setUsername(axeUserDTO.getUsername());
        axeUser.setEmail(axeUserDTO.getEmail());
        axeUser.setPassword(axeUserDTO.getPassword());  // Normally, you would encrypt this password

        AxeUser registeredUser = axeUserService.registerAxeUser(axeUser);
        return ResponseEntity.ok(registeredUser);
    }

    @PostMapping("/register/axeHomeOwner")
    public ResponseEntity<AxeHomeOwner> registerAxeHomeOwner(@RequestBody AxeHomeOwnerDTO axeHomeOwnerDTO) {
        // Map DTO to Entity
        AxeUser axeUser = new AxeUser();
        axeUser.setUsername(axeHomeOwnerDTO.getUsername());
        axeUser.setEmail(axeHomeOwnerDTO.getEmail());
        axeUser.setPassword(axeHomeOwnerDTO.getPassword());  // Normally, you would encrypt this password

        AxeHomeOwner registeredUser = axeHomeOwnerService.registerAxeHomeOwner(axeHomeOwnerDTO);
        return ResponseEntity.ok(registeredUser);
    }
}
