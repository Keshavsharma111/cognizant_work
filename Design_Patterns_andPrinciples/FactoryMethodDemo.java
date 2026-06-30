interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}


class ShapeFactory {

    public Shape getShape(String shapeType) {

        if (shapeType.equalsIgnoreCase("Circle")) {
            return new Circle();
        }

        if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        }

        return null;
    }
}

public class FactoryMethodDemo {

    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();

        Shape s1 = factory.getShape("Circle");
        s1.draw();

        Shape s2 = factory.getShape("Rectangle");
        s2.draw();
    }
}