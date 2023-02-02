package book.chapter8;

public class Access {

    public static void main(String[] args) {
        B2 subOb=new B2();

        subOb.setij(10,20);
//        subOb.sum; //Error!
        System.out.println("total is " + subOb.total);
    }
}
