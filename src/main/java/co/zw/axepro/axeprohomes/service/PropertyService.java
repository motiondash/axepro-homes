package co.zw.axepro.axeprohomes.service;

import co.zw.axepro.axeprohomes.model.Property;
import java.util.List;

public interface PropertyService {
    Property addProperty(Property property);
    List<Property> searchPropertyByLocation(String location, boolean isForRent);
}
