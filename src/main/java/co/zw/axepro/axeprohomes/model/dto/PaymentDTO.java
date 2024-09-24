package co.zw.axepro.axeprohomes.model.dto;

import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class PaymentDTO {

    private BigDecimal amount;
    private Long axeUserId;
    private Long propertyId;
}
