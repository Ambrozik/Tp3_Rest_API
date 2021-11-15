package com.Tp3_Rest_API.model;

public class Hero {
    private int id;
    private String name;
    private String fraction;
    private String power;
    private float hp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFraction() {
        return fraction;
    }

    public void setFraction(String fraction) {
        this.fraction = fraction;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public Hero(int id, String name, String fraction, String power, float hp) {
        this.id = id;
        this.name = name;
        this.fraction = fraction;
        this.power = power;
        this.hp = hp;
    }
}
