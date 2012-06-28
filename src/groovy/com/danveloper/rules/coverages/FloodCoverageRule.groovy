package com.danveloper.rules.coverages

import com.danveloper.rules.BusinessRule
import com.danveloper.Quote
import com.danveloper.Coverage
import com.danveloper.commands.QuoteCommand

class FloodCoverageRule implements BusinessRule {
    @Override
    Coverage process(QuoteCommand quoteCommand) {
        if (quoteCommand?.quote.client?.address?.state != "FL") {
            return Coverage.findByName("Flood Coverage")
        } else {
            return new Coverage()
        }
    }
}
