public class Adresse {
    String vejnavn;
    String by;
    int postNr;
    int  vejnr;

    public Adresse(String by) {
        this.by=by;
    }

    public String getVejnavn() {
        return vejnavn;
    }

    public void setVejnavn(String vejnavn) {
        this.vejnavn = vejnavn;
    }

    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }

    public int getPostNr() {
        return postNr;
    }

    public void setPostNr(int postNr) {
        this.postNr = postNr;
    }

    public int getVejnr() {
        return vejnr;
    }

    public void setVejnr(int vejnr) {
        this.vejnr = vejnr;
    }
}
