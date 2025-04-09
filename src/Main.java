import java.io.IOException;
import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*Evidence e = new Evidence();
        e.pridani(new Letadlo("Boeing 444",new Date(2000,3,5),"Praha 556 77",Typ.DOPRAVNI,new Pilot("Jara","Novak",Vyznamenani.GENERAL)));
        e.pridani(new Letadlo("Airbus A380", new Date(2010, 5, 12), "Brno 60200", Typ.DOPRAVNI, new Pilot("Karel", "Doležal", Vyznamenani.KAPITAN)));
        e.pridani(new Letadlo("Cirrus SR22", new Date(2017, 4, 25), "Zlín 760 01", Typ.SOUKROME, new Pilot("David", "Sedláček", Vyznamenani.LEGENDA)));
        e.pridani(new Letadlo("MiG-29", new Date(1998, 10, 23), "Ostrava 700 30", Typ.BOJOVY, new Pilot("Petr", "Vlček", Vyznamenani.LEGENDA)));
        e.pridani(new Letadlo("Cessna 172", new Date(2015, 2, 7), "Liberec 46501", Typ.SOUKROME, new Pilot("Lukáš", "Bartoš", Vyznamenani.KAPITAN)));
        e.pridani(new Letadlo("F-16 Falcon", new Date(2001, 8, 14), "Pardubice 530 02", Typ.BOJOVY, new Pilot("Tomáš", "Král", Vyznamenani.GENERAL)));
        e.pridani(new Letadlo("Antonov An-225", new Date(1992, 11, 3), "Kladno 272 01", Typ.NAKLADNI, new Pilot("Roman", "Novotný", Vyznamenani.KAPITAN)));
        e.pridani(new Letadlo("Beechcraft King Air", new Date(2008, 6, 20), "Plzeň 301 00", Typ.SOUKROME, new Pilot("David", "Sedláček", Vyznamenani.LEGENDA)));
        e.pridani(new Letadlo("Piper Navajo", new Date(2012, 9, 15), "Hradec Králové 500 03", Typ.SOUKROME, new Pilot("David", "Sedláček", Vyznamenani.LEGENDA)));


        System.out.println("VÝPIS VŠECH");
        System.out.println(e.toString());
        System.out.println("_______________________________________________________");
        System.out.println("VÝPIS TYPU");
        System.out.println(e.vypisTypu(Typ.BOJOVY));
        System.out.println("____________________________________________________________");
        System.out.println("NEJSTARŠÍ");
        System.out.println(e.nejstarsi());
        System.out.println("________________________________________________________");
        System.out.println("VÝPIS PILOT");
        System.out.println(e.stejnyPilot(new Pilot("David", "Sedláček", Vyznamenani.LEGENDA)));
        System.out.println("________________________________________________________________");
        System.out.println("SERIALIZACE");
        try {
            System.out.println(e.serializece("Airbus A380"));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        System.out.println("________________________________________________");*/
        //____________________________________________________________________________________________

        Nacitani nacitani = new Nacitani();
        try {
            System.out.println(nacitani.nacteniTextu());
            System.out.println("________________________________________________");
            System.out.println(nacitani.nahrani());
            System.out.println("________________________________________________");
            System.out.println(nacitani.nalezeniOtec());
            System.out.println("________________________________________________");
            System.out.println(nacitani.pocetRadku());
            System.out.println("________________________________________________");
            System.out.println(nacitani.pocetSlov());
            System.out.println("________________________________________________");
            System.out.println(nacitani.pocetRadku2());
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }


    }
}