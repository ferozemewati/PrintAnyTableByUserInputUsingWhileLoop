// print table of 2 using While Loop.

public class WhileLoop {
    public static void main(String[] args) {
        int i=1;
        while (i<=10){
            int table=i*2;
            System.out.println(table);
            i++;
        }
    }
}


// Print any table by user input Using While Loop.

import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        int i=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please inter any value");
        int n=sc.nextInt();
        while (i<=10){
            int table=i*n;
            System.out.println(table);
            i++;
        }
    }
}





