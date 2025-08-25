public class ArreglosPerros {

    // Método que devuelve un arreglo de objetos tipo Perro
    public Perro[] crearArregloPerros() {
        Perro[] arreglo = new Perro[5];

        arreglo[0] = new Perro(5, "Lucho", "Pibull", "53 cm");
        arreglo[1] = new Perro(3, "Linda", "Poodle", "28 cm");
        arreglo[2] = new Perro(4, "Doki", "Beagle", "41 cm");
        arreglo[3] = new Perro(7, "Cheila", "Dalmata", "61 cm");
        arreglo[4] = new Perro(2, "Ramon", "Pastor Alemán", "65 cm");

        return arreglo;
    }
}

