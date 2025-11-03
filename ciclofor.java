public class ciclofor {
    public static void main(String[] args) {
        int suma = 1;
        for(int i=0;i <10;i++ ){
            System.out.println(suma+"X"+i+"="+(suma*i));
        }

        int ahorroSemanal=500;
        int total=0;
        for(int semana=1; semana<=12;semana++){
            total +=ahorroSemanal;
            System.out.println("Semana "+semana+" ahorrado: $"+total);
        }
        System.out.println("Usted ahorro en 12 semanas: $"+total);

        //simulador de ascensor 

        System.out.println("El ascensor sube: ");
        for(int piso=1;piso<=5;piso++){
            System.out.println("Usted está en el piso: "+piso);
        }
        System.out.println("El ascensor baja: ");
        for(int piso=5;piso>=0;piso--){
            System.out.println("Usted está en el piso: "+piso);
        }

        for(int intento=1;intento<=3;intento++){
            System.out.println("Intento: "+intento);
            if(intento <3){
                System.out.println("Clave incorrecta, quedan: "+intento);
            }else{System.out.println("Clave correcta");}
        }



    }
}
