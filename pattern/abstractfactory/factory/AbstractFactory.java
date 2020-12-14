package abstractfactory.factory;

import abstractfactory.inter.Color;
import abstractfactory.inter.Shape;

/**
 * @author dangbaoqi
 * @date 2020/12/14 15:50
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
