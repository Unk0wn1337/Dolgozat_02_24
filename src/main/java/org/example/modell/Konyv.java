package org.example.modell;

import java.io.Serializable;
import java.util.Objects;

public class Konyv extends Kategoria implements Serializable, Comparable<Konyv> {
    private String cim;
    private String szerzo;
    private int kiadasiEve;

    public Konyv(int ar, String leiras, String cim, String szerzo, int kiadasiEve) {
        super(ar, leiras);
        setCim(cim);
        setSzerzo(szerzo);
        setKiadasiEve(kiadasiEve);
    }

    public static SzerzoComparator rendezSzerzo(){
        return new SzerzoComparator();
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        if(cim.length() < 6){
            throw new RuntimeException("Nincsen meg 6 betű a cím");
        } else {
            this.cim = cim;
        }
    }

    public String getSzerzo() {
        return szerzo;
    }

    public void setSzerzo(String szerzo) {
        this.szerzo = szerzo;
    }

    public int getKiadasiEve() {
        return kiadasiEve;
    }

    public void setKiadasiEve(int kiadasiEve) {
        this.kiadasiEve = kiadasiEve;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Konyv konyv = (Konyv) o;
        return Objects.equals(cim, konyv.cim) && Objects.equals(szerzo, konyv.szerzo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cim, szerzo);
    }

    @Override
    public int compareTo(Konyv masik) {
        return this.kiadasiEve - masik.kiadasiEve;
    }
}
