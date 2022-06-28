package ejercicio5;

public class Client {
    public static void main(String []args){
        IEmpresa2 web = new Web();
        IEmpresa2 escritorio = new Escritorio();
        IEmpresa2 android = new AndroidA(new Android());
        IEmpresa2 ios = new IosA(new Ios());
        IEmpresa2 windowsPhone = new WindowsPhoneA(new WindowsPhone());


        web.iniciarSesion();
        escritorio.iniciarSesion();
        android.iniciarSesion();
        ios.iniciarSesion();
        windowsPhone.iniciarSesion();
    }
}
