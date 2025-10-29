public class operadores {
    public static void main(String[] args) {
        int edad = 28;
        boolean estudiante = true;

        boolean estudiante_acceso = (edad>=18 && estudiante); 
        System.out.println("Acceso autorizado: "+estudiante_acceso);
        boolean lluvia = true;
        boolean salir =!lluvia;

        System.out.println("Puede salir? "+salir);

        double precio = 120;
        boolean cupon = true;

        boolean descuento = (precio > 120 || cupon);
        System.out.println("Se aplica el descuento? "+descuento);

        //socio con descuento
        boolean socio = false;
        int edad_s = 70;

        if (edad_s >60 || socio) {
            System.out.println("Usted tiene el descuento");
        } else {System.out.println("No tiene descuento");}
        
        boolean acepto_condiciones = false;
        if (!acepto_condiciones) {
            System.out.println("No puede entrar al sitio");
        } else{System.out.println("Bienvenido al sitio");}




    }
    
}