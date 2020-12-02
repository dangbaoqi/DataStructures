package factory.impl;

import factory.util.Shape;

/**
 * 圆形
 * @author dangbaoqi
 * @date 2020/11/30 17:44
 */
public class Circle implements Shape {
    /**
     * 绘制圆形
     */
    @Override
    public void draw() {
        System.out.println("Inside Circle：：draw() method");
    }
}
