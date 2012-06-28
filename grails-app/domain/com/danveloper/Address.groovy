package com.danveloper

class Address {
    String street
    String unit
    String city
    String state
    Integer zipcode

    Integer milesFromCoast

    static constraints = {
        street nullable: false, blank: false
        unit nullable: true, blank: true
        city nullable: false, blank: false
        state nullable: false, blank: false
        zipcode nullable: false, blank: false
        milesFromCoast nullable: true
    }
}
