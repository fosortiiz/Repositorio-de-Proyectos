package Comparador;

import java.util.Comparator;
import ClasesDatos.Futbolista;

/**
 *
 * @author fosortiiz
 */
public class ComparaFutbolistas implements Comparator<Futbolista> {

    @Override
    public int compare(Futbolista o1, Futbolista o2) {
        return o1.getPosicion().getOrdenListado()
                - o2.getPosicion().getOrdenListado();
    }

}
