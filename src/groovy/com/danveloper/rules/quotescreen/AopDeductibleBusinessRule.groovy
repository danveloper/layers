package com.danveloper.rules.quotescreen

import com.danveloper.commands.QuoteCommand
import com.danveloper.rules.BusinessRule

/**
 * All Other Perils Deductible Display Business Rule.
 * All Other Perils Deductible option is available only to clients who live in Gainesville,
 * and the applicable deductible options are $500 and $1000
 */
class AopDeductibleBusinessRule implements BusinessRule {
    @Override
    Object process(QuoteCommand quoteCommand) {
        if (quoteCommand?.quote?.client?.address?.city?.toUpperCase() == "GAINESVILLE") {
            quoteCommand.with {
                showAopDeductible = true
                aopDeductibleValues = [500, 1000]
            }
        }
        quoteCommand
    }
}
