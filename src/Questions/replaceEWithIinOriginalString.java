//Input a string from the user. Create a new string called
//‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’.
package Questions;

import java.util.Scanner;

public class replaceEWithIinOriginalString {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter string : ");
        String str = in.next();
        String result = "";
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == 'e') {
                result += 'i';
            } else {
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
