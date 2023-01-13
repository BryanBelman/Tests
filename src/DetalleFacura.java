import java.util.Scanner;

public class DetalleFacura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el nombre del producto");
        String nombreFactura = scanner.nextLine();
        System.out.println("Ingresa el precio 1");
        Double precio1 = scanner.nextDouble();
        System.out.println("Ingresa el precio 2");
        Double precio2 = scanner.nextDouble();

        double totalBruto = precio1+precio2;
        double impuesto = totalBruto *0.19;
        double totalConImpuesto = totalBruto + impuesto;

        System.out.println("El articulo " + nombreFactura + " tiene un costo total de " + totalBruto + " y el impuesto es de " +
                impuesto + " que daria un total de " + totalConImpuesto);

    }
}
