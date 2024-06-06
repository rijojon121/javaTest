package demo;

import java.util.Scanner;

import javax.sound.sampled.ReverbType;

public class test {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to Reverse: ");
        String str = sc.next();

    // String rev = "";

        //String org_str = str;
       // int length = str.length();

        

        StringBuffer sb = new StringBuffer(str);
        System.out.println("Reverse of the String is : "+ sb.reverse());
        System.out.println("Str is: "+ str);

        if(sb.equals(str)){
            System.out.println("This is a Palindrome String:  "+ str);
        } else{
            System.out.println("This is not a Palindorme String: " + str);
        }
        
    }
}
