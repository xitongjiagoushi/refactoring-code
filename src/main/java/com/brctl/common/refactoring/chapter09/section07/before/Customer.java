package com.brctl.common.refactoring.chapter09.section07.before;

import lombok.Data;

/**
 * @author duanxiaoxing
 * @created 2017/10/8
 */
@Data
public class Customer {

    private PaymentHistory history;
    private BillingPlan plan;
    private String name;

    public Customer() {
        this.history = PaymentHistory.basicHistory();
        this.plan = new BillingPlan();
        this.name = "default name";
    }

}
