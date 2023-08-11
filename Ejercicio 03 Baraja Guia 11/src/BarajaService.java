import java.util.ArrayList;

public class BarajaService {

    public ArrayList<Carta> crearBaraja() {

        ArrayList<Carta> provisional = new ArrayList<>();

        for (Palo palo:Palo.values()
             ) {

            for (int i = 1; i <= 12; i++) {

                if (i != 8 & i != 9) {

                    provisional.add(new Carta(i, palo));

                }

            }

        }
        return provisional;
    }
}
