package com.danveloper.tests;

import static org.junit.Assert.*

import grails.test.mixin.*
import grails.test.mixin.support.*
import org.junit.*
import com.danveloper.Quote
import com.danveloper.Client
import org.joda.time.LocalDate
import com.danveloper.Address
import com.danveloper.gateways.DiscountsWorkflowGateway
import com.danveloper.Discount

@TestMixin(GrailsUnitTestMixin)
public class DiscountsWorkflowTests {
    Quote quote
    DiscountsWorkflowGateway discountsWorkflowGateway
    void setUp() {
        Address address = new Address(street: "1 Main St", city: "Gainesville", state: "FL", zipcode: 32601, milesFromCoast: 5).save()
        Client client = new Client(firstName: "Dan", lastName: "Woods", dateOfBirth: new LocalDate("1970-01-01"), address: address).save()
        quote = new Quote(client: client, lossCount: 0)
    }

    void tearDown() {
        // Tear down logic here
    }

    void testSomething() {
        Discount noLossDiscount = Discount.findByName("No Loss Discount")
        def discounts = discountsWorkflowGateway.getApplicableDiscounts(quote)
        assert discounts.contains(noLossDiscount)
    }
}
