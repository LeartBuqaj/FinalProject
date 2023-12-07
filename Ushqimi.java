import java.util.List;

public class Ushqimi {
    private String emriUshqimit;
    private double kohaGatimit;
    private int kalorite;
    KategoriaUshqimeve kategoriaUshqimeve;
    KategoriaKalorive kategoriaKalorive;
    KategoriaKohesGatimit kategoriaKohesGatimit;
    Perberesit perberesit;

    //Konstruktori


    public Ushqimi(String emriUshqimit, double kohaGatimit, int kalorite, KategoriaUshqimeve kategoriaUshqimeve, KategoriaKalorive kategoriaKalorive, KategoriaKohesGatimit kategoriaKohesGatimit) {
        this.emriUshqimit = emriUshqimit;
        this.kohaGatimit = kohaGatimit;
        this.kalorite = kalorite;
        this.kategoriaUshqimeve = kategoriaUshqimeve;
        this.kategoriaKalorive = kategoriaKalorive;
        this.kategoriaKohesGatimit = kategoriaKohesGatimit;
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

    public void foodInfo(){
        System.out.println("------------------");
        System.out.println("Emri i ushqimit: " + emriUshqimit);
        System.out.println("Koha e gatimit: " + kohaGatimit);
        System.out.println("Kalorite: " + kalorite);
        System.out.println("Ushqimi");
    }


}
