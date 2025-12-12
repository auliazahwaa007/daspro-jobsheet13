import java.util.Scanner;

public class PenjumlahanRekursif {
    static int jumlahRekursif(int n) {
        if (n == 1) 
            return 1;   
        return n + jumlahRekursif(n - 1);
    }
    static String deret(int n) {
        if (n == 1) return "1";  
        return deret(n - 1) + "+" + n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai f: ");
        int f = sc.nextInt();

        int hasil = jumlahRekursif(f);
        String tampil = deret(f);

        System.out.println(tampil + " = " + hasil);

        sc.close();
    }
}
