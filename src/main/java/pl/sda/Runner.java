package pl.sda;

public class Runner {

    public static void main(String[] args) {
        Person person = new Person();
        Car car = new Car();
        Train train = new Train();
        Bus bus = new Bus();

        person.buyTicketsFor(train, 5);

        person.buyTicketsFor(train, 2);

        person.driveBy(train);

        person.driveBy(car);

        person.buyTicketsFor(bus, 1);

        person.buyTicketsFor(bus, 3);

        person.buyTicketsFor(bus, 5);
    }
}
