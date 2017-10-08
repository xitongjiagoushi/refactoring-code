package com.brctl.common.refactoring.chapter09.section07.after;

/**
 * @author duanxiaoxing
 * @created 2017/10/8
 */
public class NullPaymentHistory extends PaymentHistory implements Nullable {

    @Override
    public int getWeeksDelinquentInLastYear() {
        return 0;
    }

    @Override
    public boolean isNull() {
        return true;
    }

}
