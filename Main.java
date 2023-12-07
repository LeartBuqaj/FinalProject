import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        User u1 = new User();

        Perberesit miell = new Perberesit("Miell");

        MengjesiUshqim m1 = new MengjesiUshqim("Krepa", 15, 200, KategoriaUshqimeve.MENGJES, KategoriaKalorive.PAK, KategoriaKohesGatimit.SHPEJTE);
        ArrayList<MengjesiUshqim> perberesitKrepa = new ArrayList<>();
        perberesitKrepa.add(m1);

        u1.metodatHyrese();
        System.out.println("-----------------");
        System.out.println("Zgjedhni ne menu duke shkruar numrin");
        System.out.println(" 1 - Mengjes \n 2 - Dreke \n 3 - Darke \n 4 - Desert \n 5 - Dil");
        int zgjedhjaMenu = scan.nextInt();
        switch (zgjedhjaMenu){
            case 1:
                System.out.println("1 - Krepa \n 2 - Omlet \n 3 - Blla \n 4 - Blla \n 5 - Dil");
                if (zgjedhjaMenu==1){
                    m1.foodInfo();

                }
                break;
            case 2:
                System.out.println();
                break;
            case 3:
                System.out.println();
                break;
            case 4:
                System.out.println();
                break;
            case 5:
                System.out.println();
                break;
        }


    }
}
