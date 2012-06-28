package com.danveloper.gateways

import com.danveloper.Coverage
import com.danveloper.Quote
import com.danveloper.Discount


interface DiscountsWorkflowGateway {
    public Quote rateQuote(Quote quote);
}
