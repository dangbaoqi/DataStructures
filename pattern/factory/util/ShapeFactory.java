package factory.util;

import factory.impl.Circle;
import factory.impl.Rectangle;
import factory.impl.Square;

/**
 * 星形状工厂类
 * @author dangbaoqi
 * @date 2020/11/30 17:54
 */
public class ShapeFactory {

    //使用 getShape 方法获取形状类型的对象
    public Shape getShape (String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
