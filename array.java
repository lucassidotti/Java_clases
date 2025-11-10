public class array {
    public static void main(String[] args) {
        String[] nombres={"Lucas","Pepe","Poppy","Ramon"};
        System.out.println("Hay "+nombres.length+" elementos en el array");
        int [] edades={10,30,40,50};
        System.out.println("Edades en el array: "+edades.length);
        System.out.println(edades[0]);
        System.out.println(nombres[2]);

        for(int i=0; i<nombres.length;i++){
            System.out.println("Alumno: "+(i+1)+":"+nombres[i]);
        }

        for(int i=0;i<edades.length;i++){
            System.out.println(edades[i]);
        }

        //Buscar un valor especifico dentro del array con for

        int [] numeros={3,7,9,11,15,21};
        int buscando=1;
        boolean encontrado = true;
        for(int i=0;i<numeros.length;i++){

            if (buscando==numeros[i]) {
                encontrado=true;
                System.out.println("Se encontro su numero: "+numeros[i]);
                break;
            }
        }
            if (encontrado) {
                System.out.println("Numero no encontrado");
            }

        String[]prendas={"remera","buzo","pantalon","boxer","slip"};
        for(String prenda:prendas){
            System.out.println("Las prendas son: "+prenda);
        }























    }
}
