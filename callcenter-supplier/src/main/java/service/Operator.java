package service;

import java.io.Serializable;

public class Operator implements Serializable {
    private String name;
    private String phone;
    private int size;
    private int age;

    @Override
    public String toString() {
        return "Operator{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", size=" + size +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
