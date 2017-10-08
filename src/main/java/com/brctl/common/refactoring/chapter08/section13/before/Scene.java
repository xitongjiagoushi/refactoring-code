package com.brctl.common.refactoring.chapter08.section13.before;

import lombok.extern.slf4j.Slf4j;

/**
 * [Replace Type with Class]
 * @author duanxiaoxing
 * @created 2017/10/8
 */
@Slf4j
public class Scene {

    public static void main(String[] args) {
        Person personO = new Person(Person.O);
        Person personA = new Person(Person.A);
        Person personB = new Person(Person.B);
        Person personAB = new Person(Person.AB);

        log.info("personO: {}, personA: {}, personB: {}, personAB: {}", personO, personA, personB, personAB);
    }

}
