import java.util.Scanner;

public class AdivinaElNumero {
    private Scanner entrada = new Scanner(System.in);
    private boolean juegoActivo = true;

    public void jugar() {
        System.out.println("Hola,¿cual es tu nobre? ");
        String NombreJugador = entrada.nextLine();
        System.out.printf("Bienvenido %s, vamos a comenzar\n",NombreJugador);

        while (juegoActivo) {
           int  intentos = 0;
            int min=0;
            int max=100;
            int numeroJuego= (int) (Math.random() * ((max - min))) +1;

            System.out.printf("%s, he escogido un numero entre %d y %d, adivinalo\n ",NombreJugador,min,max );
            int numeroJugador;

            do {
            System.out.println("Escoje un Numero ");
            numeroJugador = entrada.nextInt();
            if (numeroJuego < numeroJugador){
                System.out.println("MUY ALTO, adivina otra vez ");
            } else if (numeroJuego > numeroJugador) {
                System.out.println("MUY BAJO, adivina otra vez ");
            }
                intentos++;
            } while (numeroJuego != numeroJugador);
            System.out.printf("has ganado, intentaste %d veces",intentos);

            juegoActivo= false;
        }
    }
}