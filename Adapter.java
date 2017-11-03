package main;

public class Adapter implements Target {

    Adaptee adaptee = new Adaptee();

    public Adapter() {
    }

    @Override
    public void takeMoneyOut(double euros) {
	double dollars = euros * 1.164685;
	adaptee.takeMoneyOut(dollars);
    }

    @Override
    public void depositMoney(double euros) {
	double dollars = euros * 1.164685;
	adaptee.depositMoney(dollars);
    }

    @Override
    public double getAmountOfMoney() {
	double euros = adaptee.getAmount() / 1.164685;
	return euros;
    }

}
