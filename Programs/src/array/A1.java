package array;
import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter row Size:");
        int row = ip.nextInt();
        System.out.println("Enter column Size:");
        int col = ip.nextInt();
        
        int[][] Array = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                Array[i][j] = ip.nextInt();
            }
        }
        
        for (int[] rowArray : Array) {
            for (int element : rowArray) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        
        ip.close();
    }
}
