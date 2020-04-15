package machine;

public class Beverage {
    private int milkCost;
    private int waterCost;
    private int beanCost;
    private int price;

    public Beverage(int type) {
        if (type == 1) {
            //espresso
            this.milkCost = 0;
            this.waterCost = 250;
            this.beanCost = 16;
            this.price = 4;
        } else if (type == 2) {
            //latte
            this.milkCost = 75;
            this.waterCost = 350;
            this.beanCost = 20;
            this.price = 7;
        } else if (type == 3) {
            //cappuccino
            this.milkCost = 100;
            this.waterCost = 200;
            this.beanCost = 12;
            this.price = 6;
        }
    }

    public int getWaterCost() {
        return waterCost;
    }

    public void setWaterCost(int waterCost) {
        this.waterCost = waterCost;
    }

    public int getBeanCost() {
        return beanCost;
    }

    public void setBeanCost(int beanCost) {
        this.beanCost = beanCost;
    }

    public int getMilkCost() {
        return milkCost;
    }

    public void setMilkCost(int milkCost) {
        this.milkCost = milkCost;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
