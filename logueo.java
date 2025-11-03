import java.util.Scanner;
public class logueo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String clave="clave1234";
        int intentos=3;
        for(int i=1;i<=3;i++){
            String claveIngresada=input.nextLine();
            intentos--;
            if (!claveIngresada.equals(clave)) {
                System.out.println("Intento fallido, quedan: "+intentos+"Intentos");
            if (intentos==0) {
                System.out.println("Usuario bloqueado");
                }

            }else{System.out.println("Bienvenido");}

    }
    input.close();
    }
}