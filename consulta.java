import java.util.Scanner;


public class consulta {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int n1 = sc.nextInt();
        System.out.println("Ingrese otro numero");
        int n2 = sc.nextInt();
        int suma = n1+n2;
        System.out.println("La suma da como resultado: "+suma);
        sc.close();







    }
}