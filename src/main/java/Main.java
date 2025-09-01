import br.com.mariojp.solid.ocp.*;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<CustomerType, DiscountPolicy> discountPolicies = Map.of(
            CustomerType.REGULAR, new RegularPolicy(),
            CustomerType.PREMIUM, new PremiumPolicy(),
            CustomerType.PARTNER, new PartnerPolicy()
        );

        DiscountCalculator calc = new DiscountCalculator(discountPolicies);

        System.out.println("REGULAR 100 -> " + calc.apply(100, CustomerType.REGULAR));
        System.out.println("PREMIUM 100 -> " + calc.apply(100, CustomerType.PREMIUM));
        System.out.println("PARTNER 100 -> " + calc.apply(100, CustomerType.PARTNER));
    }
}
