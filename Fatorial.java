import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("x = ");
        int x = input.nextInt();
        int fat = x;
        for (int i = x - 1; i > 1; i--){
            fat = fat * i;
        }
        
        System.out.printf("\n%d! = %d\n", x, fat);

        input.close();
    }
}