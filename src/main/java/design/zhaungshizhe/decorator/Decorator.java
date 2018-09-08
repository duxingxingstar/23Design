package design.zhaungshizhe.decorator;

import design.zhaungshizhe.coffeeBar.Drink;

/**
 * 装饰者的装饰部分,用来补充扩展主体,比如咖啡加奶,加糖等调料操作
 */
public class Decorator extends Drink {

    //该装饰的主体
    private Drink obj;

    /**
     * 创建时,传入要修饰的主体,即对哪种单品咖啡加什么调料
     * 此单品咖啡可能存在加多种调料,那么就递归计算最终价格
     * @param obj
     */
    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        //返回调料价格+主体单品咖啡价格(可能已经加过其它调料,所以这个要取cost总花费)
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDescription() {
        //返回调料信息+咖啡信息
        return super.getDescription() + "--" + super.getPrice() + "&&" + obj.getDescription() + "--" + obj.getPrice();
    }
}
