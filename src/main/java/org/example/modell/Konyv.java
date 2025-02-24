package org.example.modell;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class Konyv extends Kategoria implements Serializable, Comparable<Konyv>, Cloneable {
    private String cim;
    private String szerzo;
    private int kiadasiEve;

    public Konyv(UUID id, int ar, String leiras, String cim, String szerzo, int kiadasiEve) {
        super(id,ar, leiras);
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
    protected Object clone() throws CloneNotSupportedException {
        Media ujMedia = new Media(UUID.randomUUID(),this.getAr());
        Konyv k = new Konyv(ujMedia.getId(),ujMedia.getAr(),"Leiras1","Cim1","Szerzo1",2000);
        return k;
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
