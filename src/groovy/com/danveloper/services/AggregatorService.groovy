package com.danveloper.services

import com.danveloper.Coverage
import com.danveloper.Discount

class AggregatorService {
    public Object aggregateCoverages(List<Coverage> availableCoverages) {
        availableCoverages.findAll { it.name != null }
    }
    public Object aggregateDiscounts(List<Discount> availableDiscounts) {
        availableDiscounts.findAll { it.name != null }
    }
}
