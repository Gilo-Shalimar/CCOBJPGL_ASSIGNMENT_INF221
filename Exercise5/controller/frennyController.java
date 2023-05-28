package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import model.*;

public class frennyController {

    // @FXML
    // ImageView img1, img2;

    @FXML
    Button pau, kit, lou, yana, journ,sheen ;

    louis louis = new louis();
    journey journey = new journey();
    paulo paulo = new paulo();
    leanna leanna = new leanna();
    kiether kiether = new kiether();
    sheena sheena = new sheena();


    public void initialize() {

        louis.setage("19 years old");
        louis.setzodiac("Virgo");
        louis.setstrand("BSIT-MWA");
        louis.setshots("Tatlong baso sa ChillTop bagsak na");
        

        paulo.setage("19 years old");
        paulo.setzodiac("Aries");
        paulo.setstrand("BSIT-MWA");
        paulo.setshots("Ilang shots ng gin syaka Tanduay Ice na halo halo tegok na RIP");

        kiether.setage("19 years old");
        kiether.setzodiac("Scorpion");
        kiether.setstrand("BSIT-MWA");
        kiether.setshots("Di nabagsak pero nagiging kasing pula ng Dyablo");

        leanna.setage("19 years old");
        leanna.setzodiac("Aries");
        leanna.setstrand("BSIT-MWA");
        leanna.setshots("Mga tatlo-limang shots ang ingay na sa Omegle");


        journey.setage("19 years old");
        journey.setzodiac("Capricorn");
        journey.setstrand("BSIT-MWA");
        journey.setshots("Kalahating bote ng The Bar Pink naiyak na");

        sheena.setage("19 years old");
        sheena.setzodiac("Leo");
        sheena.setstrand("BSIT-MWA");
        sheena.setshots("Nababaliw after ilang");


    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(lou)) {
            alert.setContentText("Burn Book \nxoxo\n" + "Age: " + louis.getage() + " \nZodiac Sign: " + louis.getzodiac()+ "\nStrand: " + louis.getstrand()+ "\nShots bago mabaliw: " + louis.getshots());
        }

        if (sourceButton.equals(pau)) {
            alert.setContentText("Burn Book \nxoxo\n" + "Age: " + paulo.getage() + " \nZodiac Sign: " + paulo.getzodiac()+ "\nStrand: " + paulo.getstrand()+ "\nShots bago mabaliw: " + paulo.getshots());
        }

        if (sourceButton.equals(kit)) {
            alert.setContentText("Burn Book \nxoxo\n" + "Age: " + kiether.getage() + " \nZodiac Sign: " + kiether.getzodiac()+ "\nStrand: " + kiether.getstrand()+ "\nShots bago mabaliw: " + kiether.getshots());
        }

        if (sourceButton.equals(yana)) {
            alert.setContentText("Burn Book \nxoxo\n" + "Age: " + leanna.getage() + " \nZodiac Sign: " + leanna.getzodiac()+ "\nStrand: " + leanna.getstrand()+ "\nShots bago mabaliw: " + leanna.getshots());
        }

        if (sourceButton.equals(journ)) {
            alert.setContentText("Burn Book \nxoxo\n" + "Age: " + journey.getage() + " \nZodiac Sign: " + journey.getzodiac()+ "\nStrand: " + journey.getstrand()+ "\nShots bago mabaliw: " + journey.getshots());
        }

        if (sourceButton.equals(sheen)) {
            alert.setContentText("Burn Book \nxoxo\n" + "Age: " + sheena.getage() + " \nZodiac Sign: " + sheena.getzodiac()+ "\nStrand: " + sheena.getstrand()+ "\nShots bago mabaliw: " + sheena.getshots());
        }

        alert.showAndWait();

    }
}