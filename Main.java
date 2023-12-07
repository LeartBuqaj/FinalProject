import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        User u1 = new User();

//        Perberesit miell = new Perberesit("Miell");

        MengjesiUshqim m1 = new MengjesiUshqim("Krepa", 15, 200, KategoriaUshqimeve.MENGJES, KategoriaKalorive.PAK, KategoriaKohesGatimit.NGADALE);
        MengjesiUshqim m2 = new MengjesiUshqim("Omlet",5,94,KategoriaUshqimeve.MENGJES,KategoriaKalorive.MESATARE,KategoriaKohesGatimit.SHPEJTE);
        MengjesiUshqim m3 = new MengjesiUshqim("Llokuma",7,250,KategoriaUshqimeve.MENGJES,KategoriaKalorive.SHUME,KategoriaKohesGatimit.MESATARISHT_SHPEJTE);
        MengjesiUshqim m4 = new MengjesiUshqim("Senviq",15,450,KategoriaUshqimeve.MENGJES,KategoriaKalorive.SHUME,KategoriaKohesGatimit.NGADALE);
        MengjesiUshqim m5 = new MengjesiUshqim("Supa",3,40,KategoriaUshqimeve.MENGJES,KategoriaKalorive.PAK,KategoriaKohesGatimit.SHPEJTE);
        DrekaUshqim d1 = new DrekaUshqim("Makarona",20,80,KategoriaUshqimeve.DREKE,KategoriaKalorive.MESATARE,KategoriaKohesGatimit.NGADALE);
        DrekaUshqim d2 = new DrekaUshqim("File Pule",15,70,KategoriaUshqimeve.DREKE,KategoriaKalorive.MESATARE,KategoriaKohesGatimit.MESATARISHT_SHPEJTE);
        DrekaUshqim d3 = new DrekaUshqim("Biftek Viqi",25,300,KategoriaUshqimeve.DREKE,KategoriaKalorive.SHUME,KategoriaKohesGatimit.NGADALE);
        DrekaUshqim d4 = new DrekaUshqim("Senviq",8,40,KategoriaUshqimeve.DREKE,KategoriaKalorive.PAK,KategoriaKohesGatimit.SHPEJTE);
        DrekaUshqim d5 = new DrekaUshqim("Pica",10,280,KategoriaUshqimeve.DREKE,KategoriaKalorive.SHUME,KategoriaKohesGatimit.MESATARISHT_SHPEJTE);
        DarkaUshqim da1 = new DarkaUshqim("Kombinim Mishi",25,880,KategoriaUshqimeve.DARKE,KategoriaKalorive.SHUME,KategoriaKohesGatimit.NGADALE);
        DarkaUshqim da2 = new DarkaUshqim("Rizoto",15,180,KategoriaUshqimeve.DARKE,KategoriaKalorive.MESATARE,KategoriaKohesGatimit.MESATARISHT_SHPEJTE);
        DarkaUshqim da3 = new DarkaUshqim("Linguini me fruta deti",25,220,KategoriaUshqimeve.DARKE,KategoriaKalorive.SHUME,KategoriaKohesGatimit.NGADALE);
        DarkaUshqim da4 = new DarkaUshqim("Sallat Shope",8,120,KategoriaUshqimeve.DARKE,KategoriaKalorive.MESATARE,KategoriaKohesGatimit.SHPEJTE);
        DarkaUshqim da5 = new DarkaUshqim("Speca ne Gjize",12,80,KategoriaUshqimeve.DARKE,KategoriaKalorive.PAK,KategoriaKohesGatimit.MESATARISHT_SHPEJTE);
        Desert de1 = new Desert("Cheese Cake",2,60,KategoriaUshqimeve.DESERT,KategoriaKalorive.PAK,KategoriaKohesGatimit.SHPEJTE);
        Desert de2 = new Desert("Tiramisu",2,120,KategoriaUshqimeve.DESERT,KategoriaKalorive.MESATARE,KategoriaKohesGatimit.SHPEJTE);
        Desert de3 = new Desert("Lemon Cheese Cake",1,200,KategoriaUshqimeve.DESERT,KategoriaKalorive.SHUME,KategoriaKohesGatimit.SHPEJTE);
        Desert de4 = new Desert("Trileqe",3,150,KategoriaUshqimeve.DESERT,KategoriaKalorive.MESATARE,KategoriaKohesGatimit.SHPEJTE);
        Desert de5 = new Desert("Pannacotta",3,80,KategoriaUshqimeve.DESERT,KategoriaKalorive.PAK,KategoriaKohesGatimit.SHPEJTE);



//        ArrayList<MengjesiUshqim> perberesitKrepa = new ArrayList<>();
//        perberesitKrepa.add(m1);

        u1.metodatHyrese();
        System.out.println("-----------------");
        System.out.println("Zgjedhni ne menu duke shkruar numrin");
        System.out.println(" 1 - Mengjes \n 2 - Dreke \n 3 - Darke \n 4 - Desert \n 5 - Dil");
        int zgjedhjaMenu = scan.nextInt();
        switch (zgjedhjaMenu){
            case 1:
                System.out.println("------Menu e Mengjesit------");
                System.out.println(" 1 - Krepa \n 2 - Omlet \n 3 - Llokuma \n 4 - Senviq \n 5 - Supa \n 6 - Dil");
                System.out.println("Zgjedh ushqimin qe doni te porosisni");
                int zgjedhjaMengjes = scan.nextInt();
                if (zgjedhjaMengjes==1){
                    m1.foodInfo();
                } else if (zgjedhjaMengjes==2) {
                    m2.foodInfo();
                } else if (zgjedhjaMengjes==3) {
                    m3.foodInfo();
                } else if (zgjedhjaMengjes==4) {
                    m4.foodInfo();
                } else if (zgjedhjaMengjes==5) {
                    m5.foodInfo();
                } else if (zgjedhjaMengjes==6) {
                    u1.logout();
                    u1.metodatHyrese();
                }
                break;
            case 2:
                System.out.println("------Menu e Drekes------");
                System.out.println(" 1 - Makarona \n 2 - File Pule  \n 3 - Biftek Viqi \n 4 - Senviq \n 5 - Pica \n 6 - Dil");
                System.out.println("Zgjedh ushqimin qe doni te porosisni");
                int zgjedhjaDrekes = scan.nextInt();
                if (zgjedhjaDrekes==1){
                    d1.foodInfo();
                } else if (zgjedhjaDrekes==2) {
                    d2.foodInfo();
                } else if (zgjedhjaDrekes==3) {
                    d3.foodInfo();
                } else if (zgjedhjaDrekes==4) {
                    d4.foodInfo();
                } else if (zgjedhjaDrekes==5) {
                    d5.foodInfo();
                }  else if (zgjedhjaDrekes==6) {
                    u1.logout();
                    u1.metodatHyrese();
                }
                break;
            case 3:
                System.out.println("------Menu e Darkes------");
                System.out.println(" 1 - Kombinim Mishi \n 2 - Rizoto  \n 3 - Linguini me fruta deti \n 4 - Sallat Shope \n 5 - Speca ne Gjize \n 6 - Dil ");
                System.out.println("Zgjedh ushqimin qe doni te porosisni");
                int zgjedhjaDarkes = scan.nextInt();
                if (zgjedhjaDarkes==1){
                    da1.foodInfo();
                } else if (zgjedhjaDarkes==2) {
                    da2.foodInfo();
                } else if (zgjedhjaDarkes==3) {
                    da3.foodInfo();
                } else if (zgjedhjaDarkes==4) {
                    da4.foodInfo();
                } else if (zgjedhjaDarkes==5) {
                    da5.foodInfo();
                }else if (zgjedhjaDarkes==6) {
                    u1.logout();
                    u1.metodatHyrese();
                }
                break;
            case 4:
                System.out.println("------Menu e Desertit------");
                System.out.println(" 1 - Cheese Cake \n 2 - Tiramisu  \n 3 - Lemon Cheese Cake \n 4 - Trileqe \n 5 - Pannacotta \n 6 - Dil ");
                System.out.println("Zgjedh ushqimin qe doni te porosisni");
                int zgjedhjaDesert = scan.nextInt();
                if (zgjedhjaDesert==1){
                    de1.foodInfo();
                } else if (zgjedhjaDesert==2) {
                    de2.foodInfo();
                } else if (zgjedhjaDesert==3) {
                    de3.foodInfo();
                } else if (zgjedhjaDesert==4) {
                    de4.foodInfo();
                } else if (zgjedhjaDesert==5) {
                    de5.foodInfo();
                }else if (zgjedhjaDesert==6) {
                    u1.logout();
                    u1.metodatHyrese();
                }
                break;
            case 5:
                if (zgjedhjaMenu==5){
                    u1.logout();
                }
                break;
        }


    }
}
