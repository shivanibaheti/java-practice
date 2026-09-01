//sorting Elements In Array and Reverseing Array
import java.util.*;
public class ArrayQ10 {
    public static void main(String[] args) {
        int[] a={3,44,567,7,234,6,464,234,};
        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("After Sorting");
        System.out.println(Arrays.toString(a));

        //Reverse the Got Array
        System.out.println("After Reversing");
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]+ " ");
        }
        

    }
}
