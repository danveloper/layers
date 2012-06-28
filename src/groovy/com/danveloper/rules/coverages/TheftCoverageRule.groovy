package com.danveloper.rules.coverages

import com.danveloper.Coverage
import com.danveloper.Quote
import com.danveloper.rules.BusinessRule
import com.danveloper.commands.QuoteCommand

class TheftCoverageRule implements BusinessRule {

    Coverage process(QuoteCommand quoteCommand) {
        if (quoteCommand?.quote.client?.address?.city?.toUpperCase() == "GAINESVILLE") {
            return Coverage.findByName("Theft Coverage")
        } else {
            return new Coverage()
        }
    }
}
