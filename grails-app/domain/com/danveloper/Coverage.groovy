package com.danveloper

class Coverage {
    String name
    Boolean percentage
    BigDecimal amount

    static constraints = {
        name nullable: false, blank:  false
        percentage nullable: true
        amount nullable: false
    }
}
