package com.danveloper.rules.quotescreen

import com.danveloper.rules.BusinessRule
import com.danveloper.commands.QuoteCommand
import com.danveloper.Quote

/**
 * Business rule to determine if we should show the "Townhouse/Rowhouse" option on the Quote screen
 * The Townhouse/Rowhouse option is only available to "Homeowners" quotes, so don't show it for the other types
 */
class TownOrRowhouseBusinessRule implements BusinessRule {
    @Override
    Object process(QuoteCommand quoteCommand) {
        if (quoteCommand.quote?.quoteType?.toUpperCase() == "HOMEOWNERS") {
            quoteCommand.townOrRowhouseOption = true
        } else {
            quoteCommand.townOrRowhouseOption = false
        }
        quoteCommand
    }
}
