public class Ordre {
    private static int id = 0;
    private int ordreId;
    private Buket buket;
    private Adresse adresse;
    private int pris;

    public Ordre() {
        this.ordreId = id;
        id++;
    }

    public Buket getBuket() {
        return buket;
    }

    public void setBuket(Buket buket) {
        this.buket = buket;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public int getPris() {
        return pris;
    }

    public void setPris() {
        int  tmpPris=0;
        tmpPris += buket.getPris();
        if (adresse != null) {
            tmpPris += 350;
        }
        this.pris = tmpPris;
    }
}
