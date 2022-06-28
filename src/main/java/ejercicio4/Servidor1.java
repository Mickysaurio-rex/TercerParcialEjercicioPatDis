package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Servidor1 implements IServidor{
    private String name;
    private List<Usuario>listUsuario = new ArrayList<>();

    public Servidor1(String name) {
        this.name = name;
    }


    @Override
    public void registrar(Usuario usuario) {
        listUsuario.add(usuario);
    }

    @Override
    public void atender() {
        System.out.println("El servidor 1 esta atendiendo");
        for(int i = 0; i<listUsuario.size(); i++){
            listUsuario.get(i).showInfo();
        }
    }
}
