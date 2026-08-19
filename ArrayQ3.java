//Find the Smallest and largest element in an array


public class ArrayQ3 {
    public static void main(String[] args) {
        int[] arr={3,4,7,9,4,6};
        int max=arr[0];
        int min=arr[0];

        for(int i =1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println(max + " : Max");
        System.out.println(min + " : Min");

    }
}
