//Reading  from Console and Writing Data Into Array

import java.util.*;
public class ArrayQ11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] a=new int[5];

        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter a Value");
            a[i]=sc.nextInt();

        }
        System.out.println("Printing Elements into Array");
        System.out.println(Arrays.toString(a));
    }
}