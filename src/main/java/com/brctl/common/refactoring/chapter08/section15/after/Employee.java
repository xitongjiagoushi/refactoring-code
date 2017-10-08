package com.brctl.common.refactoring.chapter08.section15.after;

/**
 * @author duanxiaoxing
 * @created 2017/10/7
 */
public class Employee {

    private int monthlySalary;
    private int commission;
    private int bonus;

    private EmployeeType type;

    private Employee(int type) {
        this.setType(type);
    }

    public void setType(int type) {
        this.type = EmployeeType.newType(type);
    }

    public int payAmount() {
        switch (type.getType()) {
            case EmployeeType.ENGINEER:
                return monthlySalary;
            case EmployeeType.SALESMAN:
                return monthlySalary + commission;
            case EmployeeType.MANAGER:
                return monthlySalary + bonus;
            default:
                throw new RuntimeException("Incorrect employee");
        }
    }

}
