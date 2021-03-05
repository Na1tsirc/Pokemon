package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Pokemon");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.setWidth(1000);
        primaryStage.setHeight(650);
        primaryStage.setMinWidth(1000);
        primaryStage.setMaxWidth(1000);
        primaryStage.setMaxHeight(650);
        primaryStage.setMinHeight(650);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
