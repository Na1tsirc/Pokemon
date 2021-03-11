package sample;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;

public class Pociones {
    String Nombre;
    String descripcion;
    String urlpocion;
    Double cantidad;

    Pociones(String Nombre, String descripcion, String urlpocion,Double cantidad) {
        this.Nombre=Nombre;
        this.descripcion=descripcion;
        this.urlpocion=urlpocion;
        this.cantidad=cantidad;
    }

    //convertir url en para ingrearlas en el view(clase aparte))
    public static Image convertir(String enlace){
        File file = new File(enlace);
        return new Image(file.toURI().toString());
    }

    public static void convertirPociones(Pociones pocion, Label nombre, Label descripcion,ImageView image){
        nombre.setText(pocion.Nombre);
        descripcion.setText(pocion.descripcion);
        image.setImage(convertir(pocion.urlpocion));

    }
}
