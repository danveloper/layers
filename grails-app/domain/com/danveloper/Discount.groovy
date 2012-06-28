package com.danveloper

class Discount {
    String name
    Boolean percentage
    BigDecimal amount

    static constraints = {
        name nullable: false, blank: false
        percentage nullable: true
        amount nullable: false, blank: false
    }
}
