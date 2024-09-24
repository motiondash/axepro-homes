package co.zw.axepro.axeprohomes.serviceImpl;

import co.zw.axepro.axeprohomes.model.Property;
import co.zw.axepro.axeprohomes.repository.PropertyRepository;
import co.zw.axepro.axeprohomes.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    private PropertyRepository propertyRepository;

    @Override
    public List<Property> searchProperties(String location, boolean isForRent) {
        // Search properties by location and rent/sale status
        return propertyRepository.findByLocationAndIsForRent(location, isForRent);
    }

    @Override
    public List<Property> searchPropertiesByPriceRange(String location, boolean isForRent, double minPrice, double maxPrice) {
        // Filter properties by location, rent/sale status, and price range
        return propertyRepository.findByLocationAndIsForRent(location, isForRent)
                .stream()
                .filter(property -> property.getPrice().doubleValue() >= minPrice && property.getPrice().doubleValue() <= maxPrice)
                .collect(Collectors.toList());
    }
}
