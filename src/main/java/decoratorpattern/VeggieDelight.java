package decoratorpattern;

public class VeggieDelight extends BasePizza{
    @Override
    public int cost() {
        return 150;
    }
}
