package homework.homework5;

public class ArraySpaceExample2 {

    public static void main(String[] args) {

        char[] spaceArray = {' ', ' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        int starIndex = 0;
        int endIndex = spaceArray.length - 1;
        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[starIndex] == ' ') {
                starIndex++;
            } else {
                break;
            }
        }


        for (int i = endIndex; i > 0; i--) {
            if (spaceArray[endIndex] == ' ') {
                endIndex--;
            } else {
                break;
            }
        }


        int newlength = (endIndex - starIndex) + 1;
        char[] result = new char[newlength];
        int j = 0;
        while (starIndex < endIndex + 1) {
            result[j++] = spaceArray[starIndex];
            starIndex = starIndex + 1;
        }

        for (char c : result) {
            System.out.print(c);
        }

    }
}
