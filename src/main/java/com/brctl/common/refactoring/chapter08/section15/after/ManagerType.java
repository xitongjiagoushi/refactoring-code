package com.brctl.common.refactoring.chapter08.section15.after;

/**
 * @author duanxiaoxing
 * @created 2017/10/7
 */
public class ManagerType extends EmployeeType {

    @Override
    int getType() {
        return EmployeeType.MANAGER;
    }

}
