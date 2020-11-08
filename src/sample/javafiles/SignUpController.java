package sample.javafiles;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import sample.javafiles.DatabaseHandler;

public class SignUpController {

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
    private RadioButton checkBoxMale;

    @FXML
    private RadioButton checkBoxFemale;



    @FXML
    void initialize() {
        signUpButton.setOnAction(actionEvent -> {
            signUpNewUser();
        });
    }

    private void signUpNewUser() {
        DatabaseHandler dbHandler = new DatabaseHandler();

        String firstName = signUpName.getText();
        String lastName = signUpLastname.getText();
        String userName = login_field.getText();
        String password = password_field.getText();
        String gender = "";
        if (checkBoxMale.isSelected())
            gender = "Мужской";
        else
            gender = "Женский";

        User user = new User(firstName,lastName,userName,password,gender);

        dbHandler.signUpUser(user);
    }
}
