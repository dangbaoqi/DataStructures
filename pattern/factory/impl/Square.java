package factory.impl;

import factory.util.Shape;

/**
 * 正方形实现类
 * @author dangbaoqi
 * @date 2020/11/30 17:40
 */
public class Square implements Shape {
    /**
     * 绘制正方形
     */
    @Override
    public void draw() {
        System.out.println("Inside Square：：draw() method");
    }
}
