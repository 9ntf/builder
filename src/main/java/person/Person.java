package person;

import java.util.Objects;

public class Person {
    String name;
    String surName;
    int age;
    String address;

    public Person() {
    }

    public Person(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public Person(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public Person(String name, String surName, String address) {
        this.name = name;
        this.surName = surName;
        this.address = address;
    }

    public Person(String name, String surName, int age, String address) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.address = address;
    }

    public void happyBirthday() {
        this.age++;
    }

    public boolean hasAge() {
        if (this.name == null && this.surName == null) {
            return false;
        } else return true;
    }

    public boolean hasAddress() {
        if (this.address != null) {
            return true;
        } else return false;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person:" +
                "name = " + name +
                ", surName = " + surName +
                ", age = " + age +
                ", address = " + address;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName);
    }


    public PersonBuilder newChildBuilder() {
        PersonBuilder builder = new PersonBuilder()
                .setSurname(this.getSurName())
                .setAddress(this.getAddress())
                .setAge(0);
        return builder;
    }
}