import java.util.Scanner;

public class Main {


    public static class Digitcounting {

        public static void main(String[] args) {
            long n;
            long i = 0;
            Scanner scan = new Scanner(System.in);
            System.out.println("En çok 10 haneli bir tamsayı giriniz:");
            n = scan.nextLong();
            do {
                ++i;
                n = n / 10;
            } while (n > 0);
            System.out.printf("%d sayısında %d hane vardır.", n, i);
        }
    }
}