package main;

public interface Target {

    public abstract void takeMoneyOut(double euros);

    public abstract void depositMoney(double euros);

    public abstract double getAmountOfMoney();
}
