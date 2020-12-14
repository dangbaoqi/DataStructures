package abstractfactory.impl.color;

import abstractfactory.inter.Color;

/**
 * @author dangbaoqi
 * @date 2020/12/14 15:49
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
