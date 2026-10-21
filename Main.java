import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

  System.out.print("Ingrese la Ubicacion: ");
    String ubicacion = sc.nextLine();

  System.out.print("Ingrese la temperatura inicial: ");
    double inicial = sc.nextDouble();

  Termometro t = new Termometro(ubicacion, inicial);

  for(int i = 1; i <= 3; i++){
    System.out.print("Ingrese una temperatura: ");
    double nueva = sc.nextDouble();

    t.registrarTemperatura(nueva);

    System.out.println("Temperatura actual: " + t.getTemperaturaActual());

    System.out.println("Temperatura Fahrenheit: " + t.convertirAFahrenheit() + "ºF");

    System.out.println("Alerta de calor: " + t.hayAlertaDeCalor());

    System.out.println("------------------------------");
  }
  sc.close();

  }
}
