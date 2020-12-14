package abstractfactory.factory;

import abstractfactory.impl.shape.Circle;
import abstractfactory.impl.shape.Rectangle;
import abstractfactory.impl.shape.Square;
import abstractfactory.inter.Color;
import abstractfactory.inter.Shape;

/**
 * @author dangbaoqi
 * @date 2020/12/14 16:50
 */
public class ShapeFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {

        if(shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
