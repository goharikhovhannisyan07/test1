package book.chapter6;

public class BoxDemo7 {
    public static void main(String[] args) {

        Box4 mybox1=new Box4(10,20,15);
        Box4 mybox2=new Box4(3,6,9);

        double vol;

        vol=mybox1.valome();
        System.out.println("Volume is " + vol);
        vol=mybox2.valome();
        System.out.println("Volume is " + vol);
    }
}
