public class Parent implements Printable {
    private String parentProperty;

    public Parent(String parentProperty) {
        this.parentProperty = parentProperty;
    }

    public String getParentProperty() {
        return parentProperty;
    }

    @Override
    public void print() {
        System.out.println("Parent Property: " + parentProperty);
    }
}

class Child2 extends Parent {
    private int child2Property;

    public Child2(String parentProperty, int child2Property) {
        super(parentProperty);
        this.child2Property = child2Property;
    }

    public int getChild2Property() {
        return child2Property;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Child2 Property: " + child2Property);
    }
}

class Child3 extends Parent {
    private double child3Property;

    public Child3(String parentProperty, double child3Property) {
        super(parentProperty);
        this.child3Property = child3Property;
    }

    public double getChild3Property() {
        return child3Property;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Child3 Property: " + child3Property);
    }
}

class Child4 extends Parent {
    private boolean child4Property;

    public Child4(String parentProperty, boolean child4Property) {
        super(parentProperty);
        this.child4Property = child4Property;
    }

    public boolean isChild4Property() {
        return child4Property;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Child4 Property: " + child4Property);
    }
}
