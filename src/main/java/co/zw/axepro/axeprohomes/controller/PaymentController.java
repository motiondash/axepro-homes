package co.zw.axepro.axeprohomes.controller;

import co.zw.axepro.axeprohomes.model.Payment;
import co.zw.axepro.axeprohomes.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/process")
    public ResponseEntity<Payment> processPayment(@RequestBody Payment payment) {
        Payment processedPayment = paymentService.processPayment(payment);
        return ResponseEntity.ok(processedPayment);
    }
}
