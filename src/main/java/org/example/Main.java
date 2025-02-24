package org.example;

import org.example.modell.Gyujtemeny;

import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
