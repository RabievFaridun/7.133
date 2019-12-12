
import java.util.Scanner;

public class Zad133{
public static void main(String[]args){

        Scanner in=new Scanner(System.in);
        int kol = 0;
        int maxx = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество чисел последовательности");
        int n = sc.nextInt();
        System.out.println("Введите  числа последовательности");
        for (int i = 0; i < n; i++) {
        int x = sc.nextInt();

        if (maxx < x) {
        maxx = x;
        kol = 1;
        } else if (maxx == x) {
        kol++;
        }
        System.out.println("Max = " + maxx + ", Count = " + kol);

        }
        }
}
