package abstractfactory.demo;

import abstractfactory.factory.AbstractFactory;
import abstractfactory.factory.FactoryProducer;
import abstractfactory.inter.Color;
import abstractfactory.inter.Shape;

/**
 * 使用 FactoryProducer 来获取 AbstractFactory
 *  通过传递类型信息来获取实体类的对象。
 * @author dangbaoqi
 * @date 2020/12/14 16:59
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        //获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        //获取形状为Circle的对象
        Shape  circle = shapeFactory.getShape("CIRCLE");
        //绘制
        circle.draw();
        //获取颜色为Red的对象
        Color red = colorFactory.getColor("RED");
        //填充颜色
        red.fill();
    }
}
