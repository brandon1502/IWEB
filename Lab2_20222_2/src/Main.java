import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean estado=true;
        //Scanner scanner = new Scanner(System.in);

        Mascota mascota = new Mascota();
        Servicio servicio = new Servicio();

        ControlMascota control1 = new ControlMascota();
        ControlServicio control2 = new ControlServicio();

        int contador=0;
        while(estado){
            switch(Main.menuPrincipal()){
                case "1":

                    control1.registraMascota(mascota);
                    contador++;
                    break;

                case "2":

                    control2.registraServicio(servicio);
                    break;

                case "3":

                    control1.servicioMascota(mascota,servicio);
                    break;

                case "4":
                    System.out.println("\n Total de mascotas en la veterinaria\n");
                    System.out.println("------------------------------");

                    System.out.println("Se ha registrado " + contador+ "mascotas");


                    break;

                case "5":
                    System.out.println("\n ----Cerrando el programa----");
                    estado=false;
                    break;


                default:
                    System.out.println("La opción NO es valida, ingrese nuevamente:");

                    break;

            }

        }
    }

    public static String menuPrincipal(){

        Scanner sc = new Scanner(System.in);
        System.out.println("*******************************");
        System.out.println("MENU PRINCIPAL");
        System.out.println("(1) Registrar Mascota");
        System.out.println("(2) Registrar Servicios Generales");
        System.out.println("(3) Registrar Servicio de Mascota");
        System.out.println("(4) Total de mascotas en la veterinaria");
        System.out.println("(5) Salir");
        System.out.println("*******************************");

        System.out.println("Ingrese opción: ");
        String opcion = sc.nextLine();
        return opcion;


    }
}