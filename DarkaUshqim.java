import java.util.ArrayList;

public class DarkaUshqim extends Ushqimi{
    public DarkaUshqim(String emriUshqimit, double kohaGatimit, int kalorite, KategoriaUshqimeve kategoriaUshqimeve, KategoriaKalorive kategoriaKalorive, KategoriaKohesGatimit kategoriaKohesGatimit, ArrayList<String> kombinimMishiPerberesit) {
        super(emriUshqimit, kohaGatimit, kalorite,  kategoriaUshqimeve, kategoriaKalorive, kategoriaKohesGatimit,kombinimMishiPerberesit);
    }

    @Override
    public void foodInfo() {
        super.foodInfo();
    }
}
