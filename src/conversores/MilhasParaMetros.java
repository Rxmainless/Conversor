package conversores;

public class MilhasParaMetros implements Conversor {
    @Override
    public double converter(double valor) {
        return valor * 1609.34;
    }

    @Override
    public String getUnidades() {
        return "milhas para metros";
    }
}
