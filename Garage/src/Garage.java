public class Garage {
    private Car car1;
    private Car car2;

    public Garage() {
        this.car1 = null;
        this.car2 = null;
    }

    public boolean isParkingAreaTaken(int position) {
        switch (position) {
            case 1:
                if(car1!=null){
                    return true;
                }
            case 2:
                if(car2!=null){
                    return true;
                }
        }
        return false;

    }

    public void park(Car car, int position) {
        switch (position) {
            case 1:
                this.car1 = car;
            case 2:
                this.car2 = car;
        }


    }

    public Car takeACarRide(int position) {
        Car carH;
        switch(position){
            case 2: {
                carH = car2;
                this.car2 = null;
                return carH;
            }
            default: {
                carH = car1;
                this.car1 = null;
                return carH;
            }
        }
    }

    @Override
    public String toString() {
        return "car1: "+car1+" car2: "+car2;
    }
}
