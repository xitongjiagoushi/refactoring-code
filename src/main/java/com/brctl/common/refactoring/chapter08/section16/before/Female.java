package com.brctl.common.refactoring.chapter08.section16.before;

/**
 * @author duanxiaoxing
 * @created 2017/10/7
 */
public class Female extends Person {

    @Override
    boolean isMale() {
        return false;
    }

    @Override
    char getCode() {
        return 'F';
    }

}
