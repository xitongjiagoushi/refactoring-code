package com.brctl.common.refactoring.chapter09.section07.after;

/**
 * @author duanxiaoxing
 * @created 2017/10/8
 */
public class NullBillingPlan extends BillingPlan implements Nullable {

    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getDetails() {
        return "null billing plan";
    }

}
