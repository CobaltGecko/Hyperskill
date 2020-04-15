package machine;

public class Machine {
    private int cash;
    private int water;
    private int milk;
    private int beans;
    private int cups;

    public Machine(int cash, int water, int milk, int beans, int cups) {
        setCash(cash);
        setWater(water);
        setMilk(milk);
        setBeans(beans);
        setCups(cups);
    }

    public void stats() {
        System.out.println("The coffee machine has:");
        System.out.println(getWater() + "ml of water");
        System.out.println(getMilk() + "ml of milk");
        System.out.println(getBeans() + "g of beans");
        System.out.println(getCups() + " disposable cups");
        System.out.println("$" + getCash());
        System.out.println();
    }

    public void buy(int coffeeInput ){
        Beverage beverage = new Beverage(coffeeInput);
        if (getWater() < beverage.getWaterCost()) {
            System.out.println("Sorry, not enough water!");
        } else if (getBeans() < beverage.getBeanCost()) {
                System.out.println("Sorry, not enough coffee beans!");
        } else if (getMilk() < beverage.getMilkCost()) {
            System.out.println("Sorry, not enough milk!");
        } else if (getCups() < 1) {
            System.out.println("Sorry, not enough cups!");
        } else {
            System.out.println("I have enough resources, making you a coffee!");
            setWater(this.water - beverage.getWaterCost());
            setMilk(this.milk - beverage.getMilkCost());
            setBeans(this.beans - beverage.getBeanCost());
            setCups(this.cups - 1);
            setCash(this.cash + beverage.getPrice());
        }
    }

    public void fill(int water, int milk, int beans, int cups){
        this.water = this.water + water;
        this.milk = this.milk + milk;
        this.beans = this.beans + beans;
        this.cups = this.cups + cups;
    }

    public void take(){
        System.out.println("I gave you $" + this.cash);
        this.cash = 0;
    }


    //Getters and Setters
    public int getCash() {
        return cash;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getBeans() {
        return beans;
    }

    public int getCups() {
        return cups;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public void setBeans(int beans) {
        this.beans = beans;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }
}
