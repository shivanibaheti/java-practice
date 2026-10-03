public class Day4 {
    //W1. Write static void greet() that prints Hello. Call it 3 times from main.

    static void greet()
    {
        System.out.println("Hello");
    }

    //W2. Write static int square(int n). Print square(7).
    static int square(int n)
    {
        return n*n;
    }

    //W3. Write static boolean isEven(int n). Print isEven(10) and isEven(7).
    static boolean isEven(int n)
    {
        return n % 2 == 0;
    }

     //E1. static int max(int a, int b). Then find the max of three numbers by calling max twice, with no new comparison logic.
    
    static int max(int a, int b)
    {   
        return a>b ? a :b ;
    }

    //E2. static int sumOfDigits(int n). This is your Day 3 loop moved into a method.
    static int sumofdigits(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++){
           sum=sum+i;
        }
        return sum;
    }

    //E3. static long factorial(int n). Why long? (Your Day 3 note on 13! overflowing int is the answer.)
    static long factorial(int n )
    {
        int fact=1;
        for(int i = 1;i<=n;i++)
            {
                fact=fact*i;
            }
        return fact;
        
    }

    //M1. static boolean isPrime(int n).
    static boolean isPrime(int n)
    {
        for(int i =2;i<=n-1;i++)
            {
                if(n%i==0)
                {
                    return false;
                }
            }
        return true;
        
    }

    //M2. static int reverse(int n), then static boolean isPalindrome(int n) that calls reverse.
    static int reverse(int n)
    {
         int rev = 0;
        while (n > 0) {
            int last = n % 10;
            rev = rev * 10 + last;
            n = n / 10;
        }
        return rev;
    }
    static boolean isPalindrome(int n)
    {
        return n==reverse(n);
    }


    //I1. static int gcd(int a, int b): the largest number that divides both. gcd(12, 18) = 6.
    static int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

    public static void main(String[] args) {
        
        greet();
        greet();
        greet();

        System.out.println(square(7));

        System.out.println(isEven(10));
        System.out.println(isEven(7));

        int m = max(7, max(5, 3));
        System.out.println(m);

        System.out.println(sumofdigits(5));

        System.out.println(factorial(7));

        System.out.println(isPrime(4));

        System.out.println(isPalindrome(121));

        System.out.println(gcd(12,18));
    }

   










}
