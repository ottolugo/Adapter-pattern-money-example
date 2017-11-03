package main;

public class Client {
    public static void main(String[] args) {
	Adapter adapter = new Adapter();

	adapter.depositMoney(20);
	adapter.depositMoney(20);
	System.out.println("Right now we have: " + adapter.getAmountOfMoney());
	adapter.takeMoneyOut(20);
	System.out.println("Right now we have: " + adapter.getAmountOfMoney());
    }
}
