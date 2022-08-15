import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r,n;
        Scanner scn = new Scanner(System.in);
        //sayı
        System.out.println("Hangi sayının üssü alınacak: ");
        n=scn.nextInt();
        //kuvvet
        System.out.println("Kaçıncı kuvvet: ");
        r=scn.nextInt();
        //döngü
        int total=1;
        for (int i=1;i<=r;i++){
            total*=n;
        }
        //sonuç
        System.out.println(total);

    }
}
