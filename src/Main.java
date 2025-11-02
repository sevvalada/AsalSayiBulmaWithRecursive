import java.util.Scanner;

public class Main {


    static boolean isPrime(int number, int i) {

        if (i == number) {
            return true;
        }

        if (i != 1 && number % i == 0) {
            return false;
        }

        return isPrime(number, i + 1); // i bir artır ve devam et
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number = input.nextInt();

         if (isPrime(number, 1)) {
            System.out.println(number + " asaldır");
        } else {
            System.out.println(number + " asal değildir");
        }
    }
}
