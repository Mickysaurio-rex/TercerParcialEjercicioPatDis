package ejercicio3;

public class Client {
    public static void main(String[] args) {
        Composite folder = new Composite("folder");

        folder.add(new Archivo("archivo 1", 1));
        folder.add(new Archivo("archivo 2", 2));
        folder.add(new Archivo("archivo 3", 3));

        folder.getNroPalabras();

        Composite folder2 = new Composite("folder2");
        folder2.add(new Archivo("archivo 4", 4));
        folder2.add(new Archivo("archivo 5", 5));
        folder2.add(new Archivo("archivo 6", 6));
        folder2.add(new Archivo("archivp 7", 3));
        folder2.getNroPalabras();

        Composite unidadDeDisco = new Composite("******************Disco*****************");
        unidadDeDisco.add(folder);
        unidadDeDisco.add(folder2);
        unidadDeDisco.getNroPalabras();
    }
}
