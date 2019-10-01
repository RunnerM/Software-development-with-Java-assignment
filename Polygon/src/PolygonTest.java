import java.util.Random;

public class PolygonTest {
    public static void main(String[] args) {
        Polygon[] polygons = new Polygon[8];
        Colour[] colours = new Colour[7];
        colours[1] = new Colour(250,00,00);
        colours[2] = new Colour(00,250,00);
        colours[3] = new Colour(00,00,250);
        colours[4] = new Colour(100,100,00);
        colours[5] = new Colour(00,100,100);
        colours[6] = new Colour(100,00,100);
        colours[7] = new Colour(70,70,70);
        for(int i=1; i<8;i++){
            polygons[i] = new Polygon(i,colours[i]);
        }
        polygons[0] = new Polygon(1);

        for(int i=0; i<8;i++){
            Polygon pol = polygons[i];
            System.out.println("Testing polygon nr: "+(i+1));
            System.out.println(pol);
        }
        Colour fill = new Colour(100,100,100);
        polygons[1].fill(fill);
        System.out.println(polygons[1]);
    }
}
