# 策略模式(Strategy)

![ariplane-bus-train](https://tva1.sinaimg.cn/large/008i3skNgy1gxsrxo8biyj30zk0gowh2.jpg)

如果你想从武汉去北京，请问何种交通工具对你来说是最好的选择？

相信这个问题对大家来说都曾经多次纠结过。之所以这么纠结，主要的原因在于，从武汉到北京的交通工具太多了，每种交通工具的花费和耗时都不一样，关键取决于你从什么地方来衡量了。

这些交通工具之间，互相可以替换，每种交通工具都处于竞争模式，这在软件学中，属于***策略模式***套路的范畴。

## 模式定义

***策略模式是一种行为设计模式， 它能让你定义一系列算法， 并将每种算法分别放入独立的类中， 以使算法的对象能够相互替换。***

通常情况下，我们会将策略模式应用于以下几种场景中：

1. 当你想使用对象中各种不同的算法变体， 并希望能在运行时切换算法时， 可使用策略模式。
2. 当你有许多仅在执行某些行为时略有不同的相似类时， 可使用策略模式。
3. 如果算法在上下文的逻辑中不是特别重要， 使用该模式能将类的业务逻辑与其算法实现细节隔离开来。
4. 当类中使用了复杂条件运算符以在同一算法的不同变体中切换时， 可使用该模式。

## 模式结构

![strategy-structure](https://tva1.sinaimg.cn/large/008i3skNgy1gxss5erjdxj30og0kktae.jpg)

1. **上下文(Context)**: 维护指向具体策略的引用，且仅通过策略接口与该对象进行交流。
2. **策略(Strategy)**: 接口是所有具体策略的通用接口， 它声明了一个上下文用于执行策略的方法。
3. **具体策略(Concrete Strategies)**: 实现了上下文所用算法的各种不同变体。

## 模式优缺点

### 优缺点
1. 你可以在运行时切换对象内的算法。
2. 你可以将算法的实现和使用算法的代码隔离开来。
3. 你可以使用组合来代替继承。
4. 开闭原则。 你无需对上下文进行修改就能够引入新的策略。

### 缺点
1. 如果你的算法极少发生改变， 那么没有任何理由引入新的类和接口。 使用该模式只会让程序过于复杂。
2. 客户端必须知晓策略间的不同——它需要选择合适的策略。
3. 许多现代编程语言支持函数类型功能， 允许你在一组匿名函数中实现不同版本的算法。 这样， 你使用这些函数的方式就和使用策略对象时完全相同， 无需借助额外的类和接口来保持代码简洁。