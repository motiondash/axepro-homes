package co.zw.axepro.axeprohomes.serviceImpl;

import co.zw.axepro.axeprohomes.model.Payment;
import co.zw.axepro.axeprohomes.repository.PaymentRepository;
import co.zw.axepro.axeprohomes.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public Payment processPayment(Payment payment) {
        return paymentRepository.save(payment);
    }
}
