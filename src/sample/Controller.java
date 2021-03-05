package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;



public class Controller {


    //pokemon 1
    @FXML
    private Label Nombrelabel1,Nombrelabel2,Nombrelabel3,Nombrelabel4,Nombrelabel5,Nombrelabel6;
    @FXML
    private Label Nivellabel1,Nivellabel2,Nivellabel3,Nivellabel4,Nivellabel5,Nivellabel6;
    @FXML
    private Label vida_label1,vida_label2,vida_label3,vida_label4,vida_label5,vida_label6;
    @FXML
    public ImageView imagen1,imagen2,imagen3,imagen4,imagen5,imagen6;
    @FXML
    public Button siguiente1, siguiente2, siguiente3,siguiente4,siguiente5,siguiente6;
    @FXML
    public AnchorPane Fondopokemon1,Fondopokemon2,Fondopokemon3,Fondopokemon4,Fondopokemon5,Fondopokemon6;

    @FXML
    public void initialize(){
        Pokemon convertirPokemon;

        Pokemon pokemon1 = new Pokemon("Ash Greninja","50",250,"src/Pokemon/ash_greninja.jpg");
        Pokemon pokemon2 = new Pokemon("Electiveri","75",197,"src/Pokemon/electivire.png");
        Pokemon pokemon3 = new Pokemon("Furret","80",500,"src/Pokemon/furret.gif");
        Pokemon pokemon4 = new Pokemon("Larvitar","63",125,"src/Pokemon/larvitar.jpg");
        Pokemon pokemon5 = new Pokemon("Lucario","54",139,"src/Pokemon/lucario.jpg");
        Pokemon pokemon6 = new Pokemon("Pikachu","85",154,"src/Pokemon/Pikachu.jpg");



        Pokemon.convertirPokemon(pokemon1,Nombrelabel1,Nivellabel1,vida_label1,imagen1);
        Pokemon.convertirPokemon(pokemon2,Nombrelabel2,Nivellabel2,vida_label2,imagen2);
        Pokemon.convertirPokemon(pokemon3,Nombrelabel3,Nivellabel3,vida_label3,imagen3);
        Pokemon.convertirPokemon(pokemon4,Nombrelabel4,Nivellabel4,vida_label4,imagen4);
        Pokemon.convertirPokemon(pokemon5,Nombrelabel5,Nivellabel5,vida_label5,imagen5);
        Pokemon.convertirPokemon(pokemon6,Nombrelabel6,Nivellabel6,vida_label6,imagen6);



    }

    public void Eleccion(){

    }

    public void colorCelda() {
        Fondopokemon1.setStyle("-fx-background-color: red; ");
    }
/*
    public void colorCelda1(MouseEvent mouseEvent) {

        Fondopokemon1.setStyle("-fx-background-color: red; ");
        System.out.println(pokemon1);
        Fondopokemon2.setStyle("-fx-background-color: null ; ");
        Fondopokemon3.setStyle("-fx-background-color: null ; ");
        Fondopokemon4.setStyle("-fx-background-color: null ; ");
        Fondopokemon5.setStyle("-fx-background-color: null ; ");
        Fondopokemon6.setStyle("-fx-background-color: null ; ");
    }

    public void colorCelda2(MouseEvent mouseEvent) {
        Fondopokemon1.setStyle("-fx-background-color: null; ");
        Fondopokemon2.setStyle("-fx-background-color: red ; ");
        Fondopokemon3.setStyle("-fx-background-color: null ; ");
        Fondopokemon4.setStyle("-fx-background-color: null ; ");
        Fondopokemon5.setStyle("-fx-background-color: null ; ");
        Fondopokemon6.setStyle("-fx-background-color: null ; ");
    }

    public void colorCelda3(MouseEvent mouseEvent) {
        Fondopokemon1.setStyle("-fx-background-color: null; ");
        Fondopokemon2.setStyle("-fx-background-color: null ; ");
        Fondopokemon3.setStyle("-fx-background-color: red ; ");
        Fondopokemon4.setStyle("-fx-background-color: null ; ");
        Fondopokemon5.setStyle("-fx-background-color: null ; ");
        Fondopokemon6.setStyle("-fx-background-color: null ; ");
    }

    public void colorCelda4(MouseEvent mouseEvent) {
        Fondopokemon1.setStyle("-fx-background-color: null; ");
        Fondopokemon2.setStyle("-fx-background-color: null ; ");
        Fondopokemon3.setStyle("-fx-background-color: null ; ");
        Fondopokemon4.setStyle("-fx-background-color: red ; ");
        Fondopokemon5.setStyle("-fx-background-color: null ; ");
        Fondopokemon6.setStyle("-fx-background-color: null ; ");
    }

    public void colorCelda5(MouseEvent mouseEvent) {
        Fondopokemon1.setStyle("-fx-background-color: null; ");
        Fondopokemon2.setStyle("-fx-background-color: null ; ");
        Fondopokemon3.setStyle("-fx-background-color: null ; ");
        Fondopokemon4.setStyle("-fx-background-color: null ; ");
        Fondopokemon5.setStyle("-fx-background-color: red ; ");
        Fondopokemon6.setStyle("-fx-background-color: null ; ");
    }

    public void colorCelda6(MouseEvent mouseEvent) {
        Fondopokemon1.setStyle("-fx-background-color: null; ");
        Fondopokemon2.setStyle("-fx-background-color: null; ");
        Fondopokemon3.setStyle("-fx-background-color: null; ");
        Fondopokemon4.setStyle("-fx-background-color: null; ");
        Fondopokemon5.setStyle("-fx-background-color: null; ");
        Fondopokemon6.setStyle("-fx-background-color: red ; ");
    }
*/
}
