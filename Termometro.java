public class Termometro {

    private String ubicacion;
    private double temperaturaActual;

    public Termometro(String ubicacion, double temperaturaInicial) {
        this.ubicacion = ubicacion;
        this.temperaturaActual = temperaturaInicial;
    }

    public void registrarTemperatura(double nueva) {
        if (nueva >= -50 && nueva <= 60) {
            temperaturaActual = nueva;
            System.out.println("Temperatura registrada correctamente.");
        } else {
            System.out.println(
                "Error: la temperatura debe estar entre -50 y 60 grados."
            );
        }
    }

    public boolean hayAlertaDeCalor() {
        return temperaturaActual >= 35;
    }

    public double getTemperaturaActual() {
        return temperaturaActual;
    }

    public double convertirAFahrenheit() {
        return (temperaturaActual * 9 / 5) + 32;
    }
}
