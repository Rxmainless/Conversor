package conversores;

public class MetrosParaCentimetros implements Conversor {
    @Override
    public double converter(double valor) {
        return valor * 100;
    }

    @Override
    public String getUnidades() {
        return "metros para centimetros";
    }
}
