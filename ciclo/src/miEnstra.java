import java.util.Scanner;

public class miEnstra {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿cuantos numeros quieres prosesar?\n");
        int cantidad = entrada.nextInt();

        System.out.printf("igresa %d datos\n ", cantidad );
        int c = 1;
         while (c<=cantidad)  {
            System.out.printf("datos %d :", c);
            int num = entrada.nextInt();
            int resultado = num * 2;
            System.out.printf("Datos %d procesado: %d\n ", c, resultado );
            c++;
        }
    }
}

