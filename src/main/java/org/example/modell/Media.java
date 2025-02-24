package org.example.modell;

import java.util.UUID;

//

public class Media  {
    private UUID id;
    private int ar;

    public Media(UUID id, int ar) {
        this.id = id;
        this.ar = ar;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }
}
