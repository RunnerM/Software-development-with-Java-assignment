public class Car
{
  private String make,model,colour;
  private boolean manualGear;
  private Engine engine;

  public Car(String make, String model, boolean manualGear, String colour, Engine engine)
  {
    this.make = make;
    this.model = model;
    this.colour = colour;
    this.manualGear = manualGear;
    this.engine=engine;
  }

  public String getMake()
  {
    return make;
  }

  public void setMake(String make)
  {
    this.make = make;
  }

  public String getModel()
  {
    return model;
  }

  public void setModel(String model)
  {
    this.model = model;
  }

  public String getColour()
  {
    return colour;
  }

  public void setColour(String colour)
  {
    this.colour = colour;
  }

  public boolean hasManualGear()
  {
    return manualGear;
  }

  public void setManualGear(boolean manualGear)
  {
    this.manualGear = manualGear;
  }
  public Engine getEngine(){
    return engine;
  }
  public int getHorsePower(){
    return  engine.getHorsePower();
  }
  public void setEngine(Engine engine){
    this.engine= engine;
  }

  @Override public String toString()
  {
    return "Car{" + "make='" + make + '\'' + ", model='" + model + '\''
        + ", colour='" + colour + '\'' + ", manualGear=" + manualGear
        + ", engine=" + engine.toString()+ '}';
  }
}
