package org.example.modell;

import java.util.UUID;

public class Media   {
    private UUID id;
    private int ar;

    public Media(int ar) {
        this.ar = ar;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    public UUID getId() {
        return id;
    }
}
