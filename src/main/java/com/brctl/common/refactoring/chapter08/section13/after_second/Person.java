package com.brctl.common.refactoring.chapter08.section13.after_second;

import lombok.ToString;

/**
 * @author duanxiaoxing
 * @created 2017/10/8
 */
@ToString
public class Person {

    private BloodGroup bloodGroup;

    public Person(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public int getBloodGroup() {
        return bloodGroup.getCode();
    }

    public void setBloodGroup(int bloodGroup) {
        this.bloodGroup = BloodGroup.getBloodGroupByCode(bloodGroup);
    }

}
