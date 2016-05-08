 
//抽象类
public abstract class Road() { 
  //TODO
}
public abstract class Building() { 
  //TODO
}

//设施工厂
public abstrict FacilitiesFactory{
  public abstract Road creatRoad();
  public abstract Building creatBuilding();
}

//客户程序
public class ModerRoad extend Road {
  //TODO
}

public class ModerBuilding extend Building {
  //TODO
}

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


// 测试
class App {
  public static Main() {
    GameManager g = new GameManager(new ModerFacilitiesFactory());
    g.BuildGameFacilities();
    g.Run();
  }
}