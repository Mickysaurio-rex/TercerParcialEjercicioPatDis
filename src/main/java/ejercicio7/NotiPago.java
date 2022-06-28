package ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class NotiPago implements INoti{
    private List<IUsuario> receivers= new ArrayList<>();

    @Override
    public void suscribir(IUsuario user) {
        receivers.add(user);
    }

    @Override
    public void sendNotification() {
        for (IUsuario user : receivers) {
            user.actualizacion("Nuevo pago realizado!");
        }
    }
}
