package abstractfactory.impl.shape;

import abstractfactory.inter.Shape;

/**
 * @author dangbaoqi
 * @date 2020/12/14 15:46
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
