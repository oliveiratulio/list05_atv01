
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero=sc.nextInt();
        sc.close();
        imprimieLinha(numero);
    }

    public static void imprimieLinha(int numero){
        int a, b;

        for(a=1;a<=numero;a++){
            for(b=1;b<=a;b++){
                System.out.print(a+"   ");
            }
            System.out.println();
        } 
    }
}