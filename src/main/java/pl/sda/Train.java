package pl.sda;

public class Train implements Vehicle, Payable {
    static final double PRICE = 25.50;
    public void pay(int quantity) {
        System.out.println("Total price: " + (PRICE * quantity));
    }

    public void drive() {
        System.out.println("Drive by train");
    }
}
