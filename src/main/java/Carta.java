public class Carta {

    private final String palo;
    private final String numero;

    Carta(String palo, String numero){
        this.palo = palo;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return this.numero + " de " + this.palo;
    }
}
