//Car.java
class Car {
  public void startUp() {
  
  }

  public void run() {

  }

  public void turn() {

  }

  public void stop() {

  }
}

//CarTest.java
class CarTest {
  public void BuildTestContent() {
    Car car = new Car(); //紧耦合
    //...
    car.run();

  }

  public void DoTest() {
    Car car = new Car(); //紧耦合
    //...
    car.startUp();
  }

  public void GetTestData() {
    Car car = new Car(); //紧耦合
    //...
  }
}