package proxecto.proxectofactorial;
/**
 * Calcula o factorial de n
 */
import java.math.BigInteger;
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
    public static BigInteger factorialB(long num){
        BigInteger factorial=new BigInteger("1");
        
        //n!=1*2*3*...*n
        for (int i=1;i<=num;i++){
            factorial.multiply(BigInteger.valueOf(i));
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
        System.out.println("O factorial de "+n+" é "+factorialB(nl));
        System.out.println("Fin da proba");
        System.out.println("Mensaxe de proba");
        System.out.println("Cambio feito no repositorio remoto");
    }
}
