package design.zhaungshizhe.coffee;

import design.zhaungshizhe.coffeeBar.Drink;

/**
 * 装饰者模式修饰顶级父类和子类的中间层,一般封装公共部分
 */
public class Coffee extends Drink {
    @Override
    public float cost() {
        //返回单品消费价格
        return super.getPrice();
    }
}
