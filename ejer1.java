import java.util.Scanner;
public class ejer1 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int []numeros=new int[10];
    int pares=0;
    int impares=0;
    for(int i=0;i<numeros.length;i++){
        System.out.println("Ingrese un numero");
        numeros[i]=sc.nextInt();
        if(numeros[i]%2==0){
            pares++;
        }
        else{
            impares++;
        }
    }
    System.out.println("La cantidad de numeros pares es: "+pares);
    System.out.println("La cantidad de numeros impares es: "+impares);
    sc.close();
}
    
}
