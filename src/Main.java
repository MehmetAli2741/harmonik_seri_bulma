import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N Sayısını Giriniz: ");
        int n = input.nextInt();
        double result = 0;
        for (int i = 1; i <= n; i++){ // sayaç int yerine double kullanırsakda bu işlemi yaparız
            result += (1.0/i); // double sayı ile işlem yaparsak double sonuç alırız
        }
        System.out.println(result);
    }
}