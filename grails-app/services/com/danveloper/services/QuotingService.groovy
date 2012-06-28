package com.danveloper.services

import com.danveloper.Quote
import com.danveloper.gateways.CoveragesWorkflowGateway

class QuotingService {
    def discountsWorkflowGateway
    def coveragesWorkflowGateway

    def getAvailableDiscounts(Quote quote) {
        discountsWorkflowGateway.getApplicableDiscounts(quote)
    }

    def getAvailableCoverages(Quote quote) {
        coveragesWorkflowGateway.getApplicableCoverages(quote)
    }
}
