package com.brctl.common.refactoring.chapter10.section12.before;

import lombok.Getter;

/**
 * Constructor instead of Factory
 * @author duanxiaoxing
 * @created 2017/10/7
 */
public class Employee {

    @Getter
    private int type;

    public Employee(int type) {
        this.type = type;
    }

}
