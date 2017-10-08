package com.brctl.common.refactoring.chapter08.section14.after;

/**
 * @author duanxiaoxing
 * @created 2017/10/7
 */
public abstract class Employee {

    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    static Employee create(int type) {
        switch (type) {
            case ENGINEER:
                return new Engineer();
            case SALESMAN:
                return new Salesman();
            case MANAGER:
                return new Manager();
            default:
                throw new IllegalArgumentException("Incorrect type code value");
        }
    }

    abstract int getType();

}
