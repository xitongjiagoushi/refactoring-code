package com.brctl.common.refactoring.chapter09.section07.after;

import lombok.extern.slf4j.Slf4j;

/**
 * Scene / Client to combine the process
 * @author duanxiaoxing
 * @created 2017/10/8
 */
@Slf4j
public class Scene {

    public static void main(String[] args) {
        Site houseSite = new House();
        Customer customer = houseSite.getCustomer();
        BillingPlan plan = customer.getPlan();
        String customerName = customer.getName();
        int weeksDelinquent = customer.getHistory().getWeeksDelinquentInLastYear();
        log.info("customerName: {}, plan: {}, weeksDelinquent: {}", customerName, plan, weeksDelinquent);

        Site apartmentSite = new Apartment();
        customer = apartmentSite.getCustomer();
        plan = customer.getPlan();
        customerName = customer.getName();
        weeksDelinquent = customer.getHistory().getWeeksDelinquentInLastYear();
        log.info("customerName: {}, plan: {}, weeksDelinquent: {}", customerName, plan, weeksDelinquent);
    }

}
