package co.zw.axepro.axeprohomes.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class PropertyDTO {


    private String title;

    private String description;

    private String location;
    private BigDecimal price;
    private boolean isForRent;
    public PropertyDTO(String title, String description, String location, BigDecimal price, boolean isForRent) {
        this.title = title;
        this.description = description;
        this.location = location;
        this.price = price;
        this.isForRent = isForRent;
    }


}

