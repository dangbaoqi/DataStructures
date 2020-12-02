package factory.impl;

import factory.util.Shape;

/**
 * 矩形
 * @author dangbaoqi
 * @date 2020/11/30 17:42
 */
public class Rectangle implements Shape {
    /**
     * 绘制矩形
     */
    @Override
    public void draw() {
        System.out.println("Inside Rectangle：：draw() method");
    }
}
