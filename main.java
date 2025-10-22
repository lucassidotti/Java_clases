/* 
//Variables
//int (declara valores enteros) int edad=31
//double (valores decimales) double pi=3.14
//boolean (valores booleanos) boolean estudiante=true
//String (valores tipo texto) String="Lucas"
*/

public class main {

    public static void main(String[] args) {
        //El bloque de codigo que se ejecuta despues de la entrada al programa
        System.out.println("Hola mundo");
        String nombre = "Lucas";
        int edad = 31;
        boolean estudiante = true;
        double estatura= 1.78;
        System.out.println("Mi nombre es: "+nombre+","+" Mi edad es: "+edad+","+" Soy estudiante? "+estudiante+","+" y mido: "+estatura);
        //Promedio de 3 notas
        double nota1=9.8;
        double nota2=8.5;
        double nota3=4.6;
        double promedio=(nota1+nota2+nota3)/3;
        System.out.println("Mi promedio es: "+promedio);
        
        
}
}