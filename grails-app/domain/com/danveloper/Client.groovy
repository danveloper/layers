package com.danveloper

import org.joda.time.LocalDate

class Client {
    String firstName
    String lastName
    LocalDate dateOfBirth
    Address address
    boolean convictedArsonist = false

    static constraints = {
        firstName nullable: false, blank: false
        lastName nullable:  false, blank:  false
        dateOfBirth nullable: false
        address nullable: false
    }
}
