package com.brctl.common.refactoring.chapter08.section13.after_second;

/**
 * Use enum instead of class
 * @author duanxiaoxing
 * @created 2017/10/8
 */
public enum BloodGroup {

    O(0),
    A(1),
    B(2),
    AB(3);

    private final int code;

    BloodGroup(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static BloodGroup getBloodGroupByCode(int code) {
        /**
         * TODO is there any better way to get enum?
         */
        switch (code) {
            case 0:
                return O;
            case 1:
                return A;
            case 2:
                return B;
            case 3:
                return AB;
            default:
                throw new IllegalArgumentException("Incorrect BloodGroup code");
        }
    }

}
