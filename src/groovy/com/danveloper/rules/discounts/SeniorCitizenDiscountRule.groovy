package com.danveloper.rules.discounts

import com.danveloper.Quote
import org.joda.time.LocalDate
import com.danveloper.Discount
import com.danveloper.rules.BusinessRule

class SeniorCitizenDiscountRule implements BusinessRule {
    @Override
    Discount process(Quote quote) {
        Discount seniorCitizenDiscount = Discount.findByName("Senior Citizen's Discount")
        if (quote.client?.dateOfBirth.isBefore(new LocalDate().minusYears(50))) {
            return seniorCitizenDiscount
        } else {
            return new Discount();
        }
    }
}
