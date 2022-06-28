package ejercicio4;

public class Proxy implements IServidor{
    private IServidor servidor1;
    private IServidor servidor2;


    public Proxy() {
        servidor1 = new Servidor1("Servidor1");
        servidor2 = new Servidor2("Servidor2");
    }

    @Override
    public void registrar(Usuario usuario) {
        if(usuario.getNumero() % 2 == 0){
            servidor1.registrar(usuario);
        } else {
            servidor2.registrar(usuario);
        }
    }

    @Override
    public void atender() {
        servidor1.atender();
        servidor2.atender();
    }
}
