
public class Juego {
    public static void main(String[] args) {

        BarajaEspanola barajilla = new BarajaEspanola();
        BarajaFrancesa barajilla2 = new BarajaFrancesa();

        System.out.println("Carta -> " + barajilla.repartirCarta());
        System.out.println("Carta -> " + barajilla2.repartirCarta());
        System.out.println("Cartas -> " + barajilla.repartirVariasCartas(5));
        System.out.println("Cartas en baraja -> " + barajilla.cartasEnBaraja());
        System.out.println("Cartas salidas -> " + barajilla.cartasSalidas());


    }
}
