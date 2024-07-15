package conversores;

public class MetrosParaPolegadas implements Conversor {
    @Override
    public double converter(double valor) {
        return valor * 39.37;
    }

    @Override
    public String getUnidades() {
        return "metros para polegadas";
    }
}
