package com.brctl.common.refactoring.chapter08.section13.after;

/**
 * @author duanxiaoxing
 * @created 2017/10/8
 */
public class BloodGroup {

    public static final BloodGroup O = new BloodGroup(0);
    public static final BloodGroup A = new BloodGroup(1);
    public static final BloodGroup B = new BloodGroup(2);
    public static final BloodGroup AB = new BloodGroup(3);

    private final int code;

    public BloodGroup(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

}
