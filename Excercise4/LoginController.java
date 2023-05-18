// import javafx.event.ActionEvent;
// import javafx.fxml.FXML;
// import javafx.scene.control.Button;
// import javafx.scene.control.PasswordField;
// import javafx.scene.control.TextField;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;

public class LoginController {
    @FXML
    TextField mytextfield;

    @FXML
    PasswordField mypasswordfield;

    @FXML
    Button mybutton;

    @FXML
    Label mywarninglabel;

    public void login(ActionEvent event) throws IOException{
        String username = mytextfield.getText();
        String password = mypasswordfield.getText();

        System.out.println(username);
        System.out.println(password);

        if (username.equals("whereslatrelle") && password.equals("onthedancefloor"))
        {
            Parent root = FXMLLoader.load(getClass().getResource("Scene.fxml"));
            Scene scene = new Scene(root);
            Stage Stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Stage.setScene(scene);
            Stage.show();
        }
        else
        {
            mywarninglabel.setVisible(true);
        }

    }
}
