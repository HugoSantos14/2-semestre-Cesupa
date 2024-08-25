import java.util.Scanner;

public class Hipotenusa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Cateto 1 = ");
        float cat1 = input.nextFloat();
        System.out.print("Cateto 2 = ");
        float cat2 = input.nextFloat();

        System.out.println("Hipotenusa = " + Math.hypot(cat1, cat2));
        input.close();
    }
}