public class Carta {

    private Integer numeroCarta;
    private Palo palo;

    public Carta() {
    }

    public Carta(Integer numeroCarta, Palo palo) {
        this.numeroCarta = numeroCarta;
        this.palo = palo;
    }

    public Integer getNumeroCarta() {
        return numeroCarta;
    }

    public void setNumeroCarta(Integer numeroCarta) {
        this.numeroCarta = numeroCarta;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "numeroCarta=" + numeroCarta +
                ", palo=" + palo +
                '}';
    }
}
