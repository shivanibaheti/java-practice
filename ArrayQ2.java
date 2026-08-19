//Find Smallest Element in an Array 


public class ArrayQ2 {
    public static void main(String[] args) {
       int[] arr={5,3,1,6,5};
       int min=arr[0];
       
       for(int i = 1;i<arr.length;i++)
       {
        if(arr[i]<min)
        {
            min=arr[i];
        }
       }
       System.out.println(min);
    }
}
