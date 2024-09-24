package co.zw.axepro.axeprohomes.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String location;
    private BigDecimal price;
    private boolean isForRent;

    @ManyToOne
    @JoinColumn(name = "axe_home_owner_id")
    private AxeHomeOwner axeHomeOwner;
}
