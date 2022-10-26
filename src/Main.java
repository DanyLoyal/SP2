public class Main {
    public static void main(String[] args) {

        FleetOfCars fleet = new FleetOfCars();

        Car car1 = new GasolineCar("AMK223152", "Volvo", "V90",  5, "Gas", 20);
        Car car2 = new DieselCar("DKX235141", "BMW", "A6", 5, "Diesel", 20, false);
        Car car3 = new ElectricCar("SLE265765", "Tesla", "Model s Plaid", 5, 600, 99000);

        fleet.addCar(car1);
        fleet.addCar(car2);
        fleet.addCar(car3);

        System.out.println(fleet);


        System.out.println("The total registration fee cost is  " + fleet.getTotalRegistrationFeeForFleet());


    }
}