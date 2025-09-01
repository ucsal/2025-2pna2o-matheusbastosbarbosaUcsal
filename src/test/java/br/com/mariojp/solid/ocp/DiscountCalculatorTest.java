package br.com.mariojp.solid.ocp;

import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

public class DiscountCalculatorTest {

    @Test
    void partner_gets_12_percent() {
            Map<CustomerType, DiscountPolicy> policies = Map.of(
            CustomerType.REGULAR, new RegularPolicy(),
            CustomerType.PREMIUM, new PremiumPolicy(),
            CustomerType.PARTNER, new PartnerPolicy()
        );
        
        var calc = new DiscountCalculator(policies);

        assertEquals(88.0, calc.apply(100.0, CustomerType.PARTNER), 0.0001,
            "PARTNER deveria ter 12% de desconto");
    }
}
