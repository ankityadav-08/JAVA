package First;

import java.util.*;

public class takeInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);     // mandatory for traking user inputs
        int x;
        String a;
        System.out.println("Enter no. :");
        x=sc.nextInt();     // For integer input

        sc.nextLine();      // this is needed cause after taking int input blank spaces are taked a string input
        
        System.out.println("Enter string : ");
        a=sc.nextLine();    // for string input
        System.out.println(x+" "+a);

    }
}
