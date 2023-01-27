package homework.homework4;

public class CharArrayExample {

    public static void main(String[] args) {
//1.Պետք է գրել լոգիկա, որը կհաշվի թե քանի հատ կա
// c-փոփոխականից մեր մասիվի մեջ, ու տպել այդ քանակը։

        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };
        char c = 'o';
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                count++;
            }
        }
        System.out.println("count —> " + count);

//2.պետք է գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները։

        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };
        int middleIndex = chars2.length / 2;
        System.out.print(chars2[middleIndex - 1] + " ");
        System.out.println(chars[middleIndex]);

//3.պետք է տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y' };
        char x = chars3[chars3.length - 2];
        char y = chars3[chars3.length - 1];
        boolean result = false;
        if (x == 'l' && y == 'y') {
            result = true;
        }
        System.out.println("resulet = " + result);

//4.պետք է տպել մասիվի այն սինվոլները որոնք պռաբել չեն.

        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' ' };
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                System.out.print(text[i]);
            }
        }
    }
}


