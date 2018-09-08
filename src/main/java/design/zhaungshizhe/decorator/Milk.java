package design.zhaungshizhe.decorator;

import design.zhaungshizhe.coffeeBar.Drink;

/**
 * 牛奶调料
 */
public class Milk extends Decorator {

    public Milk(Drink obj) {
        super(obj);
        super.setDescription("Milk");
        super.setPrice(2F);
    }
}
