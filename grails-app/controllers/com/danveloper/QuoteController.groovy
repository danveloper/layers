package com.danveloper

import com.danveloper.commands.QuoteCommand
import org.joda.time.LocalDate

class QuoteController {
    def quotingService
    def quoteScreenWorkflowGateway

    def beforeInterceptor = {
        def address = new Address(street: "1 MAIN ST", city: "GAINESVILLE", state: "FL", zipcode: 32605, milesFromCoast: 50)
        def client = new Client(firstName: "Dan", lastName: "Woods", dateOfBirth: new LocalDate("1970-01-01"), address: address)
        def quote = new Quote(client: client, lossCount: 1, quoteType: "Condo")

        def quoteCommand = new QuoteCommand(quote: quote)

        session.quoteCommand = quoteCommand
    }

    def testQuoteScreenRules() {
        def quoteCommandWithRulesApplied = quoteScreenWorkflowGateway.applyRules(session.quoteCommand)

        assert quoteCommandWithRulesApplied.showAopDeductible == true
        assert quoteCommandWithRulesApplied.aopDeductibleValues == [500, 1000]
        assert quoteCommandWithRulesApplied.townOrRowhouseOption == false

        render true
    }

    def testCoverageRules() {
        def coverages = quotingService.getAvailableCoverages(session.quoteCommand)

        def theftCoverage = Coverage.findByName("Theft Coverage")
        def floodCoverage = Coverage.findByName("Flood Coverage")
        def coastalDistanceCoverageRule = Coverage.findByName("Coastal Distance Coverage")
        assert coverages.contains(theftCoverage) && coverages.contains(coastalDistanceCoverageRule) && !coverages.contains(floodCoverage)

        render true
    }

    def testDiscountRules() {
        def discounts = quotingService.getAvailableDiscounts(session.quoteCommand)

        def seniorCitizenDiscount = Discount.findByName("Senior Citizen's Discount")
        def nonArsonistDiscount = Discount.findByName("Non-Arsonist Discount")
        def noLossDiscount = Discount.findByName("No Loss Discount")
        assert discounts.contains(nonArsonistDiscount) && !discounts.contains(noLossDiscount) && !discounts.contains(seniorCitizenDiscount)

        render true
    }
}
