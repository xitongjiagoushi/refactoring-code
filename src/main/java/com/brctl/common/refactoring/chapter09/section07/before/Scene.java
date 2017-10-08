package com.brctl.common.refactoring.chapter09.section07.before;

import lombok.extern.slf4j.Slf4j;

/**
 * Scene / Client to combine the process
 * @author duanxiaoxing
 * @created 2017/10/8
 */
@Slf4j
public class Scene {

    public static void main(String[] args) {
        Site site = new House();

        BillingPlan plan;
        Customer customer = site.getCustomer();
        if (customer == null) {
            plan = BillingPlan.basicPlan();
        } else {
            plan = customer.getPlan();
        }

        String customerName;
        if (customer == null) {
            customerName = "occupant";
        } else {
            customerName = customer.getName();
        }

        int weeksDelinquent;
        if (customer == null) {
            weeksDelinquent = 0;
        } else {
            /**
             * customer.getHistory() != null
             */
            weeksDelinquent = customer.getHistory().getWeeksDelinquentInLastYear();
        }

        log.info("customerName: {}, plan: {}, weeksDelinquent: {}", customerName, plan, weeksDelinquent);
    }

}
