import java.util.HashMap; // Se importa el paquete HashMap
import java.util.Scanner; // Se importa el paquete Scanner

public class Codigo7 {
	
	public static void main (String[] args) { // Se agrega main

    Scanner sc = new Scanner(System.in); // Se agrega System.in para la lectura de datos

    HashMap<String, String> capitales = new HashMap<>(); // Se modifican los tipos de valores del Map

    capitales.put("Canadá", "Ottawa"); // Se corrigió Otawwa
    capitales.put("Estados Unidos", "Washington DC");
    capitales.put("México", "México DF");
    capitales.put("Belice", "Belmopán");
    capitales.put("Costa Rica", "San José"); // Se corrigió rica a Rica
    capitales.put("El Salvador", "San Salvador");
    capitales.put("Guatemala", "Ciudad de Guatemala");
    capitales.put("Honduras", "Tegucigalpa");
    capitales.put("Nicaragua", "Managua");
    capitales.put("Panamá", "Panamá");
   
    String pais = ""; // Se corrige Sting a String
    
    do {
      System.out.print("Escribe el nombre de un país y te diré su capital: ");
      pais = sc.nextLine(); // Se corrige Double a Line para lectura de String
      
      if (!pais.equals("Salir")) { // Se modifica equal a equals
    	
        if (capitales.containsKey(pais)) { // Se modifica lectura a Key en vez de Value
          System.out.print("La capital de " + pais); // Se agrega .out
          System.out.println(" es " + capitales.get(pais));
          
        } else {
        	
          System.out.print("No conozco la respuesta ");
          System.out.print("¿cuál es la capital de " + pais + "?: ");
          
          String capital = sc.nextLine();
          capitales.put(pais, capital);
          System.out.println("Gracias por enseñarme nuevas capitales");
        }
      }
    } while (!pais.equals("Salir")); // Se corrige wile a while
    sc.close(); // Se cierra Scanner
  }

}