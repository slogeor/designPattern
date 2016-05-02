/**
 * @descript 单例模式，借助于必包实现
 * @author slogeor
 * @creat date 2016-04-06 20:30:00
 * @upadte date 2016-04-07 10:40:00
 */

//method1
//不支持参数传递，没有提供 new 方法
var Singleton = (function() {
  var instance;

  //私有的init
  function init() {
    return {
      publicProperty: 'slogeor',
      publicMethod: function() {
        console.log('hello slogeor');
      }
    };
  }

  //唯一的入口
  return {
    getInstance: function() {
      if (!instance) {
        instance = init();
      }
      return instance;
    }
  };
}());

var instance1 = Singleton.getInstance();
var instance2 = Singleton.getInstance();

console.log(instance1 === instance2); //true

//method2
//支持参数传递，没有提供 new 方法
var SingletonTester = (function() {

  //私有的变量
  var instance;

  //私有的 constructor
  function Singleton(args) {
    this.name = args.name;
    this.age = args.age;
  }

  return {
    job: 'FE',
    //参数
    getInstance: function(args) {
      if (!instance) {
        instance = new Singleton(args);
      }
      return instance;
    }
  };
}());

var singletonTest = SingletonTester.getInstance({
  name: 'slogeor',
  age: '18'
});
console.log(singletonTest.name); // slogeor


//method3
//自定义模式：以新的主体重写本身，以使得在第二次或以后调用时仅需要执行更好的工作
function SingletonFun() {
  //缓存实例
  var instance = this;

  instance.name = 'slogeor';

  // 重写构造函数
  SingletonFun = function() {
    return instance;
  };
}

var s1 = new SingletonFun();
var s2 = new SingletonFun();

console.log(s1 === s2); //true