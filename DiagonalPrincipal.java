import java.util.Scanner;

public class q03 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("Digite o termo [%d][%d] da matriz: ", i + 1, j + 1);
                matriz[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println("");
        }

        System.out.println("\nDiagonal principal:");
        for (int i = 0; i < 4; i++) {
            System.out.println(matriz[i][i]);
            
        }

        input.close();
    }
}