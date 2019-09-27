import java.util.Objects;

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
        this.red = red;
        this.green = green;
        this.blue = blue;
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
        if (this.getRed()==0&&this.getBlue()==0&&this.getGreen()==0){
            return true;
        }
        return false;
        //Todo: implement isBlack method.

    }

    public Colour copy() {
        //Todo: implement copy().
        return new Colour(this.getRed(),this.getGreen(),this.getBlue());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Colour colour = (Colour) o;
        return getRed() == colour.getRed() &&
                getGreen() == colour.getGreen() &&
                getBlue() == colour.getBlue();

        //Todo: implement equals
    }

    @Override
    public String toString() {
        return "R: "+this.getRed()+" G: "+this.getGreen()+" B: "+this.getBlue();
        //Todo: implement toString.
    }
}
