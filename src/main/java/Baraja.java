import java.util.*;

public class Baraja {

    private final String[] palos;
    private final String[] numCartas;
    private final List<Carta> cartas;
    private final List<Carta> cartasSalidas;

    Baraja(String[] palos, String[] numCartas) {
        this.palos = palos;
        this.numCartas = numCartas;
        cartasSalidas = new ArrayList<>();
        cartas = new ArrayList<>();
        generarBaraja();
    }

    private void generarBaraja() {
        cartas.clear();
        cartasSalidas.clear();
        for (String palo : palos) {
            for (String numCarta : numCartas) {
                Carta carta = new Carta(palo, numCarta);
                cartas.add(carta);
            }
        }
    }

    public Carta repartirCarta() {
        Carta carta = cartas.get(0);
        cartasSalidas.add(carta);
        cartas.remove(0);
        return carta;
    }

    public List<Carta> repartirVariasCartas(int cartasARepartir) {

        List<Carta> cartasRepartidas = new ArrayList<>();
        if (cartasARepartir > cartas.size()){
            cartasARepartir = cartas.size();
        }
        for (int i = 0; i < cartasARepartir; i++) {
            Carta carta = cartas.get(0);
            cartasSalidas.add(carta);
            cartas.remove(0);
            cartasRepartidas.add(carta);
        }
        return cartasRepartidas;
    }

    public List<Carta> cartasEnBaraja() {
        return new ArrayList<>(cartas);
    }

    public List<Carta> cartasSalidas() {
        return cartasSalidas;
    }

    public boolean barajarCartasRestantes() {

        if (cartas.size() > 0) {
            Collections.shuffle(cartas);
            return true;
        }
        return false;

    }

    public boolean barajarCartas() {
        generarBaraja();
        Collections.shuffle(cartas);
        return true;

    }

    public boolean haSalidoCarta(String cartaASaber) {
        for (Carta c : cartas) {
            if (c.toString().equalsIgnoreCase(cartaASaber)) {
                return true;
            }
        }
        return false;
    }

}
