package com.brctl.common.refactoring.chapter08.section13.after;

import lombok.extern.slf4j.Slf4j;

/**
 * [Replace Type with Class]
 * @author duanxiaoxing
 * @created 2017/10/8
 */
@Slf4j
public class Scene {

    public static void main(String[] args) {
        Person personO = new Person(BloodGroup.O);
        Person personA = new Person(BloodGroup.A);
        Person personB = new Person(BloodGroup.B);
        Person personAB = new Person(BloodGroup.AB);

        log.info("personO: {}, personA: {}, personB: {}, personAB: {}", personO, personA, personB, personAB);
    }
}
