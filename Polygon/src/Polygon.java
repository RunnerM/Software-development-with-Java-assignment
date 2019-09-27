public class Polygon {
    private int numberOfEdges;
    private Colour lineColour;
    private Colour fillColour;

    public Polygon(int numberOfEdges, Colour lineColour) {
        this.numberOfEdges = numberOfEdges;
        this.lineColour = lineColour;
    }

    public Polygon(int numberOfEdges) {
        this.numberOfEdges = numberOfEdges;
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
        this.fillColour = colour;
    }

    public void removeFillColour() {
        this.fillColour = null;
    }

    public boolean isFilled() {
        return false;
        //Todo: implement isFilled.
    }

    public String getName() {
        return "";
        //Todo: implement getName.
    }

    public boolean equals(Polygon obj) {
        return false;
        //Todo: implement equals.
    }

    @Override
    public String toString() {
        return "";
        //Todo: implment toString;
    }

}
