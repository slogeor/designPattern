### 构造函数模式

#### 描述

构造函数用于创建特定类型的对象——不仅声明了使用的对象，构造函数还可以接受参数以便第一次创建对象的时候设置对象的成员值。

#### 基本用法

``` JavaScript
function Person(name, age) {
  this.name = name;
  this.age = age;
}

Person.prototype.getInfo = function() {
  console.log('name: ' + this.name + '; age: ' + this.age)
}

var p1 = new Person('slogeor', 18);
p1.getInfo(); //name: slogeor; age: 18
p1 instanceof Person; //true
p1 instanceof Object; //true

var p2 = Person('tom', 28);
window.name; //tom
typeof p2; //undefined

```

说明：

1. 推荐构造函数以大写字母开头
2. 构造函数内部，``` this ``` 关键字引用的是新创建的对象
2. 构造函数内部可以完成参数初始化
3. 需要强制使用 ``` new ```


#### 进一步改进

``` JavaScript
function Person(name, age) {
  if (!(this instanceof Person)) {
    return new Person(name, age);
  }

  this.name = name;
  this.age = age;
}

Person.prototype.getInfo = function() {
  console.log("name: " + this.name + "; age: " + this.age)
}

var p1 = Person("slogeor", 20);
p1.getInfo(); //name: slogeor; age: 20

var p2 = new Person("slogeor", 18);
p2.getInfo(); //name: slogeor; age: 18

console.log(p1 === p2); //false

```

说明：

1. 通过 ``` this ``` 的 ``` instanceof ``` 判断
2. 不使用 ``` new ``` 可以正常使用
