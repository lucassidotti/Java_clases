import java.util.Scanner;
public class ejer4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] nombres={"Lucas","Gianna","Maria"};
        String nombre="";
        boolean encontrado=false;
        System.out.println("Ingrese un nombre");
        nombre=sc.nextLine();
        for(int i=0;i<nombres.length;i++){
            if (nombre.equals(nombres[i])) {
                encontrado=true;
                break;
            }
        }
        if (encontrado) {
                System.out.println("Se encontro su nombre: "+nombre);
        }else{
                System.out.println("El nombre ingresado no se encuentra");
        }
        sc.close();
    }
}
