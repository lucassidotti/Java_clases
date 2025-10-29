public class practicaif {
    public static void main(String[] args) {
        int nota=97;
        //si el alumno esta aprobado o no.
        if (nota>=70) {
            System.out.println("El alumno esta aprobado.");
            }else{
                System.out.println("El alumno esta desaprobado.");
            }
        //Numero es positivo negativo o 0.

        int number= 0;

        if (number>0) {
            System.out.println("Numero positivo");
        }
        else if(number<0){
            System.out.println("Numero negativo.");
        }
        else{System.out.println(" El numero es 0");}

        int age=15;
        boolean dni=false;

        if (age>=18 && dni) {
            System.out.println("Puedo votar.");
        }else{ System.out.println("No puede votar");

        //Usuario tiene descuento si es mayor a 60 o es socio.

        int edad= 60;
        boolean socio= true;

        if( edad>60 || socio){
            System.out.println("Usted tiene el descuento");
        } else { System.out.println("NO TIENE EL DESCUENTO.");}

    // Ejemplo de no igual != el ejemplo acepto condiciones de logueo.

    boolean acepto_condiciones=false;
        if (!acepto_condiciones) {
            System.out.println("Bienvenido.");
        }










    }
}}