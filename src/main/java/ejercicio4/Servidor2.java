package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Servidor2 implements IServidor{
    private String name;
    private List<Usuario>listUsuarios = new ArrayList<>();

    public Servidor2(String name) {
        this.name = name;
    }


    @Override
    public void registrar(Usuario usuario) {
        listUsuarios.add(usuario);
    }

    @Override
    public void atender() {
        System.out.println("El servidor 2 esta atendiendo");
        for(int i = 0; i<listUsuarios.size(); i++){
            listUsuarios.get(i).showInfo();
        }
    }
}
