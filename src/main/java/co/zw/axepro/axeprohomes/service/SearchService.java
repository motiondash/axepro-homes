package co.zw.axepro.axeprohomes.service;

import co.zw.axepro.axeprohomes.model.Property;
import java.util.List;

public interface SearchService {
    List<Property> searchProperties(String location, boolean isForRent);
    List<Property> searchPropertiesByPriceRange(String location, boolean isForRent, double minPrice, double maxPrice);
}
