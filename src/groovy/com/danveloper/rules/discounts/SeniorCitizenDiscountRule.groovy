package com.danveloper.rules.discounts

import com.danveloper.Quote
import org.joda.time.LocalDate
import com.danveloper.Discount
import com.danveloper.rules.BusinessRule
import com.danveloper.commands.QuoteCommand

class SeniorCitizenDiscountRule implements BusinessRule {
    @Override
    Discount process(QuoteCommand quoteCommand) {
        Discount seniorCitizenDiscount = Discount.findByName("Senior Citizen's Discount")
        if (quoteCommand?.quote.client?.dateOfBirth.isBefore(new LocalDate().minusYears(50))) {
            return seniorCitizenDiscount
        } else {
            return new Discount();
        }
    }
}
