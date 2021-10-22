public class Producte {
    public String producte;
    public int preu;
    public int quantitatVenuda = 0;

    public Producte(String producte, int preu){
        this.producte=producte;
        this.preu=preu;
    }

    public void addQuantitatVenuda(int quantitatVenuda){
        this.quantitatVenuda = this.quantitatVenuda+quantitatVenuda;
    }

    public void setProducte(String producte) {
        this.producte = producte;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }

    public int getPreu() {
        return preu;
    }

    public String getProducte() {
        return producte;
    }

    public int getQuantitatVenuda() {
        return quantitatVenuda;
    }

    public void setQuantitatVenuda(int quantitatVenuda) {
        this.quantitatVenuda = quantitatVenuda;
    }
}
