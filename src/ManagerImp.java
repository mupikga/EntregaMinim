import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;

public class ManagerImp implements ManagerProducte{
    List<Producte> llistaProducte = new ArrayList<Producte>();
    List<Comanda> comandesPendents= new ArrayList<Comanda>();
    HashMap<String, Usuari> usuaris = new HashMap<String, Usuari>();

    private static ManagerImp manager;

    public static ManagerImp(){
        servei = new ArrayList<>();

    }

    public int nombreComandes(){
        return servei.size();
    }


}
