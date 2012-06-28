package com.danveloper.services

import com.danveloper.commands.QuoteCommand

class QuotingService {
    def discountsWorkflowGateway
    def coveragesWorkflowGateway

    def getAvailableDiscounts(QuoteCommand quoteCommand) {
        discountsWorkflowGateway.getApplicableDiscounts(quoteCommand)
    }

    def getAvailableCoverages(QuoteCommand quoteCommand) {
        coveragesWorkflowGateway.getApplicableCoverages(quoteCommand)
    }
}
