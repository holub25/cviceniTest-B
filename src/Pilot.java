import java.io.Serializable;
import java.util.Objects;

public class Pilot implements Serializable {
    private String jmeno;
    private String prijmeni;
    private Vyznamenani vyznamenani;

    public Pilot(String jmeno, String prijmeni, Vyznamenani vyznamenani) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vyznamenani = vyznamenani;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pilot pilot = (Pilot) o;
        return Objects.equals(jmeno, pilot.jmeno) && Objects.equals(prijmeni, pilot.prijmeni) && vyznamenani == pilot.vyznamenani;
    }

    @Override
    public int hashCode() {
        return Objects.hash(jmeno, prijmeni, vyznamenani);
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public Vyznamenani getVyznamenani() {
        return vyznamenani;
    }

    public void setVyznamenani(Vyznamenani vyznamenani) {
        this.vyznamenani = vyznamenani;
    }
}
