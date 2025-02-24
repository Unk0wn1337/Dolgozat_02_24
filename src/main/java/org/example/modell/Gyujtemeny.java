package org.example.modell;

import java.io.Serializable;
import java.util.*;

public class Gyujtemeny  implements Iterable<Media>, Serializable  {
    ArrayList<Media> KonyvLista;

    public Gyujtemeny() {
        this.KonyvLista = new ArrayList<>();
        KonyvLista.add(new Konyv(UUID.randomUUID(),3200,"leiras1","cim1","szerzo1",2001));
        KonyvLista.add(new Konyv(UUID.randomUUID(),3200,"leiras2","cim2","szerzo2",2002));
        KonyvLista.add(new Konyv(UUID.randomUUID(),3200,"leiras3","cim3","szerzo3",2003));
        KonyvLista.add(new Konyv(UUID.randomUUID(),3200,"leiras4","cim4","szerzo4",2004));
        KonyvLista.add(new Konyv(UUID.randomUUID(),3200,"leiras5","cim5","szerzo5",2005));
    }

    public void venni(Media m){
        if(KonyvLista.size() >= 5){
            throw new RuntimeException("Nem fér be több");
        } else {
            KonyvLista.add(m);
        }
    }

    public void eladni(Media m){
        if(KonyvLista.equals(m)){
            System.out.println("törölve");
            KonyvLista.remove(m);
        } else {
            throw new RuntimeException("Nincs ilyen média a gyűjteménybe");
        }
    }

    public ArrayList<Media> getKonyvLista() {
        return new ArrayList<>(KonyvLista);
    }

    public TreeSet<Media> KonyvRendezes(){
        TreeSet ts = new TreeSet();
        ts.add(getKonyvLista());
        return ts;
    }

    public HashMap hanyDarabSzerzo(){
        HashMap hm = new HashMap((Map) KonyvLista);
        return hm;
    }


    @Override
    public Iterator<Media> iterator() {
        return KonyvLista.iterator();
    }



}
