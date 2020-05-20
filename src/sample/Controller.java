package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.FileChooser;

import java.io.File;

public class Controller {

    @FXML
    private Button chooseFileBtn;

    @FXML
    private Label playedTime;

    @FXML
    void chooseFileDialog(MouseEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("MP3 Files", "*.mp3"));
        File file = fileChooser.showOpenDialog(Main.primaryStage);
        if (file != null) {
            Media audioFile = new Media(file.toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(audioFile);
            mediaPlayer.play();
        }
    }

}
