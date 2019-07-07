package pl.sda;

public class Bus implements Payable, Vehicle {
    static final double PRICE = 3.20;

    public void pay(int quantity) {
        System.out.println("Total price: " + (PRICE * quantity));
    }

    public void drive() {
        System.out.println("Drive by bus");
    }
}
