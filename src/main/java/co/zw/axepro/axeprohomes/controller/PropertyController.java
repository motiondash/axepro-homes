package co.zw.axepro.axeprohomes.controller;

import co.zw.axepro.axeprohomes.model.dto.PropertyDTO;
import co.zw.axepro.axeprohomes.model.AxeUser;
import co.zw.axepro.axeprohomes.model.Property;
import co.zw.axepro.axeprohomes.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/properties")
public class PropertyController {

    @Autowired
    private PropertyService propertyService;

    @PostMapping("/add")
    public ResponseEntity<Property> addProperty(@RequestBody PropertyDTO propertyDTO) {
        // Map DTO to Entity
        Property property = new Property();
        property.setTitle(propertyDTO.getTitle());
        property.setDescription(propertyDTO.getDescription());
        property.setLocation(propertyDTO.getLocation());
        property.setPrice(propertyDTO.getPrice());
        property.setForRent(propertyDTO.isForRent());

        Property addedProperty = propertyService.addProperty(property);
        return ResponseEntity.ok(addedProperty);
    }
}
