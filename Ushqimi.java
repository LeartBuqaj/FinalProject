import java.util.ArrayList;
import java.util.List;

public class Ushqimi {

    private String emriUshqimit;
    private double kohaGatimit;
    private int kalorite;
    KategoriaUshqimeve kategoriaUshqimeve;
    KategoriaKalorive kategoriaKalorive;
    KategoriaKohesGatimit kategoriaKohesGatimit;
    private ArrayList<String> perberesit;

    //Konstruktori


    public Ushqimi(String emriUshqimit, double kohaGatimit, int kalorite, KategoriaUshqimeve kategoriaUshqimeve, KategoriaKalorive kategoriaKalorive, KategoriaKohesGatimit kategoriaKohesGatimit, ArrayList<String> perberesit) {
        this.emriUshqimit = emriUshqimit;
        this.kohaGatimit = kohaGatimit;
        this.kalorite = kalorite;
        this.kategoriaUshqimeve = kategoriaUshqimeve;
        this.kategoriaKalorive = kategoriaKalorive;
        this.kategoriaKohesGatimit = kategoriaKohesGatimit;
        this.perberesit = perberesit;
    }

    //Getters


    public String getEmriUshqimit() {
        return emriUshqimit;
    }

    public double getKohaGatimit() {
        return kohaGatimit;
    }

    public int getKalorite() {
        return kalorite;
    }

    public KategoriaUshqimeve getKategoriaUshqimeve() {
        return kategoriaUshqimeve;
    }

    public KategoriaKalorive getKategoriaKalorive() {
        return kategoriaKalorive;
    }

    public KategoriaKohesGatimit getKategoriaKohesGatimit() {
        return kategoriaKohesGatimit;
    }
    public ArrayList<String> getPerberesit() {
        return perberesit;
    }





    public boolean filterTeGjitha(){
        double number = 0;
        return getKohaGatimit() > number && getKohaGatimit() <= 10;
    }





    public void foodInfo(){
        System.out.println("------------------");
        System.out.println("Emri i ushqimit: " + emriUshqimit );
        System.out.println("Koha e gatimit: " + kohaGatimit+" ore");
        System.out.println("Kalorite: " + kalorite);
        System.out.println("Ushqimi servohet ne "+getKategoriaUshqimeve());
        System.out.println("Ushqimi ka "+getKategoriaKalorive()+" kalori");
        System.out.println("Ushqimi behet "+ getKategoriaKohesGatimit());
        System.out.println("Perberesit: " + perberesit);
    }


}
