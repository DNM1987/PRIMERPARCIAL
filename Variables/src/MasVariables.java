public class MasVariables {
    public static void main(String[] args) {
     int pizzas = 6;
     int personas= 3;
     int pizzasPorPersona= pizzas/personas;

     System.out.printf ("si hay %d pizzas y  %d personas, a cada una le tocan %d pizzas\n",
             pizzas,personas,pizzasPorPersona);


     String auto = "Ferrari";
     double velocidad = 80;
     System.out.printf( "el auto %s se desplaza a %f km/h \n", auto,velocidad);

     int precioLeche = 25;
     double precioQueso = 60.2;
     int precioPan = 150;

     double precioTotal = precioLeche + precioQueso +  precioPan;
     System.out.printf("el precio total es:  %f\n",precioTotal);

    }
}
