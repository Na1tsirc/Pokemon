package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class ControllerMochila {
    //nombre
    @FXML
    Label pocion1,pocion2,pocion3,pocion4;
    //descripcion
    @FXML
    Label desc1,desc2,desc3,desc4;
    //Imagen
    ImageView ipc1,ipc2,ipc3,ipc4;

    Pociones pocionA=new Pociones("PocionA","Esta pocion cura 10ps","src/Pociones/pocionespk1.png",10.0);
    Pociones pocionB=new Pociones("PocionB","Esta pocion cura 20ps","src/Pociones/pocionespk2.jpg",20.0);
    Pociones pocionC=new Pociones("PocionB","Esta pocion cura 10%","src/Pociones/pocionespk3.jpg",0.1);
    Pociones pocionD=new Pociones("PocionB","Esta pocion cura 10%","src/Pociones/pocionespk4.jpg",0.2);

    @FXML
    public void initialize(){
        Pociones.convertirPociones(pocionA,pocion1,desc1,ipc1);
        Pociones.convertirPociones(pocionB,pocion2,desc2,ipc2);
        Pociones.convertirPociones(pocionC,pocion3,desc3,ipc3);
        Pociones.convertirPociones(pocionD,pocion4,desc4,ipc4);
    }
}
