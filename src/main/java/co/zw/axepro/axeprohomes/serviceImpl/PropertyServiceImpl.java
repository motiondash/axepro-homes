package co.zw.axepro.axeprohomes.serviceImpl;

import co.zw.axepro.axeprohomes.model.Property;
import co.zw.axepro.axeprohomes.repository.PropertyRepository;
import co.zw.axepro.axeprohomes.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyServiceImpl implements PropertyService {

    @Autowired
    private PropertyRepository propertyRepository;

    @Override
    public Property addProperty(Property property) {
        return propertyRepository.save(property);
    }

    @Override
    public List<Property> searchPropertyByLocation(String location, boolean isForRent) {
        return propertyRepository.findByLocationAndIsForRent(location, isForRent);
    }
}
