import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        User u1 = new User();
        List<Ushqimi> cart = new ArrayList<>();


        ArrayList<String> krepaPerberesit = new ArrayList<>(Arrays.asList("Miell", "Uje", "Kripe", "Vaj", "Veze", "Gjalpe"));
        MengjesiUshqim m1 = new MengjesiUshqim("Krepa", 0.15, 300, KategoriaUshqimeve.MENGJES, KategoriaKalorive.PAK, KategoriaKohesGatimit.MESATARISHT_SHPEJTE, krepaPerberesit);
        ArrayList<String> omletPerberesit = new ArrayList<>(Arrays.asList("Pershute", "Kripe", "Vaj", "Veze", "Djath"));
        MengjesiUshqim m2 = new MengjesiUshqim("Omlet", 0.05, 330, KategoriaUshqimeve.MENGJES, KategoriaKalorive.MESATARE, KategoriaKohesGatimit.SHPEJTE, omletPerberesit);
        ArrayList<String> llokumaPerberesit = new ArrayList<>(Arrays.asList("Miell", "Uje", "Kripe", "Vaj", "Veze", "Sode Buke"));
        MengjesiUshqim m3 = new MengjesiUshqim("Llokuma", 0.07, 500, KategoriaUshqimeve.MENGJES, KategoriaKalorive.SHUME, KategoriaKohesGatimit.SHPEJTE, llokumaPerberesit);
        ArrayList<String> sendviqViqiPerberesit = new ArrayList<>(Arrays.asList("Buke Sendviqi", "Mish Viqi", "Laker", "Domate", "Tranguj", "Sos Djeges", "Keqap", "Majonez"));
        MengjesiUshqim m4 = new MengjesiUshqim("Senviq Viqi", 0.15, 450, KategoriaUshqimeve.MENGJES, KategoriaKalorive.SHUME, KategoriaKohesGatimit.MESATARISHT_SHPEJTE, sendviqViqiPerberesit);
        ArrayList<String> supaPerberesit = new ArrayList<>(Arrays.asList("Fide", "Uje", "Kripe", "Vaj", "Karrota", "Mish Pule"));
        MengjesiUshqim m5 = new MengjesiUshqim("Supe Pule", 0.03, 125, KategoriaUshqimeve.MENGJES, KategoriaKalorive.PAK, KategoriaKohesGatimit.SHPEJTE, supaPerberesit);
        ArrayList<String> makaronaPerberesit = new ArrayList<>(Arrays.asList("Makarona", "Uje", "Kripe", "Vaj", "Sos Domatesh", "Mish i Bluar"));
        DrekaUshqim d1 = new DrekaUshqim("Makarona", 0.20, 320, KategoriaUshqimeve.DREKE, KategoriaKalorive.MESATARE, KategoriaKohesGatimit.MESATARISHT_SHPEJTE, makaronaPerberesit);
        ArrayList<String> filePulePerberesit = new ArrayList<>(Arrays.asList("Mish Pule", "Vaj", "Kripe", "Sos Kepurdhash", "Biber", "Djath", "Sallate e Gjelber", "Karrota", "Brokoli"));
        DrekaUshqim d2 = new DrekaUshqim("File Pule", 0.15, 500, KategoriaUshqimeve.DREKE, KategoriaKalorive.MESATARE, KategoriaKohesGatimit.MESATARISHT_SHPEJTE, filePulePerberesit);
        ArrayList<String> biftekViqiPerberesit = new ArrayList<>(Arrays.asList("Mish Viqi", "Sos Kepurdhash", "Kripe", "Vaj", "Domate", "Sallate e Gjelber", "Tabasko"));
        DrekaUshqim d3 = new DrekaUshqim("Biftek Viqi", 0.25, 1000, KategoriaUshqimeve.DREKE, KategoriaKalorive.SHUME, KategoriaKohesGatimit.NGADALE, biftekViqiPerberesit);
        ArrayList<String> sendviqPulePerberesit = new ArrayList<>(Arrays.asList("Buke Sendviqi", "Mish Pule", "Domate", "Tranguj", "Sos Kepurdhash", "Sallate e Gjelber", "Keqap", "Majonez"));
        DrekaUshqim d4 = new DrekaUshqim("Senviq Pule", 0.08, 500, KategoriaUshqimeve.DREKE, KategoriaKalorive.PAK, KategoriaKohesGatimit.SHPEJTE, sendviqPulePerberesit);
        ArrayList<String> picePerberesit = new ArrayList<>(Arrays.asList("Miell", "Uje", "Kripe", "Vaj", "Sode Buke", "Pershute", "Suxhuk", "Kepurdha", "Sos Domatesh", "Miser"));
        DrekaUshqim d5 = new DrekaUshqim("Pica", 0.15, 800, KategoriaUshqimeve.DREKE, KategoriaKalorive.SHUME, KategoriaKohesGatimit.MESATARISHT_SHPEJTE, picePerberesit);
        ArrayList<String> kombinimMishiPerberesit = new ArrayList<>(Arrays.asList("Mish i Kuq", "Berxolle Viqi", "File Pule", "Virshlle", "Sallate Mix", "Sos Shtepie"));
        DarkaUshqim da1 = new DarkaUshqim("Kombinim Mishi", 0.25, 880, KategoriaUshqimeve.DARKE, KategoriaKalorive.SHUME, KategoriaKohesGatimit.NGADALE, kombinimMishiPerberesit);
        ArrayList<String> rizotoPerberesit = new ArrayList<>(Arrays.asList("Oriz", "Mish Pule", "Ereza", "Perime"));
        DarkaUshqim da2 = new DarkaUshqim("Rizoto", 0.15, 500, KategoriaUshqimeve.DARKE, KategoriaKalorive.MESATARE, KategoriaKohesGatimit.MESATARISHT_SHPEJTE, rizotoPerberesit);
        ArrayList<String> linguiniPerberesit = new ArrayList<>(Arrays.asList("Makarona Linguini", "Fruta Deti", "Huder", "Vaj", "Ereza", "Qepe", "Domate"));
        DarkaUshqim da3 = new DarkaUshqim("Linguini me fruta deti", 0.25, 650, KategoriaUshqimeve.DARKE, KategoriaKalorive.SHUME, KategoriaKohesGatimit.NGADALE, linguiniPerberesit);
        ArrayList<String> sallateShopePerberesit = new ArrayList<>(Arrays.asList("Domate", "Tranguj", "Djath", "Origano", "Ullinj"));
        DarkaUshqim da4 = new DarkaUshqim("Sallate Shope", 0.8, 200, KategoriaUshqimeve.DARKE, KategoriaKalorive.MESATARE, KategoriaKohesGatimit.SHPEJTE, sallateShopePerberesit);
        ArrayList<String> specaGjizePerberesit = new ArrayList<>(Arrays.asList("Speca", "Vaj", "Gjize"));
        DarkaUshqim da5 = new DarkaUshqim("Speca me Gjize", 0.12, 400, KategoriaUshqimeve.DARKE, KategoriaKalorive.PAK, KategoriaKohesGatimit.SHPEJTE, specaGjizePerberesit);
        ArrayList<String> cheeseCakeFrutaPerberesit = new ArrayList<>(Arrays.asList("Biskota", "Gjalpe", "Djath i bute Philadelphia", "Sheqer", "Limon", "Vanille", "Mjedra"));
        Desert de1 = new Desert("Cheese Cake Me Fruta", 2, 700, KategoriaUshqimeve.DESERT, KategoriaKalorive.PAK, KategoriaKohesGatimit.NGADALE, cheeseCakeFrutaPerberesit);
        ArrayList<String> tiramisuPerberesit = new ArrayList<>(Arrays.asList("Biskota te Gjata", "Djath Maskarpone", "Sheqer", "Kakao", "Kafe Espresso"));
        Desert de2 = new Desert("Tiramisu", 2, 800, KategoriaUshqimeve.DESERT, KategoriaKalorive.MESATARE, KategoriaKohesGatimit.NGADALE, tiramisuPerberesit);
        ArrayList<String> cheeseCakePerberesit = new ArrayList<>(Arrays.asList("Biskota", "Gjalpe", "Djath i bute Philadelphia", "Sheqer", "Limon", "Vanille"));
        Desert de3 = new Desert("Lemon Cheese Cake", 1, 540, KategoriaUshqimeve.DESERT, KategoriaKalorive.SHUME, KategoriaKohesGatimit.NGADALE, cheeseCakePerberesit);
        ArrayList<String> trileqePerberesit = new ArrayList<>(Arrays.asList("Veze", "Sheqer", "Karamel", "Vanille", "Qumesht"));
        Desert de4 = new Desert("Trileqe", 3, 290, KategoriaUshqimeve.DESERT, KategoriaKalorive.MESATARE, KategoriaKohesGatimit.NGADALE, trileqePerberesit);
        ArrayList<String> pannacottaPerberesit = new ArrayList<>(Arrays.asList("Pana", "Sheqer Pluhur", "Gjelatine", "Vanille"));
        Desert de5 = new Desert("Panna Cotta", 3, 450, KategoriaUshqimeve.DESERT, KategoriaKalorive.PAK, KategoriaKohesGatimit.NGADALE, pannacottaPerberesit);






            u1.metodatHyrese();

        while (true) {
            System.out.println("-----------------");
            System.out.println("Zgjedhni ne menu duke shkruar numrin");
            System.out.println(" 1 - Mengjes \n 2 - Dreke \n 3 - Darke \n 4 - Desert \n  ---FILTER--- \n 5 - TE GJITHA" );
            int zgjedhjaMenu = scan.nextInt();


            switch (zgjedhjaMenu) {
                case 1:
                    System.out.println("------Menu e Mengjesit------");
                    System.out.println(" 1 - Krepa \n 2 - Omlet \n 3 - Llokuma \n 4 - Senviq \n 5 - Supa \n 6 - Dil");
                    System.out.println("Zgjedh ushqimin ");
                    int zgjedhjaMengjes = scan.nextInt();
                    if (zgjedhjaMengjes == 1) {
                        m1.foodInfo();
                    } else if (zgjedhjaMengjes == 2) {
                        m2.foodInfo();
                    } else if (zgjedhjaMengjes == 3) {
                        m3.foodInfo();
                    } else if (zgjedhjaMengjes == 4) {
                        m4.foodInfo();
                    } else if (zgjedhjaMengjes == 5) {
                        m5.foodInfo();
                    } else if (zgjedhjaMengjes == 6) {
                        u1.logout();
                        u1.metodatHyrese();
                    }
                    break;
                case 2:
                    System.out.println("------Menu e Drekes------");
                    System.out.println(" 1 - Makarona \n 2 - File Pule  \n 3 - Biftek Viqi \n 4 - Senviq Pule \n 5 - Pica \n 6 - Dil");
                    System.out.println("Zgjedh ushqimin ");
                    int zgjedhjaDrekes = scan.nextInt();
                    if (zgjedhjaDrekes == 1) {
                        d1.foodInfo();
                    } else if (zgjedhjaDrekes == 2) {
                        d2.foodInfo();
                    } else if (zgjedhjaDrekes == 3) {
                        d3.foodInfo();
                    } else if (zgjedhjaDrekes == 4) {
                        d4.foodInfo();
                    } else if (zgjedhjaDrekes == 5) {
                        d5.foodInfo();
                    } else if (zgjedhjaDrekes == 6) {
                        u1.logout();
                        u1.metodatHyrese();
                    }
                    break;
                case 3:
                    System.out.println("------Menu e Darkes------");
                    System.out.println(" 1 - Kombinim Mishi \n 2 - Rizoto  \n 3 - Linguini me fruta deti \n 4 - Sallat Shope \n 5 - Speca ne Gjize \n 6 - Dil ");
                    System.out.println("Zgjedh ushqimin ");
                    int zgjedhjaDarkes = scan.nextInt();
                    if (zgjedhjaDarkes == 1) {
                        da1.foodInfo();
                    } else if (zgjedhjaDarkes == 2) {
                        da2.foodInfo();
                    } else if (zgjedhjaDarkes == 3) {
                        da3.foodInfo();
                    } else if (zgjedhjaDarkes == 4) {
                        da4.foodInfo();
                    } else if (zgjedhjaDarkes == 5) {
                        da5.foodInfo();
                    } else if (zgjedhjaDarkes == 6) {
                        u1.logout();
                        u1.metodatHyrese();
                    }
                    break;
                case 4:
                    System.out.println("------Menu e Desertit------");
                    System.out.println(" 1 - Cheese Cake \n 2 - Tiramisu  \n 3 - Lemon Cheese Cake \n 4 - Trileqe \n 5 - Pannacotta \n 6 - Dil ");
                    System.out.println("Zgjedh ushqimin ");
                    int zgjedhjaDesert = scan.nextInt();
                    if (zgjedhjaDesert == 1) {
                        de1.foodInfo();
                    } else if (zgjedhjaDesert == 2) {
                        de2.foodInfo();
                    } else if (zgjedhjaDesert == 3) {
                        de3.foodInfo();
                    } else if (zgjedhjaDesert == 4) {
                        de4.foodInfo();
                    } else if (zgjedhjaDesert == 5) {
                        de5.foodInfo();
                    } else if (zgjedhjaDesert == 6) {
                        u1.logout();
                        u1.metodatHyrese();
                    }
                    break;

                case 5:
                    System.out.println("Zgjedhni duke shkruar numrin e produktit");
                    for (int i = 0; i < Arrays.asList(m1, m2, m3, m4, m5, d1, d2, d3, d4, d5, da1, da2, da3, da4, da5, de1, de2, de3, de4, de5).size(); i++) {
                        System.out.println(i + ": " + Arrays.asList(m1, m2, m3, m4, m5, d1, d2, d3, d4, d5, da1, da2, da3, da4, da5, de1, de2, de3, de4, de5).get(i).getEmriUshqimit());
                    }

                    int zgedhjaUserit = scan.nextInt();

                    if (zgedhjaUserit >= 0 && zgedhjaUserit < Arrays.asList(m1, m2, m3, m4, m5, d1, d2, d3, d4, d5, da1, da2, da3, da4, da5, de1, de2, de3, de4, de5).size()) {
                        Ushqimi ushqimiZgjedhur = Arrays.asList(m1, m2, m3, m4, m5, d1, d2, d3, d4, d5, da1, da2, da3, da4, da5, de1, de2, de3, de4, de5).get(zgedhjaUserit);

                        if (ushqimiZgjedhur.filterTeGjitha()) {
                            ushqimiZgjedhur.foodInfo();
                        } else {
                            System.out.println("Zgjedhja nuk eshte valide. Shkruani numrin edhe nje here");
                        }
                    }

                    break;
                case 6:
                    if (zgjedhjaMenu == 6) {
                        u1.logout();
                    }
                    break;
            }

        }
    }
}

