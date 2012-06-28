package com.danveloper.services

import com.danveloper.Quote
import com.danveloper.gateways.CoveragesWorkflowGateway

class QuotingService {
    def discountsGateway
    def coveragesWorkflowGateway

    def getAvailableDiscounts(Quote quote) {
        discountsGateway.getApplicableDiscounts(quote)
    }

    def getAvailableCoverages(Quote quote) {
        coveragesWorkflowGateway.getApplicableCoverages(quote)
    }
}
