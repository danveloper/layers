package com.danveloper

import org.joda.time.LocalDate
import com.danveloper.services.QuotingService
import grails.converters.JSON

class QuoteController {
    QuotingService quotingService

    def update(Quote quote) {
        session.quote = quote
        redirect(action: params.next)
    }

    def index() {
        if (!session.quote) {
            session.quote = new Quote()
        }
    }

    def coverages() {
        Quote quote = session.quote
        [coverages: quotingService.getAvailableCoverages(quote)]
    }

    def discounts() {
        Quote quote = session.quote
        [discounts: quotingService.getAvailableDiscounts(quote)]
    }
}
