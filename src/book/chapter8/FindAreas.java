package book.chapter8;

public class FindAreas {

    public static void main(String[] args) {
//        Figure f = new Figure(10, 10); because we change this ABSTRACT
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figref;

        figref = r;
        double area1 = figref.area();
        System.out.println("Area is " + area1);
        figref = t;
        double area2 = figref.area();
        System.out.println("Area is " + area2);
//        figref = f;
//        double area3 = figref.area();
//        System.out.println("Area is " + area3);
    }
}
