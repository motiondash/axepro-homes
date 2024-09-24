package co.zw.axepro.axeprohomes.repository;


import co.zw.axepro.axeprohomes.model.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PropertyRepository extends JpaRepository<Property, Long> {
    List<Property> findByLocationAndIsForRent(String location, boolean isForRent);
}
