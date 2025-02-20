package factorypattern;

public class ShapeFactory {
    Shape getShape(String shapeName){
        return switch (shapeName) {
            case "CIRCLE" -> new Circle();
            case "RECTANGLE" -> new Rectangle();
            default -> null;
        };
    }


}
