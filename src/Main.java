public class Main {
    public static void main(String[] args) {
        Printable[] objects = new Printable[3];
        objects[0] = createObject("2й", "Parent Property", 123);
        objects[1] = createObject("3й", "Parent Property", 45.67);
        objects[2] = createObject("4й", "Parent Property", true);

        for (Printable object : objects) {
            object.print();
            System.out.println();
        }
    }

    public static Printable createObject(String className, String parentProperty, Object childProperty) {
        switch (className) {
            case "2й":
                return new Child2(parentProperty, (int) childProperty);
            case "3й":
                return new Child3(parentProperty, (double) childProperty);
            case "4й":
                return new Child4(parentProperty, (boolean) childProperty);
            default:
                throw new IllegalArgumentException("Unknown class name: " + className);
        }
    }
}