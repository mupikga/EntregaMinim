import java.util.List;

public interface ManagerProducte {

    public void addComanda(Comanda comanda);
    public void addUsuari(Usuari usuari);

    public List<Producte> ordenarPerPreu();
    public List<Producte> ordenarPerVendes();
    public List<Comanda> comandesRealitzades(Usuari usuari);

    public Comanda servir();

    public void getComandaPerUsuari(String usuari);
    public void addProducte (Producte producte);
}
