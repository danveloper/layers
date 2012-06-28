package com.danveloper.rules.coverages

import com.danveloper.rules.BusinessRule
import com.danveloper.Quote
import com.danveloper.Coverage

class CoastalDistanceCoverageRule implements BusinessRule {
    @Override
    Coverage process(Quote quote) {
        if (quote?.client?.address?.milesFromCoast > 5) {
            return Coverage.findByName("Coastal Distance Coverage")
        } else {
            return new Coverage()
        }
    }
}
