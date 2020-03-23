import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //String order = orderFlowers();
        boolean brugerdialogRunning = true;
        boolean blomsterDialogRunning = true;
        Ordre ordre = new Ordre();
        View view = new View();

        while(brugerdialogRunning) {
            String flowerComponent = "";
            flowerComponent += view.getFlower();
            Blomst flower = new Blomst(flowerComponent);

            String tilbehørComponent = "";
            tilbehørComponent += view.getTilbehør();
            Tilbehør tilbehør = new Tilbehør(tilbehørComponent);

            Buket buket = new Buket("Min buket");
            buket.setBlomst(flower);
            buket.setTilbehør(tilbehør);
            buket.setPris();

            Adresse addresseComponent = null;
            addresseComponent = view.getAdresse();
            ordre.setAdresse(addresseComponent);
            ordre.setBuket(buket);
            // prisen skal ikke sættes i view eller i modellen.
            // controlleren kalder sætPris med input fra getUser
            // controlleren kalder getPris og viser showUser
            ordre.setPris();

            System.out.println("Pris: " + ordre.getPris());
            brugerdialogRunning = false;

            /*$
            model.setFlower();
            acccomponent = view.getAcc();
            New Acc;
            model.setAcc();

             */

            // q-a med brugeren
            //Q: Vis blomsterudvalg: Hvilke blomster
            // A: "Tulipan, Rose"
            // return: array of blomster

            // Q: Vis tilbehør: Hvilket tilbehør?
            // A: "Grønt"
            // return array of tilbehør

            // Q: Vis vedhængstyper: Hvilket vedhæng?
            // A: "Tekst: asddfsdaf"
            // array of vedhæng

            // Q: Vis leveringsmulighed:  Hvilken Levering?
            // A: "Adresse"
            // return adresse

            // Q: Vis ordre (bregn pris): Er dette ok (detaljer + pris)?
            // A: "Ja/nej"
            // return boolean
        }
        // opret ordre med resultat fra dialogen




    }
    public static String orderFlowers() {
        Scanner myScan = new Scanner(System.in);
        String flowerOrder = "";
        String flowerOrderAdress = "";

        // blomster objekter. Abstrakt klasse
        // listen af blomster vises
        System.out.println("Hvilke blomster skal indgå? Adskil med komma - feks roser,tulipaner");
        String flowers = myScan.nextLine();
        // hent brugerens input som tal
        System.out.println("Skal der grønt med?(Ja/Nej)");
        String green = myScan.nextLine();
        green += " til grønt";
        System.out.println("Hvad må den koste?");
        int price = myScan.nextInt();
        System.out.println("Skal den leveres?(Ja/Nej)");
        myScan.nextLine();
        String deliver = myScan.nextLine();
        if (deliver.equals("Ja")) {
            System.out.println("Navn");
            String name = myScan.nextLine();
            System.out.println("Indtast vej navn og nr:");
            String street  = myScan.nextLine();
            System.out.println("Indtast postnr og by:");
            String postal  = myScan.nextLine();
            flowerOrderAdress = String.format("%s;%s;%s", name,street,postal);
        }
        flowerOrder = String.format("%s;%s;%d;",flowers,green,price);
        flowerOrder += flowerOrderAdress;
        return flowerOrder;
    }

}

