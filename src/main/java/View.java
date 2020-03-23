import java.util.Scanner;
public class View {
    Scanner ms = new Scanner(System.in);

    public String getFlower() {
        presentFlowers();
        String retVal = "";
        System.out.println("Hvilken ");
        retVal = ms.nextLine();
        return retVal;
    }
    public String getTilbehør() {
        presentAccess();
        String retVal = "";
        System.out.println("Hvilket tilbehør ");
        retVal = ms.nextLine();
        return retVal;
    }

    public Adresse getAdresse() {
        Adresse retAdresse =  new Adresse("Odense");
        retAdresse.setPostNr(8000);
        return retAdresse;
    }

    public void presentFlowers() {
        System.out.println("Tulipan");
        System.out.println("Rose");
        System.out.println("Høstblomst");
        System.out.println("Georgine");
        System.out.println("Lilje");
    }
    public void presentAccess() {
        System.out.println("Grønt");
        System.out.println("Snepryd");
}
}
