import java.util.Scanner;
public class ControlMascota {

    Scanner scanner = new Scanner(System.in);


    public void registraMascota(Mascota mascota) {

        System.out.println(" Registrar Mascota");
        System.out.println("------------------------------");

        System.out.println("Ingrese nombre:");
        String nombre = scanner.nextLine();
        mascota.setNombre(nombre);

        System.out.println("Ingrese raza:");
        String raza = scanner.nextLine();
        mascota.setRaza(raza);

        System.out.println("Ingrese edad:");
        int edad = Integer.parseInt(scanner.nextLine());
        
        mascota.setEdad(edad);

        System.out.println("Ingrese Genero:");
        String genero = scanner.nextLine();
        mascota.setGenero(genero);

        System.out.println("Ingrese Peso (kg):");
        double peso = Double.parseDouble(scanner.nextLine());
        mascota.setPeso(peso);

        System.out.println("Ingrese Tamaño:");
        String tamano = scanner.nextLine();
        mascota.setTamano(tamano);

        System.out.println("Ingrese Nombre del Dueño:");
        String nombreDueno = scanner.nextLine();
        mascota.setNombreDueno(nombreDueno);

        System.out.println("Ingrese Correo:");
        String correo = scanner.nextLine();
        mascota.setCorreo(correo);

        System.out.println("Ingrese Servicio:");
        String servicio = scanner.nextLine();
        mascota.setServicio(servicio);


    }

    public void servicioMascota(Mascota mascota, Servicio servicio) {

        System.out.println("Registrar Servicio de Mascota");
        System.out.println("------------------------------");

        System.out.println("Ingrese el servicio ");
        String servicioComparar = scanner.nextLine();


        if (servicio.getTipo().equals(servicioComparar)) {

            int tam;
            if (mascota.getTamano().equals("pequeño")) {
                tam = 1;
            } else {
                if (mascota.getTamano().equals("mediano")) {
                    tam = 2;
                } else {
                    tam = 3;
                }
            }

            double costoFinal = servicio.getCostoBase() + (servicio.getCostoBase() * tam / mascota.getPeso());

            System.out.println("El servicio de " +mascota.getServicio() +" para " +mascota.getNombre()+ "  tendrá un costo de "+costoFinal+  " soles\n");
            System.out.println("------------------------------");
        }
        else {

            System.out.println("El servicio debe coincidir con el servicio registrado");
        }


    }
}
