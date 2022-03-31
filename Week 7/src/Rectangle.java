public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {
        width = 2.0;
        length = 3.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, Boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return length * width;
    }

    public double getParimeter() {
        return (2 * length) + (2 * width);
    }

    public String toString() {
        return "A Rectangle with width = " + width + "and length = " + length + ", which is a subclass of "
                + super.toString();
    }

}
