package com.danveloper.rules.coverages

import com.danveloper.rules.BusinessRule
import com.danveloper.Quote
import com.danveloper.Coverage

class FloodCoverageRule implements BusinessRule {
    @Override
    Coverage process(Quote quote) {
        if (quote.client?.address?.state != "FL") {
            return Coverage.findByName("Flood Coverage")
        } else {
            return new Coverage()
        }
    }
}
