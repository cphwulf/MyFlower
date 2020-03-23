public class Buket {
    String name;
    Blomst blomst;
    Tilbehør tilbehør;
    Vedhæng vedhæng;
    double pris;

    public Buket(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Blomst getBlomst() {
        return blomst;
    }

    public void setBlomst(Blomst blomst) {
        this.blomst = blomst;
    }

    public Tilbehør getTilbehør() {
        return tilbehør;
    }

    public void setTilbehør(Tilbehør tilbehør) {
        this.tilbehør = tilbehør;
    }

    public Vedhæng getVedhæng() {
        return vedhæng;
    }

    public void setVedhæng(Vedhæng vedhæng) {
        this.vedhæng = vedhæng;
    }

    public double getPris() {
        return pris;
    }

    public void setPris() {
        int tmpPris=0;
        tmpPris += this.blomst.getPris();
        tmpPris += this.tilbehør.getPris();
        this.pris = tmpPris;
    }
}
