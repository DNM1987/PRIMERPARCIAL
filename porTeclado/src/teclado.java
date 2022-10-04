import java.util.Scanner;

public class teclado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out. println("digite nombre");
        String Nombre = entrada.nextLine();
        System.out. println("digite EDAD");
        int edad = entrada.nextInt();
        System.out. println("digite numero de celular");
        int celular = entrada.nextInt();
        System.out.println("tu nombre es: " + Nombre);
        System.out.println("tu edad es: " + edad);
        System.out.println("tu numero de celular es: " + celular);
        System.out.println("gracias por inscribirte " + Nombre);
    }

}





