package conversores;

public class PolegadasParaMetros implements Conversor {
    @Override
    public double converter(double valor) {
        return valor / 39.37;
    }

    @Override
    public String getUnidades() {
        return "polegadas para metros";
    }
}
