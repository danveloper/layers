package com.danveloper.rules.discounts

import com.danveloper.Quote
import com.danveloper.Discount
import com.danveloper.rules.BusinessRule

class NonArsonistDiscountRule implements BusinessRule {
    @Override
    Discount process(Quote quote) {
        Discount nonArsonistDiscount = Discount.findByName("Non-Arsonist Discount")
        if (!quote.client?.convictedArsonist) {
            return nonArsonistDiscount
        } else {
            return new Discount()
        }
    }
}
