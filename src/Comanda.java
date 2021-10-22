import java.util.ArrayList;
import java.util.List;


public class Comanda {
    private List<LlistaComandes> llistaComandes = new ArrayList<LlistaComandes>();
    private String usuari;

    public List<LlistaComandes> getLlistaComandes() {
        return llistaComandes;
    }

    public void setLlistaComandes(List<LlistaComandes> llistaComandes) {
        this.llistaComandes = llistaComandes;
    }

    public void addLlistaComandes(String producte, int quantitat){
        LlistaComandes comandaAfegida = new LlistaComandes(producte,quantitat);
        this.llistaComandes.add(comandaAfegida);
    }

    public String getUsuari() {
        return usuari;
    }

    public void setUsuari(String usuari) {
        this.usuari = usuari;
    }
}
