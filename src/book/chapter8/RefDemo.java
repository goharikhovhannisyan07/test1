package book.chapter8;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box plainBox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println(" Volume of WeightBox is " + vol);
        System.out.println(" Weight of WeightBox is " + weightbox.weight);
        System.out.println();

        plainBox = weightbox;

        vol = plainBox.volume();
        System.out.println(" Volume of plainBox is " + vol);
        //System.out.println(" Weight of plainBox is " + plainBox.weight); Error!

    }
}
