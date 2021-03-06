### 模式分类

#### 从目的来看

创建型（Creational）模式：负责对象创建

结构型（Structural）模式：处理类与对象间的组合

行为型（Behavioral）模式：类与对象交互中的职责分配

#### 从范围来看

类模式处理类与子类的静态关系

对象模式处理对象间的动态关系

#### 推荐书籍

<a href="http://item.jd.com/10057319.html" target="_blank">《设计模式：可复用面向对象软件的基础》GoF </a>

<a href="http://item.jd.com/10155890.html" target="_blank">《面向对象分析与设计》Grady Booch</a>

<a href="http://item.jd.com/1361382235.html" target="_blank">《敏捷软件开发：原则、模式与实践》Robert C. Martin</a>

<a href="http://item.jd.com/11728740.html" target="_blank">《重构：改善既有代码的设计》Martin Fowler</a>

<a href="http://item.jd.com/1104213672.html" target="_blank">《Refactoringto Patterns 》JoshuaKerievsky</a>

### 单例模式

#### 动机

在软件系统中，经常有这样一些特殊的类，必须保证它们在系统中只存在一个实例，才能确保它们的逻辑正确性、以及良好的效率。

如何绕过常规的构造器，提供一种机制来保证一个类只有一个实例？

这应该是类设计者的责任，而不是使用者的责任。

#### 意图

保证一个类仅有一个实例，并提供一个该实例的全局访问点。

#### 结构

![结构图](../images/singleton.struct.png)

#### 实现

在传统开发工程师眼里，单例就是保证一个类只有一个实例，实现的方法一般是先判断实例存在与否，如果存在直接返回，如果不存在就创建了再返回，这就确保了一个类只有一个实例对象。

在JavaScript里，单例作为一个命名空间提供者，从全局命名空间里提供一个唯一的访问点来访问该对象。

 <a href="./index.js" target="_blank">单例模式实现</a>

#### 几个要点

Singleton 模式中的实例构造器可以设置为 protected 以允许子类派生。

Singleton 模式一般不要支持 ICloneable 接口，因为这可能会导致多个对象实例，与 Singleton 模式的初衷违背。

Singleton 模式一般不要支持序列化，因为这也有可能导致多个对象实例，同样与 Singleton 模式的初衷违背。

Singletom 模式只考虑到了对象创建的管理，没有考虑对象销毁的管理。就支持垃圾回收的平台和对象的开销来讲，我们一般没有必要对其销毁进行特殊的管理。

不能应对多线程环境：在多线程环境下，使用 Singleton 模式仍然有可能得到 Singleton 类的多个实例对象。

#### 扩展

将一个实例扩展到 n 个实例，例如对象池的实现。

将 new 构造器的调用转移到其他类中，例如多个类协同工作环境中，某个局部环境只需要拥有某个类的一个实例。

理解和扩展 Singleton 模式的核心是 "如何控制用户使用 new 对一个类的实例构造器的任意调用"。

#### 应用

单例模式一般是用在系统间各种模式的通信协调上。

#### 总结

JavaScript 借助于必包实现单例模式，从而控制对象实例个数。