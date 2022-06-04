class Car {
    private int noOfSeats = 4;
    private String type = "InternalCombution";

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setType() {
        this.type = type;
    }

}

interface OperateCar {
    private void displayAbout() {
        System.out.println("It is an Interface for operating car.");
    }

    default void about() {
        // Add more logic as needed.
        displayAbout();
    }

    int turn(String direction,
            double radius,
            double startSpeed,
            double endSpeed);

    int changeLanes(String direction,
            double startSpeed,
            double endSpeed);

    int signalTurn(String direction,
            boolean signalOn);

    int getRadarFront(double distanceToCar,
            double speedOfCar);

    int getRadarRear(double distanceToCar,
            double speedOfCar);

}

interface Features {
    void printFeature();
}

class RenaultKiger extends Car implements OperateCar, Features {

    @Override
    public void printFeature() {
        System.out.println("Hi");
    }

    @Override
    public int turn(String direction, double radius, double startSpeed, double endSpeed) {

        return 0;
    }

    @Override
    public int changeLanes(String direction, double startSpeed, double endSpeed) {

        return 0;
    }

    @Override
    public int signalTurn(String direction, boolean signalOn) {

        return 0;
    }

    @Override
    public int getRadarFront(double distanceToCar, double speedOfCar) {

        return 0;
    }

    @Override
    public int getRadarRear(double distanceToCar, double speedOfCar) {

        return 0;
    }

}

public class Interface {
    public static void main(String[] args) {
        RenaultKiger renaultKiger = new RenaultKiger();
        renaultKiger.about();

    }
}
