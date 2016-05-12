//Buider.java
// 系统接口部分

public abstract House() {
}

//可有可无
public abstract class Door(){
}

public abstract class Wall(){
}

public abstract class Windows(){
}

public abstract class Floor(){
}

public abstract class HouseCeiling(){
}

public abstract class Builder() {
  public abstract void BuildDoor();
  public abstract void BuildWall();
  public abstract void BuildWindows();
  public abstract void BuildFloor();
  public abstract void BuildHouseCeiling();

  public abstract House GetHouse();
}

//GameManager.java
//相对比较稳定

public class GameManager {
  public static House CreateHouse(Bulider builder) {
    builder.BuildDoor();
    builder.BuildDoor();

    builder.BuildWall();
    builder.BuildWall();
    builder.BuildWall();
    builder.BuildWall();

    builder.BuildWindows();
    builder.BuildWindows();

    builder.BuildFloor();

    builder.BuildHouseCeiling();

    return builder.GetHouse();
  }
}

//RomanHouse.java
//客户程序

public class RomanHouse extend House {
  
}

//变化
public class RomanDoor extend Door{
  
}

public class RomanWall extend Wall {
  
}

public class RomanWindows extend Windows{
  
}

public class RomanFloor extend Floor {
  
}

public class RomanHouseCeiling extend HouseCeiling{
  
}
   
public class RomanHouseBulder extend Bulider {

  public overview void BuildDoor() {

  }

  public overview void BuildWall() {


  }
  
  public overview void BuildWindows() {

  }

  public overview void BuildFloor(){

  }

  public overview void BuildHouseCeiling(){

  }

  public overview House GetHouse(){
  }
  
}

//client.java

class App {
  public static void Main () {
    //RomanHouseBulder 变化，可以通过配置文件动态读取，通过反射机制获取类型并创建对象

    House house = GameManager.CreateHouse(new RomanHouseBulder());
  }
}