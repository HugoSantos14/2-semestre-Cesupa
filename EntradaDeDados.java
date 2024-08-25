import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Lendo uma string
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();

        // Lendo um ponteiro
        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();

        // Lendo um número de ponto flutuante
        System.out.println("Digite sua altura: ");
        double altura = input.nextDouble();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);

        input.close();
    }
}