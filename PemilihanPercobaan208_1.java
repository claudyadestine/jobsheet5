import java.util.Scanner;

public class PemilihanPercobaan208_1{
    public static void main(String[] args){
        Scanner input08 = new Scanner(System. in);


        System.out.print("Nilai uas : ");
        float uas = input08.nextFloat();
        System.out.print("Nilai uts : ");
        float uts = input08.nextFloat();
        System.out.print("Nilai kuis : ");
        float kuis = input08.nextFloat();
        System.out.print("Nilai tugas : ");  
        float tugas = input08.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        if (total > 80 && total <=100) {
         System.out.println("A");
        }else if (total > 73 && total <=80){
          System.out.println("B+");
        }else if (total > 65 && total <=73){
           System.out.println("B");
        }else if (total > 60 && total <= 65){
            System.out.println("C+");
        }else if(total > 50 && total <= 60){
            System.out.println("C");
        }else if ( total > 39 && total <= 50){
            System.out.println("D");
        }else {
         System.out.println("E");
        }

    
    }
}