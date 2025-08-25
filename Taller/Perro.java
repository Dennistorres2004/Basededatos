public class Perro {
    int edad;
    String nombre;
    String raza;
    String altura;

    // Constructor de la clase
    public Perro(int edad, String nombre, String raza, String altura){
        this.edad = edad;
        this.nombre = nombre;
        this.raza = raza;
        this.altura = altura;
    }

    // Método para imprimir características extra
    public void Caracteristicas(int edadNum, String[] edadesTexto){
        String cad = "";
        for(int i = 0; i < edadesTexto.length; i++){
            cad += edadesTexto[i] + " ";
        }
        System.out.println("edad: " + edadNum + " edad del perro: " + cad );
    }

    // Método para mostrar los datos del perro como texto
    public String toString(){
        return "Perro { edad: " + edad + " Nombre: " + nombre + " raza: " + raza + " altura: " + altura + " }";
    }
}
