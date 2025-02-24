package org.example;

import org.example.modell.Gyujtemeny;

import java.io.*;


//


public class Main {
    public static void main(String[] args) {

        binarisKiiras();
        }

    private static void binarisKiiras() {
        Gyujtemeny gy = new Gyujtemeny();
        try(ObjectOutputStream objKi = new ObjectOutputStream(new FileOutputStream("adatok.bin"))){
            objKi.writeObject(gy);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
