package com.danveloper.gateways

import com.danveloper.Coverage
import com.danveloper.commands.QuoteCommand

interface CoveragesWorkflowGateway {
    List<Coverage> getApplicableCoverages(QuoteCommand quote);
}
