public class Dni {

    private String caracter;
    private Integer numero;

    public Dni() {
    }

    public Dni(String caracter, Integer numero) {
        this.caracter = caracter;
        this.numero = numero;
    }

    public String getCaracter() {
        return caracter;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Dni{" +
                "caracter='" + caracter + '\'' +
                ", numero=" + numero +
                '}';
    }
}
