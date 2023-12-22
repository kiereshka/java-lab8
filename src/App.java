import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception
    {
        System.out.print("Введіть кількість потоків: ");
        Scanner scanner = new Scanner(System.in);

        int threadCount = scanner.nextInt();
        scanner.close();

        int totalPointNumber = 1000000;
        long startTime = System.currentTimeMillis();

        MonteMethod method = new MonteMethod(totalPointNumber,threadCount);
        long endTime = System.currentTimeMillis();
        long runTime = endTime - startTime;

        System.out.println("Значення PI дорівнює: " + method.pi());
        System.out.println("Кількість потоків: " + threadCount);
        System.out.println("Кількість ітерацій: " + method.totalPoints);
        System.out.println("Час роботи: " + runTime + " ms");
    }
}
