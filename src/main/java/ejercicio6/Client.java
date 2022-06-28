package ejercicio6;

public class Client {
    public static void main (String[]args){
        Celular celular = new Celular(100,16, "S10", "Samsung");
        Tv televisor = new Tv(200, "LG", 65);
        Computadora computadora = new Computadora(100, 32, "lenovo");
        Aplicacion aplicacion = new Aplicacion();

        celular.acept(aplicacion);
        televisor.acept(aplicacion);
        computadora.acept(aplicacion);


    }
}
