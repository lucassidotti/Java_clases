import java.util.Scanner;
public class ejer3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] edades=new int[4];
        int parcial = 0;
        for (int i = 0; i < edades.length; i++) {
            System.out.println("Ingrese una edad:");
            edades[i] = sc.nextInt();
            parcial += edades[i];
        }
        int promedio = parcial / edades.length;
        if(promedio < 25){
            System.out.println("Grupo joven");
        }else{
            System.out.println("Grupo adulto");
        }
        sc.close();














    }
}
