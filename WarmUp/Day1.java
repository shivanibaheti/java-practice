package WarmUp;

public class Day1 {
    public static void main(String[] args) {
        // Given the radius of a circle as 7.5, print its area and circumference. (area
        // = πr², circumference = 2πr). Use Math.PI.
        float radius = 7.5f;
        double area = (Math.PI) * radius * radius;
        System.out.println(area + " : is area of circle");
        double circumference = 2 * Math.PI * radius;
        System.out.println(circumference);

        // Given the length and width of a rectangle, print its area and perimeter.
        int l = 3;
        int w = 7;
        int areaRec = l * w;
        System.out.println(areaRec);
        int perimeter = 2 * (l + w);
        System.out.println(perimeter);

        // Convert a temperature from Celsius to Fahrenheit. (F = C × 9/5 + 32)
        int cel = 30;
        int far = cel * 9 / 5 + 32;
        System.out.println(far);

        // Given a two-digit number, print its two digits in reverse order as a number.
        // 47 → 74.
        int digit = 47;
        int last = digit % 10;
        int first = digit / 10;
        int rev = (last * 10) + first;
        System.out.println(rev);

        // Given a total number of seconds (e.g. 3725), print it as hours, minutes, and
        // seconds. 3725 → 1 h 2 m 5 s.
        /*hours   = total seconds / 3600          → whole hours
        leftover after hours = total seconds % 3600
        minutes = leftover / 60                 → whole minutes
        seconds = leftover % 60                 → remaining seconds */
        int hours   = 3725 / 3600;  //= 1
        int minutes = (3725 % 3600) / 60;  //= 125 / 60  = 2;
        int seconds = 3725 % 60;  //= 5;
        System.out.println(hours + "h " + minutes + "m " + seconds +"s ");

        // Given a three-digit number, print the sum of its digits. 943 → 16.
        int num = 943;
        int las2t = num % 10;
        num = num / 10;
        int second = num % 10;
        num = num / 10;
        int third = num;
        int sum = third + second + las2t;
        System.out.println(sum);

        // swap without 3rd Varibale
        int a = 5;
        int b = 10;

        a = b;
        b = a;

        System.out.println("a = " + a + ", b = " + b);

        // This code should print the average of three test scores. The correct answer
        // is 76.66.... It prints 76.0.
        int s1 = 70, s2 = 80, s3 = 80;
        double average = (s1 + s2 + s3) / 3; // if 3.0 is given then only its treated with . decimals or else it round
                                             // off as zresults.
        System.out.println("Average = " + average);

        // Optimization Challenge
        /*
         * int a = 12, b = 5;
         * 
         * System.out.println("Sum = " + (a + b));
         * System.out.println("Average = " + ((a + b) / 2.0));
         * System.out.println("Sum squared = " + ((a + b) * (a + b)));
         */
        int d = 12, e = 5;
        int sumof = d + e;
        System.out.println("Sum = " + sumof);
        System.out.println("Average = " + (sumof / 2.0));
        System.out.println("Sum squared = " + (sumof * sumof));
    }

    /*
     * Write your answers down before checking anything.
     * 
     * What does 17 / 5 print? What does 17 % 5 print?
     * 3.6 and 2
     * What does 4 / 10 print?
     * Java sees two integers. It performs integer division. The result is 0. Always
     * int x = 3.7; — will this compile? Why or why not?
     * does not compile. Java is strictly typed. It will not silently lose the .7. This is a protection, not a limitation
     * Given n = 8362, what does n % 10 give? What does n / 10 give?
     * 8362%10=2 , 8362/10=836
     * Given n = 8362, write the expression that extracts the digit 6. (Hint: 6 is
     * the last digit of something.)
     * int digit = n/10;
     * int lastdigit=digit%10;
     * What does System.out.println("5" + 3); print? What about System.out.println(5
     * + 3);? Explain the difference in one sentence.
     53 and Other prints 8 , One is string + int and Other both are int .
     * In one sentence, what is the difference between = and ==? 
     = means Value inside Variable , == Means are Both varibale Having same Values or stores same Value 
     */

}