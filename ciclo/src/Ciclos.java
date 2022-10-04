import java.util.Arrays;
import java.util.Scanner;

public class Ciclos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿cuantos numeros quieres prosesar?\n");
        int cantidad = entrada.nextInt();

        System.out.printf("igresa %d datos\n ", cantidad );
         for(int i = 1 ; i<= cantidad; i++) {
             System.out.printf("datos %d :", i);
             int num = entrada.nextInt();
             int resultado = num * 2;
             System.out.printf("Datos %d procesado: %d\n ", i, resultado );
         }
    }
}
