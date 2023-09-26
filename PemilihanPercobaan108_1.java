import java.util.Scanner;

  public class PemilihanPercobaan108_1{
    public static void main(String[] args){
      Scanner input08 = new Scanner(System.in);

      System.out.println("Masukkan angka: ");

      String hasil;
      int angka = input08.nextInt();

      hasil = (angka % 2 == 0) ? " Bilangan Genap " : "Bilangan Ganjil";
      System.out.println(angka + "adalah" + hasil );
     

    }

  }