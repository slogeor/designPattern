/**----------------接口--------------------**/

//抽象类 Road
public abstract class Road() { 
  //TODO
}

//抽象类 Building
public abstract class Building() { 
  //TODO
}

//抽象类 抽象工厂
public abstract class FacilitiesFactory {
  public abstract Road creatRoad();
  public abstract Building creatBuilding();
}

/**-----------------具体实现-------------------**/

//客户程序

//具体类 ModerRoad
public class ModerRoad extend Road {
  //TODO
}

//具体类 ModerBuilding
public class ModerBuilding extend Building {
  //TODO
}

//具体类 工厂类
//一系列相互依赖的对象
public class ModerFacilitiesFactory extend FacilitiesFactory {
  //继承
  public Road creatRoad() {
    retrun new ModerRoad();
  }
  //继承
  public Road creatBuilding() {
    retrun new ModerBuilding()
  }
}

/**-----------------应用程序-------------------**/

// 具体类 GameManager
public class GameManager {
  FacilitiesFactory facilitiesFactory;
  Road road;
  Building building;

  public GameManager(FacilitiesFactory facilitiesFactory) {
    this.facilitiesFactory = facilitiesFactory;
  }

  public void BuildGameFacilities() {
    road = facilitiesFactory.createRoad();
    building = facilitiesFactory.cretaBuilding;
  }

  public void Run() {
    road.AAA();
    building.BBB(road);
  }
}

/**-----------------测试-------------------**/

// 测试
class App {
  public static void Main() {
    //变化在于 ModerFacilitiesFactory()
    //如果需要新增一系列，只需要增加即可，不用对现在的程序进行修改
    GameManager g = new GameManager(new ModerFacilitiesFactory());
    g.BuildGameFacilities();
    g.Run();
  }
}