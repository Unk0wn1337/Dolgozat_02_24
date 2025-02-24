package org.example.modell;

import java.util.UUID;

//

public class Kategoria extends Media {
    String leiras;

    public Kategoria(UUID id,int ar, String leiras) {
        super(id,ar);
        this.leiras = leiras;
    }

    public String getLeiras() {
        return leiras;
    }

    public void setLeiras(String leiras) {
        this.leiras = leiras;
    }
}
