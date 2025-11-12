import java.util.Scanner;

public class alumnos {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Cuantos alumnos estan en el curso? ");
            int cantidad=sc.nextInt();
            int[]notas=new int[cantidad];

        for(int i=0;i<notas.length;i++){
            System.out.println("Nota del alumno "+(i+1)+":");
            notas[i]=sc.nextInt();
        }
            int sumar=0;
            for(int i=0;i<notas.length;i++){
                sumar+=notas[i];
            }

            double promedios=(double)sumar/notas.length;
            System.out.println("El promedio es: "+promedios);

            //Cuantos aprobados
            int aprobados=0;
            for(int i=0;i<notas.length;i++){
                if (notas[i]>=7) {
                    aprobados++;
                }
            }
            System.out.println("La cantidad de aprobados es: "+aprobados);

            //nota mas alta y mas baja

            int menor=notas[0];
            int mayor=notas[0];
            for(int i=0;i<notas.length;i++){
                if (notas[i]<menor) {
                    menor=notas[i];
                }
                if(notas[i]>mayor){
                    mayor=notas[i];
                }
            }
            System.out.println("Nota mas baja: "+menor);
            System.out.println("Nota mas alta: "+mayor);
            sc.close();



















    }
}
