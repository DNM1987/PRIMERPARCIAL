import java.util.Scanner;

public class MejorarCo {
    private Scanner entrada= new Scanner(System.in);
    private boolean juegoActivo = true;
    public void jugar() {
        String NombreJugador = ObtenerNombreJugador();

        while (juegoActivo) {
            int  intentos = 0;
            int min=0;
            int max=100;
            int numeroJuego= ObtenerNumeroAleatorio (0 , 100);
            System.out.printf("%s, he escogido un numero entre %d y %d, adivinalo\n ",NombreJugador,min,max );
            int numeroJugador;

            do {
                numeroJugador = EscogerNumero();
                mensaje(numeroJuego,numeroJugador);
                intentos++;
            } while (numeroJuego != numeroJugador);
            System.out.printf("has ganado, intentaste %d veces\n",intentos);

            juegoActivo= jugarNuevamente();
        }
    }
    private int ObtenerNumeroAleatorio(int min, int max) {
        return min + (int) (Math.random() * ((max - min))) +1;
    }
    private String ObtenerNombreJugador () {

        System.out.println("Hola,¿cual es tu nobre? ");
        String NombreJugador = entrada.nextLine();
        System.out.printf("Bienvenido %s, vamos a comenzar\n",NombreJugador);
        return NombreJugador;
    }
    private int EscogerNumero() {
        System.out.println("Escoje un Numero ");
        return entrada.nextInt();
    }

    private void mensaje (int numeroJuego, int numeroJugador) {
        if (numeroJuego < numeroJugador){
            System.out.println("MUY ALTO, adivina otra vez ");
        } else if (numeroJuego > numeroJugador) {
            System.out.println("MUY BAJO, adivina otra vez ");
        }
    }
    public boolean jugarNuevamente() {
        System.out.println("¿jugamos nuevamente?\n 1. si \n 2. no");
        int respuesta = entrada.nextInt();
        if (respuesta == 1) {
            System.out.println("genial, empesemos de nuevo ");
            return true;
        } else {
            System.out.println(" GAME OVER , Gracias por participar");
            return false;
        }

    }
}

