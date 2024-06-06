package demo;

import java.util.Scanner;

public class palindromeString {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to see if its Palindrome: ");
        String str = sc.nextLine();

        String rev = "";
        int len = str.length();
        String org_str = str;

        for(int i=len-1;i>=0;i--){

            rev = rev + str.charAt(i);
        }
        System.out.println("Reverse of the String is : "+ rev);

        if(org_str.toLowerCase().equals(rev.toLowerCase())){
            System.out.println("This is a Palindrome String : "+ rev);

        } else {
            System.out.println("This is not a Palinfrome Number" + rev);
        }
    }
}
