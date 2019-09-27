public class Colour {
    private int red;
    private int green;
    private int blue;

    public Colour(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public Colour(String hex) {
        if(hex.length()==7){
            convertHexToInt(hex);
        }else{
            convertHexToInt("#000000");
        }
    }

    private void convertHexToInt(String hex){
        this.red= Integer.valueOf(hex.substring(1,3), 16).intValue();
        this.green = Integer.valueOf(hex.substring(3,5), 16).intValue();
        this.blue = Integer.valueOf(hex.substring(5,7), 16).intValue();
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

    public String toHex(int red,int green, int blue){
        return "#"+Integer.toHexString(red)+Integer.toHexString(green)+Integer.toHexString(blue);
    }
}
