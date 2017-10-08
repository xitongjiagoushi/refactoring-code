package com.brctl.common.refactoring.chapter08.section15.after;

import java.lang.reflect.Constructor;

/**
 * @author duanxiaoxing
 * @created 2017/10/7
 */
public abstract class EmployeeType {

    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    abstract int getType();

    static EmployeeType newType(int type) {
        /**
         * direction:
         * 1. chapter10 - section12 [Replace Constructor with Factory Method]
         * 2. chapter09 - section06 [Replace Conditional with Polymorphism]
         */
        try {
            Constructor<EmployeeType> constructor = (Constructor<EmployeeType>) Class.forName("EngineerType").getConstructor();
            constructor.newInstance();
        } catch (Exception e) {

        }
        switch (type) {
            case ENGINEER:
                return new EngineerType();
            case SALESMAN:
                return new SalesmanType();
            case MANAGER:
                return new ManagerType();
            default:
                throw new IllegalArgumentException("Incorrect employee type code");
        }

    }

}
