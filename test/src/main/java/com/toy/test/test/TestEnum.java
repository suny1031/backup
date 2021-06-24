package com.toy.test.test;

public enum TestEnum implements FieldEnum{

    ONE("1","첫번째"),
    TWO("2","두번째");

    String filed;
    String name;

    TestEnum(String filed, String name) {
        this.filed = filed;
        this.name = name;
    }

    @Override
    public String getField() {
        return filed;
    }
}
