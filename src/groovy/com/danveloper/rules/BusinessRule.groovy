package com.danveloper.rules

import com.danveloper.commands.QuoteCommand

interface BusinessRule {
    public Object process(QuoteCommand quoteCommand);
}
