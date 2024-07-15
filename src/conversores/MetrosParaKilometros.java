package conversores;

public class MetrosParaKilometros implements Conversor {
    @Override
    public double converter(double valor) {
        return valor / 1000;
    }

    @Override
    public String getUnidades() {
        return "metros para kilometros";
    }
}
