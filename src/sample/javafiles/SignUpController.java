package sample.javafiles;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import sample.javafiles.DatabaseHandler;

public class SignUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField login_field;

    @FXML
    private PasswordField password_field;

    @FXML
    private Button signUpButton;

    @FXML
    private TextField signUpName;

    @FXML
    private TextField signUpLastname;

    @FXML
    private CheckBox checkBoxMale;

    @FXML
    private CheckBox checkBoxFemale;

    @FXML
    void initialize() {
        DatabaseHandler dbHandler = new DatabaseHandler();

        signUpButton.setOnAction(actionEvent -> {
            dbHandler.signUpUser(signUpName.getText(), signUpLastname.getText(), login_field.getText(),
                    password_field.getText(), "Male");
        });
    }
}
