import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Idade do paciente: ");
        int idade = input.nextInt(); 
        System.out.print("Peso do paciente: ");
        float peso = input.nextFloat();

        if (idade >= 12) {
            if (peso >= 60) {
                System.out.println("O paciente deve tomar 40 gotas por dose");
            } else {
                System.out.println("O paciente deve tomar 35 gotas por dose");
            }
        } else {
            System.out.println("O paciente deve tomar 26 gotas por dose");
        }

        input.close();
    }
}