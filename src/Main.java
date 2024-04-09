import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner inp=new Scanner(System.in);

double kdvsiz_fiyat,kdv_oran;
        System.out.println("Hesaplanacak tutarı giriniz>");
        kdvsiz_fiyat=inp.nextDouble();
        kdv_oran=(kdvsiz_fiyat<1000)?(kdv_oran=0.18):(kdv_oran=0.08);
double kdvli_fiyat=(kdvsiz_fiyat*kdv_oran)+kdvsiz_fiyat;
        System.out.println("KDV'siz fiyat>"+kdvsiz_fiyat);
        System.out.println("KDV'li fiyat>"+kdvli_fiyat);
        System.out.println("KDV oranı>"+kdv_oran);
    }
}

