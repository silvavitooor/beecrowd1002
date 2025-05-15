import java.util.Scanner;

public class AreaDocirculo {
    public static void main(String[] args) {

        double n = 3.14159d;

        Scanner scanner = new Scanner(System.in);
        double raio = scanner.nextDouble();

        double area = (n * (raio * raio));

        System.out.printf("A=%.4f\n", area);
    }
}
