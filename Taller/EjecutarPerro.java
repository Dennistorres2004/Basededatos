public class EjecutarPerro {
    public static void main(String[] args){

        // Creación de los objetos
        Perro objEst1 = new Perro(5, "Lucho", "Pibull", "53 cm");
        Perro objEst2 = new Perro(3, "Linda", "Poodle", "28 cm");
        Perro objEst3 = new Perro(4, "Doki", "Beagle", "41 cm");
        Perro objEst4 = new Perro(7, "Cheila", "Dalmata", "61 cm");
        Perro objEst5 = new Perro(2, "Ramon", "Pastor aleman", "65 cm");

        // Imprimir objetos
        System.out.println(objEst1);
        System.out.println(objEst2);
        System.out.println(objEst3);
        System.out.println(objEst4);
        System.out.println(objEst5);

        System.out.println("-----------------------------");

        // Crear arreglo de objetos
        Perro[] est = new Perro[5];
        est[0] = objEst1;
        est[1] = objEst2;
        est[2] = objEst3;
        est[3] = objEst4;
        est[4] = objEst5;
    }
}
