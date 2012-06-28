package com.danveloper.gateways

import com.danveloper.Coverage
import com.danveloper.Quote

interface CoveragesWorkflowGateway {
    List<Coverage> getApplicableCoverages(Quote quote);
}
