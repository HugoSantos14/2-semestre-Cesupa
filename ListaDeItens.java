import java.util.Scanner;

public class ListaDeItens {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de adultos: ");
        int adultos = input.nextInt();
        System.out.print("Digite a quantidade de cachorros: ");
        int cachorros = input.nextInt();
        
        int convidados = adultos + cachorros;
        
        System.out.println("\n<<< Lista de itens >>>\n");
        System.out.println("- Carne para os adultos: " + (adultos * 350) + "g");
        System.out.println("- Carne para os cachorros: " + (cachorros * 100.5) + "g");
        System.out.println("- Linguiça: " + (convidados * 130) + "g");
        System.out.println("- Pão de alho: " + (convidados / 8) + " pacotes");
        System.out.println("- Água: " + (convidados * 500) + "ml");
        System.out.println("- Rum: " + (adultos * 990) + "ml");
        
        input.close();
    }
}