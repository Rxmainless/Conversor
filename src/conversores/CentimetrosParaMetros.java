package conversores;

public class CentimetrosParaMetros implements Conversor {
    @Override
    public double converter(double valor) {
        return valor / 100;
    }

    @Override
    public String getUnidades() {
        return "centimetros para metros";
    }
}
