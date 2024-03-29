public class Car {
    private String colour, owner;
    private int registrationNumber;

    public Car(String colour) {
        setColour(colour);
    }

    public Car(String colour, String owner, int registrationNumber) {
        setColour(colour);
        setOwner(owner);
        setRegistrationNumber(registrationNumber);
    }

    public String getColour() {
        return colour;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "Owner: "+owner+" Colour: "+colour+" Registration Number: "+registrationNumber;
    }
}
