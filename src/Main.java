import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Input number: ");
        n = scanner.nextInt();

        for (int i = 1; i < n; i++) {
            if (PrimeNumber.isPrimeNumber(i)) {
                list.add(i);
            }
        }
        System.out.print("All prime number: ");
        for (Integer e : list) {
            System.out.print(e + " ");
        }

        System.out.println();
        Integer sum = list.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println("Sum all prime number: " + sum);

    }
}
