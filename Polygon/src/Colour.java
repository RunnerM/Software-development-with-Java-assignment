public class Colour {
    private int red;
    private int green;
    private int blue;
    //Todo: Simplify this class

    public Colour(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public void set(int red, int green, int blue) {
        //Todo: implement set method.
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public boolean isBlack() {
        //Todo: implement isBlack method.
        return false;
    }

    public Colour copy() {
        //Todo: implement copy().
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
        //Todo: implement equals.
    }

    @Override
    public String toString() {
        return "";
        //Todo: implement toString.
    }
}
