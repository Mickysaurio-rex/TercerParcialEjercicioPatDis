package ejercicio6;

public class Aplicacion implements IAplicacion{


    @Override
    public void obternerEstado(Celular celular) {
        celular.mostrar();
        System.out.println("Preparando para mantenimiento preventivo\n\n\n");
    }

    @Override
    public void obtenerEstado(Tv tele) {
        tele.mostrar();
        System.out.println("\n\n\n");
    }

    @Override
    public void obtenerEstado(Computadora computadora) {
        computadora.mostrar();
        int valor = (int)(Math.random()*100+1);
        System.out.println(valor);
        if(valor%2==0){
            System.out.println("Preparando para mantenimiento preventivo\n\n\n");
        }else{
            System.out.println("Preparando para mantenimiento correctivo\n\n\n");
        }
    }
}
