public class ArrayQ12 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2,4,7,8,3,3,4,3, 3, 3};
        int[] freq = new int[arr.length]; // tally boxes for numbers 0 to 9

        // Step 1: count each numbe
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        // Step 2: print only the numbers that appeared
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " occurs " + freq[i] + " times");
            }
        }
    }
}