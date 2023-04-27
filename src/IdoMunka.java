/*
* File: IdoMunka.java
* Author: Berkovics Gellért
* Copyright: 2023, Berkovics Gellért
* Group: Szoft I/1/N
* Date: 2023-04-27
* Github: https://github.com/berkovics/dolgozat2_idomunka.git
* Licenc: GNU GPL Junit5
*/

import java.util.Scanner;

public class IdoMunka {

    public IdoMunka() {
    }

    public void startIdoMunka() {
        double munkaIdo = this.bekerDatas();
        nyomtat(munkaIdo);
    }

    private String beker(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg);
        return scanner.nextLine();
    }

    private double bekerDatas() {
        String hosszStr = beker("Megmunkált hossz (mm) ");
        if (!this.inputCheck(hosszStr)) {
            System.out.println("Hiba! Csak a számot lehet beírni!");
            throw new NumberFormatException();
        }

        String elotolasStr = beker("Fordulatonkénti előtolás (mm) ");
        if (!this.inputCheck(elotolasStr)) {
            System.out.println("Hiba! Csak a számot lehet beírni!");
            throw new NumberFormatException();
        }

        String fordulatszamStr = beker("Főorsó fordulatszám (fordulatszám percenként) ");
        if (!this.inputCheck(fordulatszamStr)) {
            System.out.println("Hiba! Csak a számot lehet beírni!");
            throw new NumberFormatException();
        }

        double hossz = Double.parseDouble(hosszStr);
        double elotolas = Double.parseDouble(elotolasStr);
        double fordulatszam = Double.parseDouble(fordulatszamStr);
        double munkaIdo = this.szamitIdoMunka(hossz, elotolas, fordulatszam);
        return munkaIdo;
    }

    private void nyomtat(double munkaIdo) {
        System.out.println(munkaIdo);
    }

    public double szamitIdoMunka(double hossz, double elotolas, double fordulatszam) {
        double munkaIdo = hossz / (elotolas * fordulatszam);
        return munkaIdo;
    }

    public boolean inputCheck(String input) {
        if (input.matches("[0-9]+")) {
            return true;
        } else {
            return false;
        }
    }

}
