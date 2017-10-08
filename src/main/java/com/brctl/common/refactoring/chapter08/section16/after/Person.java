package com.brctl.common.refactoring.chapter08.section16.after;

import lombok.Getter;

/**
 * After refactoring <br>
 * remove subclass and <b>constant method</b>, use field instead
 * @author duanxiaoxing
 * @created 2017/10/7
 */
public class Person {

    @Getter
    private final boolean isMale;
    @Getter
    private final char code;

    private Person(boolean isMale, char code) {
        this.isMale = isMale;
        this. code = code;
    }

    /**
     * create male
     * @return Person
     */
    static Person createMale() {
        return new Person(true, 'M');
    }


    /**
     * create female
     * @return Person
     */
    static Person createFemale() {
        return new Person(false, 'F');
    }

}
