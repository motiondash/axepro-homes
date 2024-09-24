package co.zw.axepro.axeprohomes.controller;

import co.zw.axepro.axeprohomes.model.Property;
import co.zw.axepro.axeprohomes.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/search")
public class SearchController {

    @Autowired
    private SearchService searchService;

    @GetMapping("/properties")
    public ResponseEntity<List<Property>> searchProperties(
            @RequestParam String location,
            @RequestParam boolean isForRent) {
        List<Property> properties = searchService.searchProperties(location, isForRent);
        return ResponseEntity.ok(properties);
    }

    @GetMapping("/propertiesByPrice")
    public ResponseEntity<List<Property>> searchPropertiesByPriceRange(
            @RequestParam String location,
            @RequestParam boolean isForRent,
            @RequestParam double minPrice,
            @RequestParam double maxPrice) {
        List<Property> properties = searchService.searchPropertiesByPriceRange(location, isForRent, minPrice, maxPrice);
        return ResponseEntity.ok(properties);
    }
}
