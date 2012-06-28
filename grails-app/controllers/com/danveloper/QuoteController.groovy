package com.danveloper

import org.joda.time.LocalDate
import com.danveloper.services.QuotingService
import grails.converters.JSON

class QuoteController {
    QuotingService quotingService

    def index() {
        def address = new Address(street: "1 Main St", city: "Gainesville", state: "FL", zipcode: 32605, milesFromCoast: 10).save(flush: true);
        def client = new Client(firstName: "Dan", lastName: "Woods", dateOfBirth: new LocalDate("1984-11-09"), address: address).save(flush: true);
        def quote = new Quote(client: client, yearOfHouse: 2005, lossCount: 0)
        //def ratedQuote = quotingService.rateQuote(quote)
        def coverages = quotingService.getAvailableCoverages(quote)
        render coverages as JSON
    }
}
