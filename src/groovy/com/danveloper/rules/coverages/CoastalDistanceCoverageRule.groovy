package com.danveloper.rules.coverages

import com.danveloper.rules.BusinessRule
import com.danveloper.Quote
import com.danveloper.Coverage
import com.danveloper.commands.QuoteCommand

class CoastalDistanceCoverageRule implements BusinessRule {
    @Override
    Coverage process(QuoteCommand quoteCommand) {
        if (quoteCommand?.quote?.client?.address?.milesFromCoast > 5) {
            return Coverage.findByName("Coastal Distance Coverage")
        } else {
            return new Coverage()
        }
    }
}
