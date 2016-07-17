public class SingleBox: IBox {
    public void process() { ……}
}

public class ContainerBox :IBox {
    public void process(){……}
    public ArrayList getBoxes(){……}
}

//如果我们要对这样的对象容器进行处理:

IBox box=Factory.GetBox();

if (box is ContainerBox){
    box.process();
    ArrayList list= ((ContrainerBox) box).GetBoxes();
    // 将面临比较复杂的递归处理
}else if( box is SingleBox){
    box.process();
}

//改进

public interface  IBox  {
    void Process();
    void Add(IBox box);
    void remove(IBox box); 
}

public class SingleBox: IBox {
    public void Process() {
        //Do Something for myself
        //...
    }

    //有点违背单一职责原则
    public void Add(IBox box) {
        throw Exception;
    }

    public void remove(IBox box) {
        throw Exception;
    }
}

public class ContainerBox: IBox {
    
    ArrayList list = null;

    public void Add(IBox box) {
        if (list == null)  {
            list = new ArrayList()
        }
        list.Add(box);
    }

    public void remove(IBox box) {
        if (list != null) {
            list.Remove(box)
        }
    }

    public void Process() {
        //1. Do Something for myself
        //...

        //2. Do Process for the box in the list

        if (list != null) {
            foreach(IBox box in list) {
                box.Process();
            }
        }
    }
}

public App {
    public static void Main() {
        IBox box = Factroy.GetBox();

        //客户代码与抽象接口进行耦合
        box.Process();
    }
}