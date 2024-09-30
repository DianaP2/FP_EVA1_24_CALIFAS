package eva1_24_califas;

import java.util.Scanner;

/**
 *
 * @Diana Sanchez
 */
public class EVA1_24_CALIFAS {

    public static void main(String[] args) {
        int cali;
        
        Scanner captu=new Scanner(System.in);
        
        System.out.println("Ingresa tu calificacion");
        cali=captu.nextInt();
        captu.nextLine();
        
       if (cali >=90){
           System.out.println("A");
       }else if (cali >=80){
           System.out.println("B");
       }else if (cali >= 70){
           System.out.println("C");
       }else if (cali >= 60){
           System.out.println("D");
       }else if (cali <= 59){
           System.out.println("F");
       }else{
           System.out.println("Error");
       }
    }
    
}
