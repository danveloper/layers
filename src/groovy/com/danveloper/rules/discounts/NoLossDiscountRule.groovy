package com.danveloper.rules.discounts

import com.danveloper.Quote
import com.danveloper.Discount
import com.danveloper.rules.BusinessRule

class NoLossDiscountRule implements BusinessRule {
    @Override
    Discount process(Quote quote) {
        Discount noLossDiscount = Discount.findByName("No Loss Discount")
        if (quote.lossCount == 0) {
            return noLossDiscount
        } else {
            return new Discount()
        }
    }
}
