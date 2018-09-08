package design.zhaungshizhe.coffeeBar;

/**
 * 装饰者模式顶级抽象父类主体
 */
public abstract class Drink {

    //咖啡单品描述
    public String description = "";
    //价格
    public float price = 0F;


    /**
     * 咖啡单品子类自己去实现价格计算
     * @return
     */
    public abstract float cost();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
