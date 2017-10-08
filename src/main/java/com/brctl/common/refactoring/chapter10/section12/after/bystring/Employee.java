package com.brctl.common.refactoring.chapter10.section12.after.bystring;

/**
 * Factory by String
 * @author duanxiaoxing
 * @created 2017/10/7
 */
public class Employee {

    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    static Employee create(String className) {
        try {
            return (Employee) Class.forName(className).newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("Illegal Employee class name");
        }
    }

    private int type;

    private Employee(int type) {
        this.type = type;
    }

}
