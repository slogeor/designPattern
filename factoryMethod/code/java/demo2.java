//Car.java
abstract class AbstractCar {
  public abstract void startUp();

  public abstract void run(); 

  public abstract void turn(); 

  public abstract void stop(); 
}

//HongqiCar.java
public class HongqiCar extend Abstractcar {
  public override void startUp() {
    //...
  }

  public override void run(){
    //...
  } 

  public override void turn(){
    //...
  } 

  public override void stop(){
    //...
  } 
}

//AbstractCarFactory.java
abstract class AbstractCarFactory {
  public abstract void CreateCar(); 
}

//HongqiCarFactroy.java

public class HongqiCarFactroy extend AbstractCarFactory {
  public override Car CreateCar() {
    return new HongqiCar()
  }
}

//CarTest.java
class CarTest {
  public void BuildTestContent(AbstractCarFactory carFactory) {
    AbstractCarFactory c1 = carFactory.CreateCar();
    //...
    c1.run();

  }

  public void DoTest(AbstractCarFactory carFactory) {
    AbstractCarFactory c1 = carFactory.CreateCar();
    //...
    c1.startUp();
  }

  public void GetTestData(AbstractCarFactory carFactory) {
    //...
  }
}

//App.java
class App {
  public static void main() {
    CarTest carTest = new CarTest(); 
    carTest.BuildTestContent(new HongqiCarFactroy()); //子类决定实例化哪一个类
  }
}