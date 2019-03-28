import java.util.Scanner;

public class RecipientesSobrante {
    public static void main (String[] args) {
        int capacidad, cantidad, recipientes, sobrante;
    
        Scanner teclado = new Scanner(System.in);

        System.out.print("Capacidad recipiente? ");
        capacidad = teclado.nextInt();
        System.out.print("Cantidad del producto? ");
        cantidad = teclado.nextInt();

        recipientes = cantidad / capacidad;
        sobrante =    cantidad % capacidad;
        
        System.out.println("Se necesita " + recipientes +
                           " recipientes y sobra " + sobrante);

    }
}
