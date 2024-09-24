package co.zw.axepro.axeprohomes.repository;

import co.zw.axepro.axeprohomes.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
