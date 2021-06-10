import java.util.Scanner;

//202030799 Manuel Rojas
//Hallar la persona de mayor y menor edad, sabiendo que se
//leen datos correspondientes a 20 muestras.
public class Ejercicio4Parte2 {
    public static void main(String[] args) {
        String menorP = "", mayorP = "";
        int menorE = 1, mayorE = 1;
        final int MUESTRA = 4;
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i < MUESTRA; i++ ){
            System.out.print("Ingrese el nombre de la persona: ");
            String nombre = scanner.next();
            System.out.print("\nIngrese la edad de la persona: ");
            int edad = scanner.nextInt();
            System.out.println("\n");

            if(edad <= menorE){
                menorP = nombre;
                menorE = edad;  
            }else{
                mayorP = nombre;
                mayorE = edad;
            }
        }
        System.out.println("\nLa persona mayor es: " + mayorP + "("+mayorE+" años)"
                        + ". La persona menor es: "+ menorP + "("+menorE+" años).");
    }  
}