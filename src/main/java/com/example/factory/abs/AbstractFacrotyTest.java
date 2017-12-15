package com.example.factory.abs;

/**
 * Created by chenlu on 2017/12/15.
 */

/**
 * 抽象工厂模式是工厂方法模式的升级版本，他用来创建一组相关或者相互依赖的对象，
 * 这些对象就构成了一个产品族，也就是抽象工厂定义了一个产品族。
 *
 * 优点：
 * 1、分离接口和实现：客户端使用抽象工厂创建所需的对象，不知道产品的具体实现，客户端是面向产品的接口编程（客户端从产品中解耦）
 * 2、切换产品族变得容易：对于新增的产品族，抽象工厂模式很好的支持了开闭原则，只需增加具体的产品和对应的具体工厂，对已有代码无需修改
 *
 * 缺点：
 * 不易扩展新产品：如果需要给整个产品族添加新的产品，需要修改抽象工厂及实现类
 *
 * 使用场景：一个系统不应该依赖于产品类实例如何创建、组合和表达的细节，这对于所有形态的工厂模式都很重要。如QQ换肤
 *
 * 总结：无论是简单工厂模式、工厂方法模式还是抽象工厂模式，在形式和特点上都极为相似，他们的最终目的是解耦
 */
public class AbstractFacrotyTest {
    public static void main(String[] args) {
        //生产宝马320系列的配件
        FactoryBMW320 factoryBMW320 = new FactoryBMW320();
        factoryBMW320.createEngine();
        factoryBMW320.createAircondition();
        //生产宝马523系列的配件
        FactoryBMW523 factoryBMW523 = new FactoryBMW523();
        factoryBMW523.createEngine();
        factoryBMW523.createAircondition();
    }
}
