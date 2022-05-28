package pattern;

public class Main{
    public static void main(String[] args) {
        pattern8(5);
    }

    public static void pattern1(int n){
        for (int row = 1; row <= n; row++){
            for (int column = 1; column <= n; column++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){
        for (int row = 1; row <= n; row++){
            // for every row, run the column
            for (int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    public static void pattern3(int n){
        for (int row = 1; row <= n; row++){
            // for (int column = n; column >= row; column--){
            for (int column = 1; column <= n - row + 1; column++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n){
        for (int row = 1; row <= n; row++ ){
            for (int column = 1; column <= row; column++){
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    // public static void pattern5(int n){
    //     int c = -1;
    //     for (int row = 0; row <= n*2-1; row++){
    //         if (row >= n)
    //             c--;
    //         else
    //             c++;
    //         for (int column = 0; column <= c; column++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    public static void pattern5(int n){
        for (int row = 0; row < n*2; row++){
            int totalColumnsInRow = row > n ? 2 * n - row : row;
            for (int column = 0; column < totalColumnsInRow; column++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n){
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= n - row + 1; col++)
                System.out.print("  ");
            for (int col = 1; col <= row; col++)
                System.out.print("* ");
            System.out.println();
        }
    }

    public static void pattern7(int n){
        for (int row  = 1; row <= n; row++){
            for (int col = 1; col <= n - row + 1; col++)
                System.out.print("* ");
            for (int col = 1; col <= row; col++)
                System.out.print("  ");
            System.out.println();
        }
    }

    public static void pattern8(int n){
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= n - row; col++){
                System.out.print("  ");
            }
            for (int col = 1; col <= 2*row-1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}   