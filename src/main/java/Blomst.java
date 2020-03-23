public class Blomst {
    String name;
    String color;
    String size;
    int pris;

    public Blomst(String name) {
        this.name = name;
        setPris();
    }

    public void setPris() {
        switch (this.name) {
            case "Tulipan": this.pris=23;break;
            case "Rose": this.pris=12;break;
            case "Høstblomst": this.pris=3;break;
            case "Georgine": this.pris=23;break;
            case "Lilje": this.pris=43;break;
            default:this.pris=10;
        }
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public int getPris() {
        return pris;
    }
}
