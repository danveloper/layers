package com.danveloper.rules.discounts

import com.danveloper.Discount
import com.danveloper.commands.QuoteCommand
import com.danveloper.rules.BusinessRule

class NoLossDiscountRule implements BusinessRule {
    @Override
    Discount process(QuoteCommand quoteCommand) {
        Discount noLossDiscount = Discount.findByName("No Loss Discount")
        if (quoteCommand?.quote.lossCount == 0) {
            return noLossDiscount
        } else {
            return new Discount()
        }
    }
}
