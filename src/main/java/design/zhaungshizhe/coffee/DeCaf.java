package design.zhaungshizhe.coffee;

/**
 * 咖啡单品,具体主体实现
 */
public class DeCaf extends Coffee{

    /**
     * new 这个单品时就初始化好描述和单品咖啡价格
     */
    public DeCaf() {
        //定义单品咖啡描述
        super.setDescription("DeCoffee");
        //定义单品咖啡价格
        super.setPrice(3F);
    }
}
