package com.danveloper.rules

import com.danveloper.Quote

interface BusinessRule {
    public Object process(Quote quote);
}
