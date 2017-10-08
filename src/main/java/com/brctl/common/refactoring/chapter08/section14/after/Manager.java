package com.brctl.common.refactoring.chapter08.section14.after;

/**
 * @author duanxiaoxing
 * @created 2017/10/7
 */
public class Manager extends Employee {

    @Override
    int getType() {
        return Employee.MANAGER;
    }

}
