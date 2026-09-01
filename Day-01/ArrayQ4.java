public class ArrayQ4 {
    public static void main(String[] args) {
        int[] arr={3,6,2,5,8,7};
        int secondsmallest=arr[0];
        int smallest=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest)
            {
                secondsmallest=smallest;
                smallest=arr[i];

            }
        }
        System.out.println(secondsmallest);
    }
}
