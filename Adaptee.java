package main;

public class Adaptee {

    private double dollars;

    public Adaptee() {
	dollars = 0;
    }

    public void takeMoneyOut(double dollars) {
	this.dollars = this.dollars - dollars;
    }

    public void depositMoney(double dollars) {
	this.dollars = this.dollars + dollars;
    }

    public double getAmount() {
	return this.dollars;
    }
}
