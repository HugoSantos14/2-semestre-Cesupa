import java.util.Scanner;

public class SequenciaNumerica {
    public static void main(String[] args) {
        int numerador = 1;
        int denominador = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("N° de termos da sequência: ");
        int n = input.nextInt();

        if (n >= 1) {
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    System.out.print("\nS = " + numerador);
                } else {
                    System.out.print(" + " + numerador + "/" + denominador);
                }
    
                numerador++;
                denominador = denominador + 2;
            }
        } else {
            System.out.println("\nErro");
        }

        input.close();
    }
}