package com.danveloper.gateways

import com.danveloper.commands.QuoteCommand

interface QuoteScreenWorkflowGateway {
    public QuoteCommand applyRules(QuoteCommand quoteCommand);
}
