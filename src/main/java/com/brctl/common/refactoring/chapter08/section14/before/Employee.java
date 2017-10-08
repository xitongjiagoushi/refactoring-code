package com.brctl.common.refactoring.chapter08.section14.before;

/**
 * @author duanxiaoxing
 * @created 2017/10/7
 */
public class Employee {

    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    static Employee create(int type) {
        switch (type) {
            case ENGINEER:
            case SALESMAN:
            case MANAGER:
                return new Employee(type);
            default:
                throw new IllegalArgumentException("Incorrect type code value");
        }
    }

    private int type;

    private Employee(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

}
