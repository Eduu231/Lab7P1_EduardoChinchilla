
package s7.lab7p1_eduardochinchilla;

import java.util.Scanner;
import java.util.Random;
public class Lab7P1_EduardoChinchilla {
    static Scanner read = new Scanner(System.in);
    static Random rand = new Random();
    
    public static void main(String[] args) {
        int opcion = 0;
        
        while (opcion != 3){
            opcion = menu();
            
            switch (opcion){
                case 1:{
                    break;
                }
                case 2:{
                    break;
                }
                case 3:{
                    System.out.println("Ha salido");
                    break;
                }
            }
        }
    }
    public static int menu(){
        int op = 0;
        
        System.out.println("meniu");
        System.out.println("");
    }
}
