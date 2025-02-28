/*
* Analisis
* Descripcion del programa:
* Entradas:
* Salidas: 
* Ejemplo:
*/
import java.util.Scanner;

public class Recuperatorio {
    private Scanner escaner;

    // Declaracion de constantes 
    

	private Recuperatorio() {
		escaner = new Scanner(System.in);
	}
	

    public void run()
    {
        Scanner scanner = new Scanner(System.in);
        
        // Captura de los tres números
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();
        
        // Llamado al método y muestra del resultado
        int resultado = contarIguales(num1, num2, num3);
        System.out.println("Cantidad de números iguales: " + resultado);
        
        
    
    

    //ACTIVIDAD #2
     System.out.print("Ingrese 1 para saludo o 0 para despedida: ");
        while (!scanner.hasNextInt()) { // Validar que sea un número
            System.out.println("Entrada inválida. Ingrese 1 o 0.");
            scanner.next(); // Descarta la entrada incorrecta
        }
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer después de nextInt()
        
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        
        // Llamado al método y muestra del resultado
        String mensaje = generarMensaje(nombre, opcion);
        System.out.println(mensaje);
        
        
        
        // Llamado al método y muestra del resultado
        

        //ACTIVIDAD #3

            System.out.print("Ingrese la primera palabra: ");
        String palabra1 = scanner.nextLine();
        System.out.print("Ingrese la segunda palabra: ");
        String palabra2 = scanner.nextLine();
        System.out.print("Ingrese la tercera palabra: ");
        String palabra3 = scanner.nextLine();
        
        // Llamado al método y muestra del resultado
        int cantidadLargas = contarPalabrasLargas(palabra1, palabra2, palabra3);
        System.out.println("Cantidad de palabras con 4 o más caracteres: " + cantidadLargas);

        //ACTIVIDAD #4

             System.out.print("Ingrese la primera cadena: ");
        String cadena1 = scanner.nextLine();
        System.out.print("Ingrese la segunda cadena: ");
        String cadena2 = scanner.nextLine();
        
        // Llamado al método y muestra del resultado
        String resultadoComparacion = compararPosicionDos(cadena1, cadena2);
        System.out.println(resultadoComparacion);
        

        //ACTIVIDAD 5

        System.out.print("Ingrese el coeficiente a: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el coeficiente b: ");
        double b = scanner.nextDouble();
        System.out.print("Ingrese el coeficiente c: ");
        double c = scanner.nextDouble();
        
        calcularRaices(a, b, c);
      
    
    }

public static void main(String[] args)  {
    
		Recuperatorio mainApp = new Recuperatorio();
		mainApp.run();
	}

       
    // Método para contar cuántos números son iguales
    public static int contarIguales(int a, int b, int c) {
        if (a == b && b == c) {
            return 3;
        } else if (a == b || a == c || b == c) {
            return 2;
        } else {
            return 0;
        }
    
    }
    public static String generarMensaje(String nombre, int opcion) {
        if (opcion == 1) {
            return "Hola " + nombre;
        } else if (opcion == 0) {
            return "Chao " + nombre;
        } else {
            return "Error entradas inválidas";
        }
    }
      public static int contarPalabrasLargas(String str1, String str2, String str3) {
        int count = 0;
        if (str1.length() >= 4) count++;
        if (str2.length() >= 4) count++;
        if (str3.length() >= 4) count++;
        return count;
    }

     // Método para comparar la posición 2 de dos cadenas
    public static String compararPosicionDos(String str1, String str2) {
        if (str1.length() < 3 || str2.length() < 3) {
            return "Error: Ambas cadenas deben tener al menos 3 caracteres";
        }
        return str1.charAt(2) == str2.charAt(2) ? "true" : "false";
    }
    public static void calcularRaices(double a, double b, double c) {
        double resultado = Math.pow(b, 2) - 4 * a * c;
        if (resultado > 0) {
            double raiz1 = (-b + Math.sqrt(resultado)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(resultado)) / (2 * a);
            System.out.println("Las raíces son: " + raiz1 + " y " + raiz2);
        } else if (resultado == 0) {
            double raiz = -b / (2 * a);
            System.out.println("La ecuación tiene una única raíz: " + raiz);
        } else {
            System.out.println("La ecuación no tiene raíces reales");
        }
    }
}





	

