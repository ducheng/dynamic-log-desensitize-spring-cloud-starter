package com.ducheng.dynamic.log.desensitize.test;

public class TestUser {

    private String idCard;

    private String name;

    private String enName;

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public TestUser() {
    }

    @Override
    public String toString() {
        return "TestUser{" +
                "idCard='" + idCard + '\'' +
                ", name='" + name + '\'' +
                ", enName='" + enName + '\'' +
                '}';
    }
}
