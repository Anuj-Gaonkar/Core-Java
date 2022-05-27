package pattern;

public class Main{
    public static void main(String[] args) {
        pattern2(4);
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
}