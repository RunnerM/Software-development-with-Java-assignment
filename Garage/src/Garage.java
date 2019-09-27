public class Garage {
    private Car car1;
    private Car car2;

    public Garage() {
        this.car1 = null;
        this.car2 = null;
    }

    public boolean isParkingAreaTaken(int position) {
        return false;
        //Todo: implement isParkingAreaTaken.
    }

    public void park(Car car, int Position) {
        //Todo: implement park.
    }

    public Car takeACar(int Position) {
        return this.car1;
        //Todo: implement takeACar.
    }

    @Override
    public String toString() {
        return "";
        //Todo: implement toString.
    }
}
