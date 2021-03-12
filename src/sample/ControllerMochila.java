package sample;


import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.Optional;

public class ControllerMochila {
    //nombre
    @FXML
    Label pocion1,pocion2,pocion3,pocion4;
    //descripcion
    @FXML
    Label desc1,desc2,desc3,desc4;
    //Imagen
    @FXML
    ImageView ipc1,ipc2,ipc3,ipc4;
    //fondo
    @FXML
    HBox FP1,FP2,FP3,FP4;

//Variables para usar mandar informacion
    Controller controller;
    Pokemon datos;
    ProgressBar bar;
    Label vida;
    double vida_plus;
    int limitador;
    Stage stage;


    //declaramos las pociones
    Pociones pocionA=new Pociones("PocionA","Esta pocion cura 10ps","src/Pociones/pocionespk1.png",10.0);
    Pociones pocionB=new Pociones("PocionB","Esta pocion cura 20ps","src/Pociones/pocionespk2.jpg",20.0);
    Pociones pocionC=new Pociones("PocionB","Esta pocion cura 10%","src/Pociones/pocionespk3.png",0.1);
    Pociones pocionD=new Pociones("PocionB","Esta pocion cura 20%","src/Pociones/pocionespk4.png",0.2);


    @FXML
    public void initialize(){
        Pociones.convertirPociones(pocionA,pocion1,desc1,ipc1);
        Pociones.convertirPociones(pocionB,pocion2,desc2,ipc2);
        Pociones.convertirPociones(pocionC,pocion3,desc3,ipc3);
        Pociones.convertirPociones(pocionD,pocion4,desc4,ipc4);
    }
    //Selecionar objetos y vaciar
    public void curar1() {
        vaciar();
        FP1.setStyle("-fx-background-color: yellow; ");
        if (vida_plus < datos.vida) {
            if ((datos.vida - vida_plus) > pocionA.cantidad) {
                updateVida(pocionA.cantidad);

            } else {
                bar.setProgress(1);
                vida.setText(Math.round(datos.vida) + "/" + datos.vida);
                alerta_cerrar();
                cerrarVentana();

            }
        }
    }

    public void curar2(MouseEvent mouseEvent) {
        vaciar();
        FP2.setStyle("-fx-background-color: yellow; ");
        if (vida_plus < datos.vida) {
            if ((datos.vida - vida_plus) > pocionB.cantidad) {
                updateVida(pocionB.cantidad);

            } else {
                bar.setProgress(1);
                vida.setText(Math.round(datos.vida) + "/" + datos.vida);
                alerta_cerrar();
                cerrarVentana();
            }
        }
    }

    public void curar3(MouseEvent mouseEvent) {
        vaciar();
        FP3.setStyle("-fx-background-color: yellow; ");
        if (vida_plus < datos.vida) {
            if ((datos.vida - vida_plus) > (datos.vida*pocionC.cantidad)){
                updatePorcentaje(pocionC.cantidad);

            } else {
                bar.setProgress(1);
                vida.setText(Math.round(datos.vida) + "/" + datos.vida);
                alerta_cerrar();
                cerrarVentana();
            }
        }
    }

    public void curar4(MouseEvent mouseEvent) {
        vaciar();
        FP4.setStyle("-fx-background-color: yellow; ");
        if (vida_plus < datos.vida) {
            if ((datos.vida - vida_plus)> (datos.vida*pocionD.cantidad)){
                updatePorcentaje(pocionD.cantidad);
            } else {
                bar.setProgress(1);
                vida.setText(Math.round(datos.vida) + "/" + datos.vida);
                alerta_cerrar();
                cerrarVentana();
            }
        }
    }
    public void vaciar(){
        FP1.setStyle("-fx-background-color: null; ");
        FP2.setStyle("-fx-background-color: null; ");
        FP3.setStyle("-fx-background-color: null; ");
        FP4.setStyle("-fx-background-color: null; ");

    }
    //Obtener el porcentaje para la progresbar de curar por vida
    public double vpsbar(double vida,double cantidad){
        double resultado=Math.round(cantidad)*100/vida;
        double resultado_correcto=resultado/100;
        return resultado_correcto ;
    }


    //mandar informacion para actualizar
    @FXML
    public void mandarInfoDesdeVentana1(Pokemon datos, ProgressBar bar,Label vida, Controller controller,Stage stage) {
        this.datos=datos;
        this.bar=bar;
        this.vida=vida;
        this.controller=controller;
        this.vida_plus=datos.vida*0.5;
        this.limitador=datos.vida;
        this.stage=stage;

    }
    //Actualizar la vida por cantidad de vida
     public void updateVida(double pocion){
        double comienzo=bar.getProgress();
        double porcentaje=vpsbar(datos.vida,pocion);
        double resultado=comienzo+porcentaje;
        bar.setProgress(resultado);
        //aumento de vida por ps
        double vida_cambio = Math.round(vida_plus)+ pocion;

        vida.setText(Math.round(vida_cambio)+"/"+datos.vida);
        vida_plus=vida_cambio;

     }
     //Actualizar la vida por porcentaje
     public void updatePorcentaje(double pocion){
         double comienzo=bar.getProgress();
         double resultado=comienzo+pocion;
         bar.setProgress(resultado);

         double sumarvida= datos.vida*pocion;
         double vida_result=Math.round(vida_plus+sumarvida);
         vida.setText(Math.round(vida_result)+"/"+datos.vida);
         vida_plus=vida_result;


     }
     public void alerta_cerrar(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Confirmación");
        alert.setContentText("El pokemon se ha curado completamente");
        Optional<ButtonType> action = alert.showAndWait();



    }
    public void cerrarVentana() {

        stage.close();
    }




}

