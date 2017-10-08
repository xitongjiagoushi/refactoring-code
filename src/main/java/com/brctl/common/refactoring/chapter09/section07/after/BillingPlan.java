package com.brctl.common.refactoring.chapter09.section07.after;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author duanxiaoxing
 * @created 2017/10/8
 */
@ToString
public class BillingPlan {

    @Getter
    @Setter
    private String details;

    protected BillingPlan() {
        this.details = "null details";
    }

    protected BillingPlan(String details) {
        this.details = details;
    }

    static BillingPlan basicPlan() {
        return new BillingPlan("basic billing plan");
    }

    /**
     * prefer singleton
     * {@link NullCustomer#singleton}
     * @return NullBillingPlan
     */
    static BillingPlan nullBillingPlan() {
        return new NullBillingPlan();
    }

}
