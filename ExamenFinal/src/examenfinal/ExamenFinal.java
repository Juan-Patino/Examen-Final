package examenfinal;
import java.util.Scanner;
public class ExamenFinal {
static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
    
        Punto1();
        Punto2();
        Punto345();
        Punto67();
    

    }
    
    public static void Punto1() {
       
        System.out.println("\n----------- Punto 1 -----------");
        String [] nombres = new String [6]; 
            
        System.out.println("-- Digite el nombre numero 1 --");
        nombres[0] = leer.nextLine();
        
        System.out.println("-- Digite el nombre numero 2 --");
        nombres[1] = leer.nextLine(); 
        
        System.out.println("-- Digite el nombre numero 3 --");
        nombres[2] = leer.nextLine();
        
        System.out.println("-- Digite el nombre numero 4 --");
        nombres[3] = leer.nextLine();
        
        System.out.println("-- Digite el nombre numero 5 --");
        nombres[4] = leer.nextLine();
        
        System.out.println("-- Digite el nombre numero 6 --");
        nombres[5] = leer.nextLine();
        
        for (int i = 0; i < 6; i++) {
            
            System.out.println("\n Nombre " + i + ":   " + nombres[i]);
            
        }
    }
    
    public static void Punto2(){
        
        int[][] edadesFamiliares = {
            {30, 25, 45},
            {60, 28, 22},
            {35, 40, 50}
        };
        
        System.out.println("\n----------- Punto 2 -----------");
        System.out.println("\n Edades de familiares:");
        for (int i = 0; i < edadesFamiliares.length; i++) {
            for (int j = 0; j < edadesFamiliares[i].length; j++) {
                System.out.print(edadesFamiliares[i][j] + "\t");
            }
                System.out.println();
        }
    }
    
    public static void Punto345(){
        String[][] jugadores = {
            {"Jugador 1", "Juan", "15 años", "delantero"},
            {"Jugador 2", "Pedro", "16 años", "defensa"},
            {"Jugador 3", "Luis", "17 años", "arquero"}
        };
        System.out.println("\n----------- Punto 3 -----------");
        System.out.println("---Información de los jugadores---");
        for (int i = 0; i < jugadores.length; i++) {
            System.out.println("Jugador: " + jugadores[i][0]);
            System.out.println("Nombre: " + jugadores[i][1]);
            System.out.println("Edad: " + jugadores[i][2]);
            System.out.println("Posición: " + jugadores[i][3]);
            System.out.println("---------------------------------");                
        }
            System.out.println("\n----------- Punto 4 -----------"); 
            System.out.println("En la posicion 3 esta : " + jugadores[2][3]);
            System.out.println("---------------------------------");
            
            System.out.println("\n----------- Punto 5 -----------");
            System.out.println("En la posicion 2 esta : " + jugadores[1][2]);
            System.out.println("---------------------------------");
    } 
    
    public static void Punto67(){
        
        int [] numeros = new int[7];
        int contador = 0;
        int numero = 1;
        System.out.println("\n----------- Punto 6 -----------");
        do {
            
            System.out.println("----- Digite el numero " + numero + " ------" );
            numeros[contador] = leer.nextInt();
            numero++;
            contador++;
            
        } while (numero <= 7);
        
        System.out.println("\n----------- Punto 7 -----------");
        for (int i = 0; i < numeros.length; i++) {
            
            System.out.println("El numero en la posicion " + i + " es " + numeros[i]);
            System.out.println("---------------------------------");
            
        }  
    }
}