package com.brctl.common.refactoring.chapter09.section07.after;

/**
 * @author duanxiaoxing
 * @created 2017/10/8
 */
public class NullCustomer extends Customer implements Nullable {

    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public PaymentHistory getHistory() {
        return PaymentHistory.nullPaymentHistory();
    }

    @Override
    public String getName() {
        return "occupant";
    }

    @Override
    public BillingPlan getPlan() {
        return BillingPlan.nullBillingPlan();
    }

    @Override
    public void setHistory(PaymentHistory history) {
        super.setHistory(PaymentHistory.nullPaymentHistory());
    }

    @Override
    public void setPlan(BillingPlan plan) {
        super.setPlan(BillingPlan.nullBillingPlan());
    }

    /**
     * singleton holder
     */
    private static final class SingletonHolder {
        private static final NullCustomer nullCustomer = new NullCustomer();
        private SingletonHolder() {}
    }

    static NullCustomer singleton() {
        return SingletonHolder.nullCustomer;
    }

}
