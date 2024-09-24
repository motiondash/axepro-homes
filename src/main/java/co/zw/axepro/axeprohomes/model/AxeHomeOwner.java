package co.zw.axepro.axeprohomes.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "axe_home_owner")
public class AxeHomeOwner{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email;
    private String password;
    @OneToMany(mappedBy = "axeHomeOwner")
    private List<Property> properties;
}
