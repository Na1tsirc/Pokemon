package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;



public class Controller {
    //pokemon 1
    @FXML
    public Label Nombrelabel1,Nombrelabel2,Nombrelabel3,Nombrelabel4,Nombrelabel5,Nombrelabel6;
    @FXML
    public Label Nivellabel1,Nivellabel2,Nivellabel3,Nivellabel4,Nivellabel5,Nivellabel6;
    @FXML
    public Label vida_label1,vida_label2,vida_label3,vida_label4,vida_label5,vida_label6;
    @FXML
    public ImageView imagen1,imagen2,imagen3,imagen4,imagen5,imagen6;
    @FXML
    public Button Mochila;
    @FXML
    public AnchorPane Fondopokemon1,Fondopokemon2,Fondopokemon3,Fondopokemon4,Fondopokemon5,Fondopokemon6;
    @FXML
    public ProgressBar pbpk1,pbpk2,pbpk3,pbpk4,pbpk5,pbpk6;

        //declaracion de pokemons
        Pokemon pokemon1 = new Pokemon("Ash Greninja","50",250,"src/Pokemon/ash_greninja.jpg");
        Pokemon pokemon2 = new Pokemon("Electiveri","75",197,"src/Pokemon/electivire.png");
        Pokemon pokemon3 = new Pokemon("Furret","80",500,"src/Pokemon/furret.gif");
        Pokemon pokemon4 = new Pokemon("Larvitar","63",125,"src/Pokemon/larvitar.jpg");
        Pokemon pokemon5 = new Pokemon("Lucario","54",139,"src/Pokemon/lucario.jpg");
        Pokemon pokemon6 = new Pokemon("Pikachu","85",154,"src/Pokemon/Pikachu.jpg");

            //Iniciar
    @FXML
    public void initialize(){
        //Pokemon convertirPokemon;
        //porcentaje de inicio para todos
        double porcentaje=0.5;
        Pokemon.convertirPokemon(pokemon1,Nombrelabel1,Nivellabel1,vida_label1,imagen1);
        vida_progres(pokemon1,porcentaje,vida_label1,pbpk1);
        Pokemon.convertirPokemon(pokemon2,Nombrelabel2,Nivellabel2,vida_label2,imagen2);
        vida_progres(pokemon2,porcentaje,vida_label2,pbpk2);
        Pokemon.convertirPokemon(pokemon3,Nombrelabel3,Nivellabel3,vida_label3,imagen3);
        vida_progres(pokemon3,porcentaje,vida_label3,pbpk3);
        Pokemon.convertirPokemon(pokemon4,Nombrelabel4,Nivellabel4,vida_label4,imagen4);
        vida_progres(pokemon4,porcentaje,vida_label4,pbpk4);
        Pokemon.convertirPokemon(pokemon5,Nombrelabel5,Nivellabel5,vida_label5,imagen5);
        vida_progres(pokemon5,porcentaje,vida_label5,pbpk5);
        Pokemon.convertirPokemon(pokemon6,Nombrelabel6,Nivellabel6,vida_label6,imagen6);
        vida_progres(pokemon6,porcentaje,vida_label6,pbpk6);

    }


    //Para poner modificar el ProgressBar segun el porcentaje y la vida
    public void vida_progres(Pokemon pokemon,double porcentaje,Label vida,ProgressBar pbpk){
        long vida_cambio = Math.round(pokemon.Vida * (porcentaje));
        vida.setText(vida_cambio+"/"+pokemon.Vida);
        pbpk.setProgress(porcentaje);

    }


    //Para vaciar los colores
    public void vaciar(){
        Fondopokemon1.setStyle("-fx-background-color: null; ");
        Fondopokemon2.setStyle("-fx-background-color: null; ");
        Fondopokemon3.setStyle("-fx-background-color: null; ");
        Fondopokemon4.setStyle("-fx-background-color: null; ");
        Fondopokemon5.setStyle("-fx-background-color: null; ");
        Fondopokemon6.setStyle("-fx-background-color: null ; ");
    }
    //Eventos de seleccion Rojo
    public void colorCelda1(MouseEvent mouseEvent) {
        vaciar();
        Fondopokemon1.setStyle("-fx-background-color: red; ");
    }

    public void colorCelda2(MouseEvent mouseEvent) {
        vaciar();
        Fondopokemon2.setStyle("-fx-background-color: red; ");
    }

    public void colorCelda3(MouseEvent mouseEvent) {
        vaciar();
        Fondopokemon3.setStyle("-fx-background-color: red; ");
    }

    public void colorCelda4(MouseEvent mouseEvent) {
        vaciar();
        Fondopokemon4.setStyle("-fx-background-color: red; ");
    }

    public void colorCelda5(MouseEvent mouseEvent) {
        vaciar();
        Fondopokemon5.setStyle("-fx-background-color: red; ");
    }

    public void colorCelda6(MouseEvent mouseEvent) {
        vaciar();
        Fondopokemon6.setStyle("-fx-background-color: red; ");
    }
}
