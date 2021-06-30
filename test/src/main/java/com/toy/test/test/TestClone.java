package com.toy.test.test;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;


@Setter
@Getter
@ToString
public class TestClone implements Cloneable {
    private String name;
    private String password;
    private Date date;

    @Override
    public TestClone clone() {
        TestClone clone = null;
        try {
            clone = (TestClone) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return clone;
    }

}
