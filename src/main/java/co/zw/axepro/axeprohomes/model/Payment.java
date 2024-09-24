package co.zw.axepro.axeprohomes.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal amount;
    private LocalDateTime paymentDate;

    @ManyToOne
    @JoinColumn(name = "axe_user_id")
    private AxeUser user;

    @ManyToOne
    @JoinColumn(name = "property_id")
    private Property property;

    // Constructors, Getters, and Setters
}
