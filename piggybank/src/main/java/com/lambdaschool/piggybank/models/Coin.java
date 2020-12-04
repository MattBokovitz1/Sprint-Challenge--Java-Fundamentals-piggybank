package com.lambdaschool.piggybank.models;

import javax.persistence.*;

@Entity
@Table(name = "coins")
public class Coin{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long coinId;
    private int numberOfCoins;
    private int faceValue;
    private String name;
    private String nameOfMany;

    public Coin() {

    }

    public Coin(int coinId, String name, String nameOfMany, int faceValue, int numberOfCoins) {
        this.coinId = coinId;
        this.name = name;
        this.nameOfMany = nameOfMany;
        this.faceValue = faceValue;
        this.numberOfCoins = numberOfCoins;
    }

    public int getNumberOfCoins() {
        return numberOfCoins;
    }

    public void setNumberOfCoins(int numberOfCoins) {
        this.numberOfCoins = numberOfCoins;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameOfMany() {
        return nameOfMany;
    }

    public void setNameOfMany(String nameOfMany) {
        this.nameOfMany = nameOfMany;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "coinId=" + coinId +
                ", numberOfCoins=" + numberOfCoins +
                ", faceValue=" + faceValue +
                ", name='" + name + '\'' +
                ", nameOfMany='" + nameOfMany + '\'' +
                '}';
    }
}
