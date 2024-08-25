import java.util.Scanner;

public class DescontoDeCombustivel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double resultado;

        System.out.println("A - Álcool");
        System.out.println("G - Gasolina");
        System.out.print("Tipo de combustível: ");
        char combustivel = input.next().charAt(0);
        System.out.print("Litros vendidos = ");
        double litros = input.nextDouble();
        
        if(combustivel == 'A'){
            if (litros <= 20){
                resultado = litros*4.85*0.97;
            } else {
                resultado = litros*4.85*0.95;
            }
            System.out.printf("Preço: R$ %.2f", resultado);
        } else if (combustivel == 'G'){
            if (litros <= 20) {
                resultado = litros*5.67*0.96;
            } else {
                resultado = litros*5.67*0.94;
            }
            System.out.printf("Preço: R$ %.2f", resultado);
        } else {
            System.out.println("Erro");
        }

        input.close();
    }
}