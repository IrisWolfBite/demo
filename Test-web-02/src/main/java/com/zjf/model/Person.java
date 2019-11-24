package com.zjf.model;

/**
 * className:Person
 * package:com.zjf.model
 * Description:简单描述
 *
 * @date: 2019/11/4 22:49
 * @Author: ASUS
 */
public class Person implements Cloneable{
    private Address address;
    private String gender;

    public Person(Address address, String gender) {
        this.address = address;
        this.gender = gender;
    }

    public Person() {
    }


    public Address getAddress() {
        return address;
    }

    public Person setAddress(Address address) {
        this.address = address;
        return this;
    }

    public String getGender() {
        return gender;
    }




    public Person setGender(String gender) {
        this.gender = gender;
        return this;
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        Person person = null;
        try {
            person = (Person) super.clone();
            person.address = (Address) address.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return person;
    }
}
