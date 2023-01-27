package classwork.string;

public class StringExample {
    public static void main(String[] args) {
        String name = "Narek Goga";

        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));// creat char array
        }

//        System.out.println(name.endsWith("go")); //արդյունքը boolean
//        System.out.println(name.startsWith(" ")); //boolean
//        System.out.println(name.contains("ek")); //middle boolean
//        System.out.println(name.length());// քանակ
//        System.out.println(name);
//        System.out.println(name.toUpperCase()); //մեծատառ
//        System.out.println(name.toLowerCase()); //փոքրատառ
//        System.out.println(name.trim()); //հանել " "-ները
//        System.out.println(name.substring(6));//հանում է դիմացի էլէմետները
//        System.out.println(name.substring(7, 11));//հանում է վերջից
//        String names[] = name.split(" "); //Հանում է այն սիմվոլը որը նշված է
//        for (String s : names) {
//            System.out.println(s);
//        }

    }
}
