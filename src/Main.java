import java.util.Scanner;

public class Main {
    public static boolean
    secuencia(String secuencia){
        boolean valido = true;
        if (secuencia.length() != 9){
            valido = false;
            System.out.println("Tenias que ingresar una cadena de 9 caracteres :((");
        }
        return valido;
}
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la cadena de caracteres ");
        String cadena = teclado.nextLine();
        if(secuencia(cadena)==true){
            System.out.println("La cadena es " + cadena);
            System.out.println("---------------------");
            System.out.println("|"+ cadena.substring(0,3)+"|");
            System.out.println("|"+ cadena.substring(3,6)+"|");
            System.out.println("|"+ cadena.substring(6,9)+"|");
        }
    }

}
