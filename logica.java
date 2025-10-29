public class logica {
    public static void main(String[] args) {
        boolean acepto_condiciones = false;
        if (!acepto_condiciones) {
            System.out.println("Si no acepta las condiciones no puede seguir");
        } else{
            System.out.println("Condiciones aceptadas");
        }
        //Ejecuto un programa cuando el usuario no esta conectado

        boolean conectado = false;
        if (!conectado) {
            System.out.println("Ejecutando el programa");
        } else{System.out.println("No se inicia");}

        //Entra al perfil si tiene permiso o esta logueado
        
        boolean permiso = true; 
        boolean logueado = false;
        if (!logueado || !permiso) {
            System.out.println("No puede acceder");
        }else{System.out.println("Puede acceder");}

        // El registro de un usuario a una app 
        //Tiene que ser mayor a 18 y aceptar los terminos
        int edad = 18;
        boolean  terminos = false;
        if (edad <18) {
            System.out.println("Debe ser mayor de edad para ingresar");
        }
        else if (!terminos) {
            System.out.println("Debe aceptar los terminos");
        }
        else{System.out.println("Bievenido al sitio");}

        //app de compras
        //Solo se pueden comprar prendas en stock
        //Si es miembro de la comunidad tiene descuento

        boolean miembro = true;
        int stock =10;

        if ( stock>0) {
            System.out.println("Puede comprar");
        
            if (miembro) {
                System.out.println("Se aplica descuento");
            } 
            else{System.out.println("Sin descueno");}
        }
        else  
        {System.out.println("No puede comprar");}

    }
}
