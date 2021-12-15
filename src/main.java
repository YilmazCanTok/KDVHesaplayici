import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("***************************************");
        System.out.print("Ürünün Adı: ");
        String ürünadı = scanner.nextLine();
        System.out.print("Ürünün fiyatı : ");
        double ürünfiyatı = scanner.nextInt();
        System.out.println("***************************************");
        int kdv = (ürünfiyatı>0 && ürünfiyatı<=1000) ? 18 : 8;
        double hesaplanankdv = (ürünfiyatı*kdv)/100;
        System.out.println("KDV Miktarı : "+hesaplanankdv);
        System.out.println("Ürünün KDV eklendikten sonraki fiyatı : "+(ürünfiyatı+hesaplanankdv));
    }
}
