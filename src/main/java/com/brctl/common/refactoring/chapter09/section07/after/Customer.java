package com.brctl.common.refactoring.chapter09.section07.after;

import lombok.Getter;
import lombok.Setter;

/**
 * @author duanxiaoxing
 * @created 2017/10/8
 */
@Setter
public class Customer implements Nullable {

    private PaymentHistory history;
    private BillingPlan plan;
    @Getter
    private String name;

    protected Customer() {
        this.history = new PaymentHistory();
        this.plan = new BillingPlan();
        this.name = "default name";
    }

    public boolean isNull() {
        return false;
    }

    /**
     * prefer Singleton Model
     * @return NullCustomer <b>singleton</b>
     */
    static Customer nullCustomer() {
        return NullCustomer.singleton();
    }

    static Customer create() {
        return new Customer();
    }

    public PaymentHistory getHistory() {
        return history == null ? PaymentHistory.nullPaymentHistory() : PaymentHistory.basicHistory();
    }

    public BillingPlan getPlan() {
        return plan == null ? BillingPlan.nullBillingPlan() : BillingPlan.basicPlan();
    }

}
