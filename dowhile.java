import java.util.Scanner;
public class dowhile {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n 1. Opcion A \n 2. Opcion B \n 3. Opcion C \n 4. Salir \n");
            System.out.println("Ingrese una opcion");
            opcion=sc.nextInt();
            System.out.println("Usted eligio la opcion: "+opcion+" Su menu fue cargado");
            System.out.println("4. Salir");
            opcion=sc.nextInt();
        } while (opcion!=4);
            System.out.println("Saliendo...");
        















    }
}
