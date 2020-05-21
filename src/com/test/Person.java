package com.test;

/**
 * @description: Person
 * @date: 2020/5/21 21:45
 * @author: 谢庆祝
 */
public abstract  class Person {
    String name;
    int age;
    int i = 1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
