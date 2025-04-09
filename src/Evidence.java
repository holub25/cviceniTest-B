import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.HashSet;

public class Evidence {
    private HashSet<Letadlo> list;

    public Evidence() {
        this.list = new HashSet<>();
    }

    @Override
    public String toString() {
        return "Evidence{" +
                "list=" + list +
                '}';
    }

    public String serializece(String nazev) throws IOException {
        for(Letadlo letadlo : list){
            if(letadlo.getNazev().equalsIgnoreCase(nazev)){
                ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("Letadla"));
                stream.writeObject(letadlo);
                stream.close();
                return "Serielizace letadla: "+nazev;
            }
        }
        return "Chyba serializace";
    }
    public String vypisTypu(Typ typ){
        String vypis = "";
        for(Letadlo letadlo : list){
            if(letadlo.getTyp() == typ){
                vypis = vypis+letadlo.getNazev()+", ";
            }
        }
        return vypis;
    }
    public String nejstarsi(){
        Letadlo nejstarsiLetadlo = null;
        Date nejstarsi = new Date(Long.MAX_VALUE);
        for(Letadlo letadlo : list){
            if(letadlo.getZalozeni().before(nejstarsi)){
                nejstarsi = letadlo.getZalozeni();
                nejstarsiLetadlo = letadlo;
            }

        }
        return "Nejstarší letadlo je: "+nejstarsiLetadlo.getNazev();
    }
    public String stejnyPilot(Pilot pilot){
        String vystup = "";
        for(Letadlo letadlo : list){
            if(letadlo.getPilot().equals(pilot)){
                vystup = vystup+letadlo.getNazev()+", ";
            }
        }
        return "Letadla pilota "+pilot.getJmeno()+" "+pilot.getPrijmeni()+" jsou: "+vystup;
    }


    public String pridani(Letadlo letadlo){
        list.add(letadlo);
        return "Přidáno letadlo: "+letadlo.getNazev();
    }
}
