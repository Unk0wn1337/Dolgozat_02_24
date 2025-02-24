package org.example.modell;

public class NemLetezoKonyvException extends RuntimeException {

    public NemLetezoKonyvException(String hibauzenet) {
        super(hibauzenet);
    }
}
