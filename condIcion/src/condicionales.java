import java.util.Scanner;

public class condicionales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("calculadoras de propinas");
        System.out.println("ingrese la cantidad a pagar");
        double cantidad = entrada.nextDouble();
        System.out.println("ingrese el % de propina");
        int porcentaje = entrada.nextInt();

        if (porcentaje < 15) {
            System.out.println("el servicio nos es bueno ");
        } else if (15 <= porcentaje && porcentaje < 30) {
            System.out.println("el servicio es bueno ");
        } else {
            System.out.println("el servicio fue exelente ");
    }
        double total = cantidad * porcentaje / 100;
        System.out.printf("el porcentaje es: %.1f ", total);
    }
}
