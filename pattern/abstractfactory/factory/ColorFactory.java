package abstractfactory.factory;

import abstractfactory.impl.color.Blue;
import abstractfactory.impl.color.Green;
import abstractfactory.impl.color.Red;
import abstractfactory.inter.Color;
import abstractfactory.inter.Shape;

/**
 * @author dangbaoqi
 * @date 2020/12/14 16:52
 */
public class ColorFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}
