package pl.sda;

public class Person {

    void driveBy(Vehicle vehicle) {
        vehicle.drive();
    }

    void buyTicketsFor(Payable payable, int quantity) {
        payable.pay(quantity);
    }
}
