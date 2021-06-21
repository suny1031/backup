package com.toy.scheduler.test;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TestEnum {
    type1(1,"치킨"),
    type2(2,"피자");

    private Integer id;
    private String name;

    TestEnum(Integer id, String name){
        this.id = id;
        this.name = name;
    }

    @JsonValue
    public Integer getName(){
        return id;
    }
}
