public class LlistaComandes {
    private String producte;
    private int quantitat;

    public LlistaComandes(String producte, int quantitat){
        this.producte=producte;
        this.quantitat=quantitat;
    }

    public String getProducte(){
        return producte;
    }

    public int getQuantitat(){
        return quantitat;
    }

    public void setProducte(String producte) {
        this.producte = producte;
    }

    public void setQuantitat(int quantitat) {
        this.quantitat = quantitat;
    }
}
