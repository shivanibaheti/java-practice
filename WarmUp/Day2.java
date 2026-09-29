public class Day2 {
    public static void main(String[] args) {
        // int year = 1900;
        // if ((year%4==0 && year%100!=0)|| year%400==0) {
        // System.out.println("its Leap Year");

        // }
        // else{
        // System.out.println("its Not Leap Year");
        // }

        int n = 943;
        while (n > 0) {
            int digit = n % 10; // extract last digit
            System.out.println(digit);
            n = n / 10; // remove last digit
        }

        // W1. Print all numbers from 1 to N. (N = 10)
        int num1 = 10;
        for (int i = 1; i <= num1; i++) {
            System.out.println(i);
        }

        // W2. Print all numbers from N down to 1. (N = 10)
        for (int i = num1; i >= 1; i--) {
            System.out.println(i);
        }

        // W3. Print all even numbers from 2 to 20
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("even Numbers " + i);
            }
        }

        //E1. Find the sum of numbers from 1 to N. (N = 100)
        int sum=0;
        for(int i=1;i<=100;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);

        int num=100;
        int s= num*(num+1)/2;
        System.out.println(s);

        //E2. Print the multiplication table of a number. (n = 7)
        int mul = 7;
        for(int i=1;i<=10;i++)
        {
            int table = mul*i;
            System.out.println(mul + "X" + i + "=" + table );
        }

        //E3. Count how many numbers between 1 and N are divisible by 3. (N = 30)
        int count=0;
        for(int i=1;i<=30;i++)
        {
             if(i%3==0)
             {
                count++;
             }
        }
        System.out.println(count);

        //M1. Calculate the factorial of N. (N = 6, answer = 720)
        int fact=1;
        for(int i =1;i<=6;i++)
        {
            fact = fact *i;
        }
        System.out.println(fact);
        

        //M2. Digit extraction using a while loop. Given n = 4572, print each digit on a separate line, from last to first.
        int digit=4572;
        while(digit>0)
        {
            int lastdigit=digit%10;
            System.out.println(lastdigit);
            digit=digit/10;
        }

        //I1. Find the sum of digits of a number. n = 4572 → 18
        int sod=0;
        int digit2=4572;
        while(digit2>0)
        {
            int last = digit2%10;
            sod=sod+last;
            digit2=digit2/10;
            
        }
        System.out.println(sod);
    
    
    }

}
