import java.util.*;

public class arraydiagnal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        printDiagnal(arr);
    }
    static void printDiagnal ( int[][] arr)
    {
        int pd=0;
        int sd=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    pd = pd + arr[i][j];
                }
                if ((i + j) == arr.length - 1) {
                    sd = sd + arr[i][j];
                }
            }

        }
        System.out.println("primary diagnal:"+pd);
        System.out.println("Secondary diagonal:"+sd);
    }
}