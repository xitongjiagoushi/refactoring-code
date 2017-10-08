package com.brctl.common.refactoring.chapter09.section07.before;

/**
 * @author duanxiaoxing
 * @created 2017/10/8
 */
public class House extends Site {

    public House() {
        super.setCustomer(new Customer());
    }
}
