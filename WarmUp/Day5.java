public class Day5 {
    // W1. static int countDigits(int n). 4572 → 4, 0 → 1.
    static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            int d = n % 10;
            count++;
            n = n / 10;
        }
        return count;
    }

    // W2. static int lastDigit(int n) and static int firstDigit(int n). 4572 → 2
    // and 4.
    // Think: the last digit is one expression. For the first digit, keep removing
    // the last digit until only one digit is left. What condition says “only one
    // digit left”?

    static int lastDigit(int n) {
        return n % 10;
    }

    static int firstDigit(int n) {
        while (n >= 10) {
            n = n / 10;
        }
        return n;
    }

    // W3. static int productOfDigits(int n). 234 → 24. Decide the starting value
    // before coding.
    static int productOfDigits(int n) {
        int prod = 1;
        while (n > 0) {
            int d = n % 10;
            prod = prod * d;
            n = n / 10;
        }
        return prod;
    }

    // E1. static int largestDigit(int n). 4572 → 7.
    static int largestDigit(int n) {
        int largest = 0;
        while (n > 0) {
            int s = n % 10;
            if (largest < s) {
                largest = s;
            }
            n = n / 10;

        }
        return largest;
    }

    // E2. static int smallestDigit(int n). 4572 → 2.
    static int smallestDigit(int n) {
        int smallest = 9;
        while (n > 0) {
            int s = n % 10;
            if (smallest > s) {
                smallest = s;
            }
            n = n / 10;
        }
        return smallest;
    }

    // E3. static int countEvenDigits(int n). 4572 → 2 (digits 4 and 2).
    static int countEvenDigits(int n) {
        int count = 0;
        while (n > 0) {
            int s = n % 10;
            if (s % 2 == 0) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }

    // M1. static int countOccurrences(int n, int d): how many times digit d appears
    // in n. (1050, 0) → 2. Edge case: (0, 0).
    static int countOccurrences(int n, int d) {
        int count = 0;
        while (n > 0) {
            int s = n % 10;
            if (s == d) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }

    // M2. static boolean containsZero(int n): use an early return true. 105 → true,
    // 0 → true, 123 → false.
    static boolean containsZero(int n) {
        do {
            if (n % 10 == 0)
                return true;
            n = n / 10;
        } while (n > 0);
        return false;
    }

    // I1. static boolean isStrictlyAscending(int n): do the digits increase from
    // left to right? 1359 → true, 1329 → false, 7 → true.
    static boolean isStrictlyAscending(int n) {
        int prev = n % 10;
        n = n / 10;
        while (n > 0) {
            int cur = n % 10;
            if (cur >= prev)
                return false; // moving left, digits must shrink
            prev = cur;
            n = n / 10;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(countDigits(4572));
        System.out.println(lastDigit(4572));
        System.out.println(firstDigit(4572));
        System.out.println(productOfDigits(234));
        System.out.println(largestDigit(4572));
        System.out.println(smallestDigit(4572));
        System.out.println(countEvenDigits(4572));
        System.out.println(countOccurrences(10050, 0));
        System.out.println(containsZero(180));
        System.out.println(containsZero(777));
        System.out.println(isStrictlyAscending(1359));
        System.out.println(isStrictlyAscending(1329));
        System.out.println(isStrictlyAscending(7));

    }
}
