//Finding the element in an array 

public class ArrayQ9 {
    public static void main(String[] args) {
        int[] arr={3,5,6,4,3,5,2,2,4};
        int element=6;
        boolean status=false;
        for(int i=0;i<arr.length;i++)
        {
            if(element==arr[i])
            {
                status=true;
                System.out.println("Element Found In Array");
                break;
            }
        }
        if(status==false){
            System.out.println("Element Not Found In an Array");
        }
        
    }
}
