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
            System.out.print("Ingrese la edad de la persona: ");
            int edad = scanner.nextInt();

            if((edad == mayorE) && (edad == menorE)){
                mayorE = menorE = edad;
                mayorP = menorP = nombre;
            }
                
            if(edad >= mayorE){
                mayorP = nombre;
                mayorE = edad;
            }else{
                menorP = nombre;
                menorE = edad;  
            }
        }
        System.out.println("\nLa persona mayor es: " + mayorP + " ("+mayorE+" años)"
                        + ". La persona menor es: "+ menorP + " ("+menorE+" años).");
    }  
}