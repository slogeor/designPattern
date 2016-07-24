abstract class Tank {
    public abstract void Shot();
    public abstract void Run();
}

public abstrac class Decorator extend Tank { //接口继承
    private Tank tank; // Has-A 对象组合

    public Decorator (Tank tank) {
        this.tank = tank;
    }
    
    public override void Shot() {
        tank.Shot();
    }
    public override void Run() {
        tank.Run();
    }
}

public class DecoratorA extend Decorator {
    public DecoratorA(Tank tank) {
        //...
    }

    public override void Shot() {
        //Do some extension //红外功能扩展
        //do Shot...
        base.Shot(); //调用父类
  
    }
}

public class DecoratorB extend Decorator {
    public DecoratorB(Tank tank) {
        //...
    }

    public override void Shot() {
        //Do some extension //水陆两栖功能扩展
        //do Shot...
        base.Shot();
  
    }

    public override void Run() {
        //Do some extension //水陆两栖功能扩展
        //do Run...
        base.Run();
  
    }
}

public class T50 extend Tank {
    public override void Shot() {

    }
    public override void Run() {

    }
}

public class T75 extend Tank {
    public override void Shot() {

    }
    public override void Run() {
    
    }
}

class App {
    public static void Main() {
        Tank tank = new T50();
        DecoratorA da = new DecoratorA(tank);

        da.Shot();    

        DecoratorB db = new DecoratorA(da);
        db.Shot();
    }
}