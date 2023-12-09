import java.util.ArrayList;

public class DrekaUshqim extends Ushqimi{
    public DrekaUshqim(String emriUshqimit, double kohaGatimit, int kalorite, KategoriaUshqimeve kategoriaUshqimeve, KategoriaKalorive kategoriaKalorive, KategoriaKohesGatimit kategoriaKohesGatimit, ArrayList<String> makaronaPerberesit) {
        super(emriUshqimit, kohaGatimit, kalorite,  kategoriaUshqimeve, kategoriaKalorive, kategoriaKohesGatimit,makaronaPerberesit);
    }

    @Override
    public void foodInfo() {
        super.foodInfo();
    }


}
