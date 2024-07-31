import java.util.Scanner;

public class Main {
    // Recursive metot tanımı
    static void recursivePattern(int number, int temp, boolean isSubtracting) {
        System.out.print(temp + " ");
        if (temp <= 0) {
            isSubtracting = false; // Eğer sayı 0 veya negatifse, eklemeye başla
        }

        if (temp == number && !isSubtracting) {
            return; // Başlangıç değerine ulaşıldığında dur

        }

        if (isSubtracting) {
            recursivePattern(number, temp - 5, isSubtracting);
        } else {
            recursivePattern(number, temp + 5, isSubtracting);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan n değerini alma
        System.out.print("Bir sayı giriniz: ");
        int n = scanner.nextInt();

        // Recursive metodu çağırma
        recursivePattern(n, n, true);
    }
}
