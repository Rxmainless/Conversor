package conversores;

public class MetrosParaMilhas implements Conversor {
    @Override
    public double converter(double valor) {
        return valor / 1609.34;
    }

    @Override
    public String getUnidades() {
        return "metros para milhas";
    }
}
