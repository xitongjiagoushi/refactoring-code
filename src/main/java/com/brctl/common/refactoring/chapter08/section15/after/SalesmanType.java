package com.brctl.common.refactoring.chapter08.section15.after;

/**
 * @author duanxiaoxing
 * @created 2017/10/7
 */
public class SalesmanType extends EmployeeType {

    @Override
    int getType() {
        return EmployeeType.SALESMAN;
    }

}
