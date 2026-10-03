public class Day3 {
    public static void main(String[] args) {

        // W1. Print this pattern (N = 5):
        /*
         **
         **
         ***
         ****
         *****
         */

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // W2. Print this pattern (N = 5):
        /*
        *****
        ****
        ***
        **
        *
        */
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        // W3. Print this pattern (N = 5):
        /*
         * 1
         * 12
         * 123
         * 1234
         * 12345
         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // E1. Print this pattern (N = 5):
        /*
         * 1
         * 22
         * 333
         * 4444
         * 55555
         * 
         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        // E2. Print this pattern (N = 5):
        /*
         * 12345
         * 1234
         * 123
         * 12
         * 1
         */
        int n=5;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // E3. Print the right-aligned triangle (N = 5):
        /*
            *
           **
          ***
         ****
        *****
        */
       for(int i=1;i<=n;i++)
       {
        for(int s=1;s<=n-i;s++)
        {
            System.out.print(" ");
        }
        for(int j =1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();

       }

        // M1. Print a pyramid (N = 5):
        /*
            *
           ***
          *****
         *******
        *********
        */
       for(int i=1;i<=n;i++)
       {
        for(int s=1;s<=n-i;s++)
        {
            System.out.print(" ");
        }
        for(int j =1;j<=i;j++)
        {
            System.out.print("*");
        }
        for(int k=2;k<=i;k++)
        {
            System.out.print("*");
        }
        System.out.println();

       }

     
    }
}
