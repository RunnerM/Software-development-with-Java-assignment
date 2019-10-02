public class GarageTest {
    public static void main(String[] args) {
        String white = "#FFFFFF";
        String black = "#000000";
        Garage g1 = new Garage();
        Car car1 = new Car(white);
        Car car2 = new Car(black,"Bob Builder",88664);
        System.out.println(g1);
        g1.park(car1, 1);
        g1.park(car2,2);
        System.out.println(g1);
        System.out.println(g1.takeACarRide(2) + " Has Been Taken For A Ride");
        System.out.println(g1);
        //Todo: testing.
    }
}
