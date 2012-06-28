package com.danveloper

class Quote {
    Client client
    BigDecimal basePremium
    Integer yearOfHouse
    Integer lossCount
    String quoteType

    static hasMany = [coverages: Coverage, discounts: Discount]

    static constraints = {
    }
}
