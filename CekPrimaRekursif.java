import java.util.Scanner;

public class CekPrimaRekursif {
    static boolean cekPrima(int n, int pembagi) {
        if (n < 2) return false;            
        if (pembagi * pembagi > n) return true;
        if (n % pembagi == 0) return false;  

        return cekPrima(n, pembagi + 1);     
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int n = sc.nextInt();

        boolean hasil = cekPrima(n, 2);

        if (hasil) {
            System.out.println(n + " adalah bilangan prima");
        } else {
            System.out.println(n + " bukan bilangan prima");
        }

        sc.close();
    }
}
