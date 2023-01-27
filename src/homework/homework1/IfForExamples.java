package homework.homework1;


public class IfForExamples {
    public static void main(String[] args) {

        // 1. Տպել փոփոխականններից մեծը՝

        int a = 20;
        int b = 19;
        if (a == b) {
            System.out.println("both are equal");
        } else if (a > b) {
            System.out.println("max -> " + a);
        } else if (b > a) {
            System.out.println("max -> " + b);

        }
        /* 2.Գրել կոդ, որ այդ նույն թվերից փոքրից մինչև մեծ ցիկլ կֆռռա,
         ու կտպի իրենց արանքում գտնվող բոլոր թվերը՝**/

        int x = 5;
        int y = 10;
        for (int i = x; i <= y; i++) {
            System.out.print(i + " ");
        }

        /* 3. Փոխակերպել a-ի արժեքը char-տիպի, ու տպել թե ինչ սինվոլ ստացվեց։
         Նույնը b-ի համար։ **/
        System.out.println();
        int a1 = 77;
        int b1 = 1395;
        char ch1 = (char) a1;
        char ch2 = (char) b1;
        System.out.print(ch1 + " ");
        System.out.println(ch2);

        /* 4. Գրել կոդ, որը կստուգի եթե a-ն հավասար է b-ին, կտպի` a-ն հավասար է բ-ին,
         եթե ոչ, կտպի որ հավասար չէ` **/

        a = 25;
        b = 35;
        if (a == b) {
            System.out.print("both are equal ");
        } else {
            System.out.println("both are not equal ");
        }
    }

}


