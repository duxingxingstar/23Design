package design.zhaungshizhe;

import design.zhaungshizhe.coffee.DeCaf;
import design.zhaungshizhe.coffee.LongBlack;
import design.zhaungshizhe.coffeeBar.Drink;
import design.zhaungshizhe.decorator.Chcolate;
import design.zhaungshizhe.decorator.Milk;

public class TestMainZsz {

    public static void main(String[] args) {
        Drink order;
        order = new DeCaf();
        System.out.println(order.cost());

        System.out.println("========================");
        order = new LongBlack();
        order = new Milk(order);
        order = new Chcolate(order);
        System.out.println(order.cost());
        System.out.println(order.getDescription());

    }
}
