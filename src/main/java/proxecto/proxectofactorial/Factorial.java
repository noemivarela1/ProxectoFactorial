package proxecto.proxectofactorial;
/**
 * Calcula o factorial de n
 */
import java.util.Scanner;
public class Factorial {
    public static int factorial(int num){
        int factorial=1;
        
        //n!=1*2*3*...*n
        for (int i=1;i<=num;i++){
            factorial*=i;
        }
        return factorial;
    }
    public static long factorial(long num){
        long factorial=1;
        
        //n!=1*2*3*...*n
        for (int i=1;i<=num;i++){
            factorial*=i;
        }
        return factorial;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Introduce o número para calcular o factorial");
        int n=in.nextInt();
        System.out.println("O factorial de "+n+" é "+factorial(n));
        System.out.println("Introduce un número para calcular o factorial");
        long nl=in.nextLong();
        System.out.println("O factorial de "+n+" é "+factorial(nl));
    }
}
