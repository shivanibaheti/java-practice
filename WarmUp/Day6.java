public class Day6 {
    // W1. static int countOddDigits(int n). 4572 → 2. What should 0 return?
    static int countOddDigits(int n) {
        int count = 0;

        if (n == 0) {
            return count;
        }
        while (n > 0) {
            int d = n % 10;
            if (d % 2 != 0) {
                count++;
            }
            n = n / 10;
        }
        return count;

    }

    // W2. static int power(int base, int exp) without Math.pow. power(2, 10) →
    // 1024, power(5, 0) → 1.
    static int power(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result = result * base;
        }
        return result;
    }

    // W3. reverse(int n), retyped from memory. Then predict reverse(1200) before
    // running it.
    static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            int d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }
        return rev;
    }

    // E1. isPalindrome(int n) calling reverse. Test 121, 123, 0, 10, 7.
    static boolean isPalindrome(int n) {
        return n == reverse(n);
    }

    // E2. static int firstPlusLast(int n). 4572 → 6, 7 → 14. Reuse firstDigit and
    // lastDigit.
    static int lastDigit(int n) {
        return n % 10;
    }

    static int firstDigit(int n) {
        while (n >= 10) {
            n = n / 10;
        }
        return n;
    }

    static int firstPlusLast(int n) {
        return firstDigit(n) + lastDigit(n);
    }

    // E3. static int lcm(int a, int b) using your gcd. lcm(4, 6) → 12. Think: gcd *
    // lcm = a * b. Which order of / and * avoids overflow?
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }

    // //M1. static int swapFirstAndLast(int n). 4572 → 2574, 47 → 74, 7 → 7, 1200 → 201.
    // Think: split the number into first, middle and last. Rebuild as last at the
    // top place, middle in the centre, first at the bottom. Work out the place
    // values for 4 digits on paper before coding. You’ll need countDigits and power.
   static int swapFirstAndLast(int n) {
    int digits = countDigits(n);
    if (digits < 2) return n;
    int first  = firstDigit(n);
    int last   = lastDigit(n);
    int middle = (n / 10) % power(10, digits - 2);
    return last * power(10, digits - 1) + middle * 10 + first;
}

    // M2. static int removeDigit(int n, int d): remove every occurrence of digit d. (12031, 0) → 1231, (1050, 0) → 15.
    // Hint: if you used rev * 10 + d you’d reverse the number. You need to build it in the original order. 
    // Which of the two patterns in the table above does that?

    public static void main(String[] args) {
        System.out.println(countOddDigits(4572));
        System.out.println(power(2, 10));
        System.out.println(power(5, 0));
        System.out.println(reverse(1200));
        System.out.println(isPalindrome(121));
        System.out.println(firstPlusLast(4572));
        System.out.println(lcm(4, 6));
        System.out.println(swapFirstAndLast(4572));

    }
}
