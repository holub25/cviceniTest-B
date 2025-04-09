import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Letadlo implements Serializable {
    private String nazev;
    private Date zalozeni;
    private String misto;
    private Pilot pilot;
    private Typ typ;

    public Letadlo(String nazev, Date zalozeni, String misto, Typ typ, Pilot pilot) {
        this.nazev = nazev;
        this.zalozeni = zalozeni;
        setMisto(misto);
        this.pilot = pilot;
        this.typ = typ;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Letadlo letadlo = (Letadlo) o;
        return Objects.equals(nazev, letadlo.nazev);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazev);
    }

    @Override
    public String toString() {
        return "Letadlo{" +
                "nazev='" + nazev + '\'' +
                '}';
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public void setZalozeni(Date zalozeni) {
        this.zalozeni = zalozeni;
    }

    public void setMisto(String misto) {
        if(misto.matches("^[A-Za-z]{2,}[\" \"](([0-9]{5})|([0-9]{3}[\" \"][0-9]{2}))$")){
            this.misto = misto;
        }else {
            this.misto = "Praha 34566";
        }
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public void setTyp(Typ typ) {
        this.typ = typ;
    }

    public String getNazev() {
        return nazev;
    }

    public Date getZalozeni() {
        return zalozeni;
    }

    public String getMisto() {
        return misto;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public Typ getTyp() {
        return typ;
    }
}
