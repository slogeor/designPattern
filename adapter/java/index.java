//对象适配器
interface IStack {
    void Push(object item);
    object pop();
    object peek();  
}

class Adapter: IStack { // 适配器对象
    ArrayList adaptee; //被适配的对象

    public Adapter() {
        adaptee = new ArrayList();
    }

    public void (object item) {
        adaptee.Add(item);
    }

    public object pop {
        return adaptee.RemoveAt(list.Count -1)
    }

    public object peek {
        return adaptee[list.Count -1]
    }
}

//类适配器
interface IStack {
    void push(object item);
    object pop();
    object peek();  
}

class Adapter: ArrayList, IStack { 

    public void (object item) {
        this.Add(item);
    }

    public object pop {
        return this.RemoveAt(this.Count -1)
    }

    public object peek {
        return this[this.Count -1]
    }
}