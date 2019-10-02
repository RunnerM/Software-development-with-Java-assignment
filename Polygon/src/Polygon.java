import java.util.Objects;

public class Polygon {
    private int numberOfEdges;
    private Colour lineColour;
    private Colour fillColour = null;

    public Polygon(int numberOfEdges, Colour lineColour) {
        this.numberOfEdges = numberOfEdges;
        this.lineColour = lineColour;
    }

    public Polygon(int numberOfEdges) {
        this.numberOfEdges = numberOfEdges;
        this.lineColour = new Colour(0, 0, 0);
    }

    public int getNumberOfEdges() {
        return numberOfEdges;
    }

    public Colour getLineColour() {
        return lineColour;
    }

    public Colour getFillColour() {
        return fillColour;
    }

    public void fill(Colour colour) {
        this.fillColour = colour.copy();
    }

    public void removeFillColour() {
        this.fillColour = null;
    }

    public boolean isFilled() {
        if (this.fillColour != null) {
            return true;
        }
        return false;
    }

    public String getName() {
        switch (this.getNumberOfEdges()) {
            case 3:
                return "Triangle";
            case 4:
                return "Rectangle";
            case 5:
                return "Pentagon";
            case 6:
                return "Hexagon";
            case 7:
                return "Heptagon";
            case 8:
                return "Octagon";
            default:
                return "Polygon";

        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Polygon polygon = (Polygon) o;
        return getNumberOfEdges() == polygon.getNumberOfEdges() &&
                getLineColour().equals(polygon.getLineColour()) &&
                getFillColour().equals(polygon.getFillColour());
    }

    @Override
    public String toString() {
        return this.getName() + " Line: " + this.lineColour.toString() + " Fill: " + this.fillColour;
    }

}
