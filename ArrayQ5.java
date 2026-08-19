//Calculate the sum of elements in an array 

public class ArrayQ5 {
    public static void main(String[] args) {
        int[] arr={3,4,7,6,7,6,3,4,3};
        int sum=0;
        for(int i=0;i<arr.length;i++){
             sum = sum+arr[i];
        }
        System.out.println(sum);
    }
}
