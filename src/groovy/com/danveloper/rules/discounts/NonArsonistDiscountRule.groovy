package com.danveloper.rules.discounts

import com.danveloper.Quote
import com.danveloper.Discount
import com.danveloper.rules.BusinessRule
import com.danveloper.commands.QuoteCommand

class NonArsonistDiscountRule implements BusinessRule {
    @Override
    Discount process(QuoteCommand quoteCommand) {
        Discount nonArsonistDiscount = Discount.findByName("Non-Arsonist Discount")
        if (!quoteCommand?.quote.client?.convictedArsonist) {
            return nonArsonistDiscount
        } else {
            return new Discount()
        }
    }
}
