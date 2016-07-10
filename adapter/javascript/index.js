//场景描述
/**
 * 鸭子（Dock）有飞（fly）和嘎嘎叫（quack）的行为，
 * 而火鸡虽然也有飞（fly）的行为，但是其叫声是咯咯的（gobble）。
 * 如果你非要火鸡也要实现嘎嘎叫（quack）这个动作，那我们可以复用鸭子的quack方法，
 * 但是具体的叫还应该是咯咯的，此时，我们就可以创建一个火鸡的适配器，
 * 以便让火鸡也支持quack方法，其内部还是要调用gobble
 */

//抽象行为

//鸭子
var Duck = function () {};

Duck.prototype.fly = function () {
    throw new Error("该方法必须被重写!");
};
Duck.prototype.quack = function () {
    throw new Error("该方法必须被重写!");
};

//火鸡
var Turkey = function () {};
Turkey.prototype.fly = function () {
    throw new Error("该方法必须被重写 !");
};
Turkey.prototype.gobble = function () {
    throw new Error("该方法必须被重写 !");
};

//构造函数

//鸭子
var MallardDuck = function () {
    Duck.apply(this);
};
MallardDuck.prototype = new Duck(); //原型是Duck

MallardDuck.prototype.fly = function () {
    console.log("可以飞翔很长的距离!");
};

MallardDuck.prototype.quack = function () {
    console.log("嘎嘎！嘎嘎！");
};

//火鸡
var WildTurkey = function() {
    Turkey.apply(this);
};

WildTurkey.prototype = new Turkey(); //原型是Turkey

WildTurkey.prototype.fly = function () {
    console.log("飞翔的距离貌似有点短!");
};

WildTurkey.prototype.gobble = function () {
    console.log("咯咯！咯咯！");
};

//火鸡适配器TurkeyAdapter
var TurkeyAdapter = function (oTurkey) {
    Duck.apply(this);
    this.oTurkey = oTurkey;
};

TurkeyAdapter.prototype = new Duck();

TurkeyAdapter.prototype.quack = function () {
    this.oTurkey.gobble();
};

TurkeyAdapter.prototype.fly = function () {
    var nFly = 0;
    var nLenFly = 5;
    for(nFly = 0; nFly < nLenFly; nFly++) {
        this.oTurkey.fly();
        nFly = nFly + 1;
    }
};

// Test
var oMallardDuck = new MallardDuck();
var oWildTurkey = new WildTurkey();
var oTurkeyAdapter = new TurkeyAdapter(oWildTurkey);

//原有的鸭子行为
oMallardDuck.fly();
oMallardDuck.quack();

//原有的火鸡行为
oWildTurkey.fly();
oWildTurkey.gobble();

//适配器火鸡的行为（火鸡调用鸭子的方法名称）
oTurkeyAdapter.fly();
oTurkeyAdapter.quack();
