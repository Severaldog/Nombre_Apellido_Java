import java.util.Scanner;

public class NombreApellido{
  public static void main(String args[]){
   
   Scanner in = new Scanner(System.in);
   String nombre = "";
   String apellido = "";

   System.out.println("Ingresa un nombre");
   nombre = in.nextLine();
   
   System.out.println("Ingrese un Apellido");
   apellido = in.nextLine();

   System.out.println("Hola mi nombre es: " + nombre);
   System.out.println("Mi apellido es: " + apellido);
 }
}