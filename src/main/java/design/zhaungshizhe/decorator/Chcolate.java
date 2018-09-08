package design.zhaungshizhe.decorator;

import design.zhaungshizhe.coffeeBar.Drink;

/**
 * 巧克力调料
 */
public class Chcolate extends Decorator {

    public Chcolate(Drink obj) {
        super(obj);
        super.setDescription("Chcolate");
        super.setPrice(1F);
    }
}
