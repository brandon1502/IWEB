import java.util.Scanner;
public class ControlServicio {

    Scanner scanner = new Scanner(System.in);
    public void registraServicio(Servicio servicio) {

        System.out.println(" Registrar Servicios Generales");
        System.out.println("------------------------------");

        System.out.println("Ingrese tipo de servicio: ");
        String tipoServicio = scanner.nextLine();
        servicio.setTipo(tipoServicio);

        System.out.println("Ingrese tiempo estimado (horas): ");
        int tiempoEstimado = Integer.parseInt(scanner.nextLine());
        servicio.setTiempoEstimado(tiempoEstimado);

        System.out.println("Ingrese el costo Base (PEN): ");
        double costoBase = Double.parseDouble(scanner.nextLine());
        servicio.setCostoBase(costoBase);
    }
}
