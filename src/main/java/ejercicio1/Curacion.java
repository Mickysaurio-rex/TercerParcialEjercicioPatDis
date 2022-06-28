package ejercicio1;

public class Curacion extends Habilidades{
    private String[] armas = {"espada", "hacha", "escopeta"};

    public Curacion(IJuego juego) {
        super(juego);
    }

    @Override
    public void agregarHabilidad(Personaje personaje){
        System.out.println("aumentando puntos de vida al personaje");
        double nuevaVida = personaje.getPuntosVida() + 80;
        personaje.setPuntosDefensa(nuevaVida);
        personaje.showInfo();
    }
}
