public class TestCircle {
    public static void main(String[] args) {
        // Declare and allocate an instance of class Circle called c1
        //  with default radius and color
        Circle c1 = new Circle();
        // Use the dot operator to invoke methods of instance c1.
        System.out.println(c1.toString());
     
        // Declare and allocate an instance of class circle called c2
        //  with the given radius and default color
        Circle c2 = new Circle(2.0);
        // Use the dot operator to invoke methods of instance c2.
        System.out.println(c2.toString());

        Circle c3 = new Circle();
        c3.setRadius(5.0);
        c3.setColor("Red");
     }
}
