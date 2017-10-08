package com.brctl.common.refactoring.chapter10.section12.after.byint;

import com.sun.xml.internal.ws.api.pipe.Engine;

/**
 * Factory by int
 * @author duanxiaoxing
 * @created 2017/10/7
 */
public class Employee {

    private static final int ENGINEER = 0;
    private static final int SALESMAN = 1;
    private static final int MANAGER = 2;

    static Employee create(int type) {
        switch (type) {
            case ENGINEER:
                return new Engineer();
            case SALESMAN:
                return new Salesman();
            case MANAGER:
                return new Manager();
            default:
                throw new IllegalArgumentException("Incorrect Employee type");
        }
    }

    // for extends
    protected Employee() {}

}
