package com.danveloper.rules.coverages

import com.danveloper.Coverage
import com.danveloper.Quote
import com.danveloper.rules.BusinessRule

class TheftCoverageRule implements BusinessRule {

    Coverage process(Quote quote) {
        if (quote.client?.address?.city?.toUpperCase() == "GAINESVILLE") {
            return Coverage.findByName("Theft Coverage")
        } else {
            return new Coverage()
        }
    }
}
