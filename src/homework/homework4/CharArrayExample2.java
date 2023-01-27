package homework.homework4;

public class CharArrayExample2 {

    public static void main(String[] args) {

        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };
        char c = 'o';
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'o') {
                count++;
            }
        }
        System.out.println(count);

        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };
        int middleIndex = chars2.length / 2;
        System.out.print(chars2[middleIndex - 1] + " ");
        System.out.println(chars2[middleIndex]);

        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y' };
        int x = chars3[chars3.length - 1];
        int y = chars3[chars3.length - 2];
        boolean result = false;
        for (int i = 0; i < chars3.length; i++) {
            if (x == 'y' && y == 'l') {
                result = true;
            }
        }
        System.out.println("result " + result);


        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' ' };
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                System.out.print(text[i]);
            }
        }

    }
}
