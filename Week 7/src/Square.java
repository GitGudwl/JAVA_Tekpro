public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double width, double length) {
        super(width, length);
    }

    public Square(String color, Boolean filled, double width, double length) {
        super(color, filled, width, length);
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public double getArea(){
        return getSide()*getSide();
    }

    @Override
    public double getParimeter(){
        return 4*getSide();
    }

    @Override
    public String toString(){
        return "A Square with side = " + getSide() + ", which is a subclass of " + super.toString();
    }

}
