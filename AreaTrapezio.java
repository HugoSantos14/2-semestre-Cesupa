import java.util.Scanner;

public class AreaTrapezio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Base 1 = ");
        float base1 = input.nextFloat();
        System.out.print("Base 2 = ");
        float base2 = input.nextFloat();
        System.out.print("Altura = ");
        float altura = input.nextFloat();
        float area = (base1 + base2) * altura / 2;

        System.out.println("Área do trapézio = " + area);
        input.close();
    }
}