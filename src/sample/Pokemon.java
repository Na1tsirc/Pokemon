package sample;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.File;

public class Pokemon {
    String Nombre;
    String Nivel;
    int Vida;
    String Url;

    Pokemon(String Nombre, String Nivel, int Vida, String Url) {
        this.Nombre=Nombre;
        this.Nivel=Nivel;
        this.Vida=Vida;
        this.Url=Url;
    }

    //convertir url en para ingrearlas en el view
    public static Image convertir(String enlace){
        File file = new File(enlace);
        return new Image(file.toURI().toString());
    }


    //la clase pokemon para convertir
    public static void convertirPokemon(Pokemon pokemones, Label nombre, Label nivel, Label vida, ImageView image){
        nombre.setText(pokemones.Nombre);
        nivel.setText(pokemones.Nivel);
        String vidaTotal=String.valueOf(pokemones.Vida);
        String vidacambio=String.valueOf(pokemones.Vida);
        vida.setText(vidacambio+"/"+vidaTotal);
        image.setImage(convertir(pokemones.Url));
    }
}
