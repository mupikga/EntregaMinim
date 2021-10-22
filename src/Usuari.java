import java.util.ArrayList;
import java.util.List;

public class Usuari {
    public String usuari;
    public int id;
    public List<Comanda> llistaComandes = new ArrayList<Comanda>();

    public void setLlistaComandes(List<Comanda> llistaComandes){
        this.llistaComandes=llistaComandes;
    }
    public List<Comanda> getLlistaComandes(){
        return llistaComandes;
    }

    public Usuari(String usuari, int id){
        this.usuari=usuari;
        this.id=id;
    }

    public String getUsuari(){
        return usuari;
    }

    public void setUsuari(String usuari){
        this.usuari=usuari;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

}
