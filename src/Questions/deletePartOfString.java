//Input an email from the user. You have to create a username from the email
//by deleting the part that comes after ‘@’. Display that username to the user.
package Questions;

import java.util.Scanner;

public class deletePartOfString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your email : ");
        String email = in.nextLine();
        String username = "";
        for(int i=0; i<email.length(); i++) {
            if(email.charAt(i)=='@') {
                break;
            } else {
                username += email.charAt(i);
            }
        }
        System.out.println("Your user name is : "+username);
    }
}
