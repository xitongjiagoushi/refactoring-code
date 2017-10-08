package com.brctl.common.refactoring.chapter08.section15.before;

/**
 * @author duanxiaoxing
 * @created 2017/10/7
 */
public class Employee {

    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    private int type;
    private int monthlySalary;
    private int commission;
    private int bonus;

    private Employee(int type) {
        this.type = type;
    }

    public int payAmount() {
        switch (type) {
            case ENGINEER:
                return monthlySalary;
            case SALESMAN:
                return monthlySalary + commission;
            case MANAGER:
                return monthlySalary + bonus;
            default:
                throw new RuntimeException("Incorrect employee");
        }
    }

}
