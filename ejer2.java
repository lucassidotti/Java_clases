import java.util.Scanner;
public class ejer2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []numero=new int[6];
        System.out.println("Ingrese un numero");
        numero[0]=sc.nextInt();
        int mayor=numero[0];
        int menor=numero[0];
        for(int i=1;i<numero.length;i++){
            System.out.println("Ingrese otro numero");
            numero[i]=sc.nextInt();
            if (numero[i]<menor) {
                menor=numero[i];
            }
            if (numero[i]>mayor) {
                mayor=numero[i];
            }
        }
        System.out.println("El numero mayor ingresado es: "+mayor+" Y el menor es: "+menor);
        sc.close();

    }
}
