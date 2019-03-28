import java.util.Scanner;

public class ValorAbsoluto {
    /* Este programa calcula el valor absoluto
       asi son los comentarios multilinea */
    public static void main (String[] args) {
        int nro;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        nro = teclado.nextInt();
//    System.out.print("Ingrese otro numero entero: ");
//    nro2 = teclado.nextInt();

    
        System.out.print("El valor absoluto es ");
        if (nro < 0) {
            nro = -nro;
        }
        else {
            nro = nro;
        }
        System.out.println(nro);

    }
}
