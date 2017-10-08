package com.brctl.common.refactoring.chapter10.section12.after.bysubclass;

/**
 * Factory by subclass
 * @author duanxiaoxing
 * @created 2017/10/7
 */
public class Employee {

    static Employee createEngineer() {
        return new Engineer();
    }

    static Employee createSalesman() {
        return new Salesman();
    }

    static Employee createManager() {
        return new Manager();
    }

}
