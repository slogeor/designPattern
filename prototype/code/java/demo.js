//===================ECMAScript5 Object.create()===================

// 不是构造函数，不用大写
var person = {
  say: function() {
    console.log('hello ' + this.name);
  },
  name: 'slogeor'
};

// 使用Object.create创建一个 man
var man = Object.create(person);

console.log(man.name); // slogeor
console.log(man.say()); // hello slogeor


//===================原生的 Prototype===================

//方法1 
function Person() {}

Person.prototype.say = function() {
  console.log('hello person');
};

Person.prototype.name = 'slogeor';

function inhert(C, P) {
  function F() {}
  F.prototype = P.prototype;
  C.prototype = new F();
}

function Man() {

}

inhert(Man, Person);

var man = new Man();

man.name; // slogeor
man.say(); // hello person


//方法2

// 对象可以充当原型
var person = {
  name: 'slogeor',
  say: function() {
    console.log('hello person');
  }
};

function inhert(C, P) {
  function F() {}
  F.prototype = P;
  C.prototype = new F();
}

function Man() {

}

inhert(Man, person);

var man = new Man();

man.name; // slogeor
man.say(); // hello person