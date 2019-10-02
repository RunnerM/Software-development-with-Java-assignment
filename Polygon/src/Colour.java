import java.util.Objects;

public class Colour {
    private int red;
    private int green;
    private int blue;

    public Colour(int red, int green, int blue) {
        set(red,green,blue);
    }

    public void set(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
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


    }

    public Colour copy() {

        return new Colour(this.getRed(),this.getGreen(),this.getBlue());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (this == null) return false;
        if (o == null || getClass() != o.getClass()) return false;
        Colour colour = (Colour) o;
        return getRed() == colour.getRed() &&
                getGreen() == colour.getGreen() &&
                getBlue() == colour.getBlue();
    }

    @Override
    public String toString() {
        return "R: "+this.getRed()+" G: "+this.getGreen()+" B: "+this.getBlue();
    }
}
