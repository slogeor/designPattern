public abstract class Tank {
    public abstract void Shot();
    public abstract void Run();
    public abstract void Stop();
}

public class T50 extend Tank {
    public override void Shot() {}
    public override void Run() {}

    public override void Stop() {}
}

public class T75 extend Tank {
    public override void Shot() {}
    public override void Run() {} 
    public override void Stop() {}
}


public class PCT50 extend T50 {
    //...
}

public class MobileT50 extend T50 {
    //...
}

//==================================

public abstract class Tank {
    protected TankPlatFormImplementation tankImpl;
    public Tank (TankPlatFormImplementation tankImpl) {
        this.tankImpl = tankImpl;
    }
    public abstract void Shot();
    public abstract void Run();
    public abstract void Stop();
}

public class T50 extend Tank {
    public T50 (TankPlatFormImplementation tankImpl) {

    }
    public override void Shot() {
        //...
        tankImpl.Doshot();
        //...
    }
    public override void Run() {} 
    public override void Stop() {}
}

public class T75 extend Tank {
    public T75 (TankPlatFormImplementation tankImpl) {
    
    }
    public override void Shot() {
        //...
        tankImpl.Doshot();
        //...
    }
    public override void Run() {} 
    public override void Stop() {}
}


 
public abstract class TankPlatFormImplementation {
    public abstrac void MoveTankTo(Point to);
    public abstrac void DrawTank(); 
    public abstrac void DoShot();
}

public class PCTankImplementation extend TankPlatFormImplementation {
    public override void MoveTankTo(Point to) {}
    public override void DrawTank() {}
    public override void DoShot() {}
}

public class MobileTankImplementation extend TankPlatFormImplementation {
    public override void MoveTankTo(Point to) {}
    public override void DrawTank() {}
    public override void DoShot() {}
}


public class App() {
    public static void Main() {
        TankPlatFormImplementation tankImpl = new MobileTankImplementation();

        T50 tank = new T50(tankImpl)
    }
}
