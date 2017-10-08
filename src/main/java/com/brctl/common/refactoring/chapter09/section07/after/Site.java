package com.brctl.common.refactoring.chapter09.section07.after;

import lombok.Setter;

/**
 * @author duanxiaoxing
 * @created 2017/10/8
 */
public class Site {

    @Setter
    private Customer customer;

    /**
     * key point
     * @return customer
     */
    public Customer getCustomer() {
        return customer == null ? Customer.nullCustomer() : Customer.create();
    }

}
