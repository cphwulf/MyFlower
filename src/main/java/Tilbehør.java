public class Tilbehør {
    String type;
    int pris;

    public Tilbehør(String type) {
        this.type = type;
        setPris();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPris() {
        return pris;
    }

    public void setPris() {
        switch (this.type) {
            case "Grønt": this.pris=23;
            case "Snepryd": this.pris=13;
            default:this.pris=4;
        }
    }
}
