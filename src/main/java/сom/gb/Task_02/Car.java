package сom.gb.Task_02;

 public class Car implements Action{
  private String color;
  private Engine engine;
  private String name;

  @Override
  public void move() {
   System.out.println("Car moved...");
  }

  @Override
  public void stop() {
   System.out.println("Car stopped...");
  }

  @Override
  public void engine() {

  }
 }
