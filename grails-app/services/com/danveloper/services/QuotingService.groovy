package com.danveloper.services

import com.danveloper.Quote
import com.danveloper.gateways.CoveragesWorkflowGateway

class QuotingService {
    def ratingGateway
    CoveragesWorkflowGateway coveragesWorkflowGateway
    def rateQuote(Quote quote) {
        ratingGateway.rateQuote(quote)
    }

    def getAvailableCoverages(Quote quote) {
        coveragesWorkflowGateway.getApplicableCoverages(quote)
    }
}
