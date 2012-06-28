package com.danveloper.gateways

import com.danveloper.Discount
import com.danveloper.commands.QuoteCommand

interface DiscountsWorkflowGateway {
    public List<Discount> getApplicableDiscounts(QuoteCommand quote);
}
