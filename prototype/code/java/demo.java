//==================抽象类==================
public abstract class NoramActor {
  public abstract NoramActor Clone(); 
}

public abstract class FlyActor {
  public abstract FlyActor Clone(); 
}

//==================具体类==================
public class NoramActorA extend NoramActor {
  public override NoramActor Clone() {
    return ...;
  }
}

public class NoramActorB extend NoramActor {
  public override NoramActor Clone() {
    return ...;
  }
}

public class FlyActorA extend FlyActor {
  public override FlyActor Clone() {
    return ...;
  }
}

public class FlyActorB extend FlyActor {
  public override FlyActor Clone() {
    return ...;
  }
}

//==================客户程序==================
public class GameSystem {

  public static void Run(NormalActor normalActor, FlyActor flyActor) {
    NormalActor normalActor1 = normalActor.clone(); 
    NormalActor normalActor2 = normalActor.clone(); 
    NormalActor normalActor3 = normalActor.clone(); 

    FlyActor flyActor1 = flyActor.clone(); 
    FlyActor flyActor2 = flyActor.clone();
  }
}

//==================测试程序==================
class App {
  public static void Main() {
    GameSystem gameSystem = new GameSystem();
    gameSystem.Run(new NormalActorA(), new flyActorB())
  }
}