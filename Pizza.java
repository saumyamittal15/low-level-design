package decoratorpattern;

public class Pizza {
    public static void main(String[] args) {
        BasePizza pizza = new Mushroom(new Farmhouse());
        System.out.println(pizza.cost());
    }
}
