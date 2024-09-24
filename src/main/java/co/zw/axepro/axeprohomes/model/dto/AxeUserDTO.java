package co.zw.axepro.axeprohomes.model.dto;

import co.zw.axepro.axeprohomes.model.UserRoles;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AxeUserDTO {

    private String username;
    private String email;
    private String password;


    private UserRoles userRole;
}
