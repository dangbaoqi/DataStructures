package abstractfactory.impl.shape;

import abstractfactory.inter.Shape;

/**
 * @author dangbaoqi
 * @date 2020/12/14 15:47
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
