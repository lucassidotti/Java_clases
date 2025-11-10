import java.util.Scanner;
public class practicawhile {

    public static void main(String[] args) {
        int i=1;
        while(i<=5){
            System.out.println("Numero i. "+i);
            i++;
        }

        Scanner sc=new Scanner(System.in);
        String pass="";
        while (!pass.equals("1234")) {
            System.out.println("Contraseña incorrecta. Vuelva a intentar");
            pass=sc.nextLine();
        }
        System.out.println("Bienvenido al sitio");
        sc.close();

        //Suma una unidad hasta que el usuario ponga 0

        Scanner scanner=new Scanner(System.in);
        int numero,suma=0;
            System.out.println("Ingrese un numero");
            numero=scanner.nextInt();
            while (numero!=1) {
                suma+=numero;
                System.out.println("Ingrese otro numero");
                numero=scanner.nextInt();
            }
        System.out.println("Usted tiro: "+suma+"veces antes de sacar 1");
        scanner.close();


























    }
}
