package conversores;

public class KilometrosParaMetros implements Conversor {
    @Override
    public double converter(double valor) {
        return valor * 1000;
    }

    @Override
    public String getUnidades() {
        return "kilometros para metros";
    }
}
