package FXML;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControlador {
	@FXML
	private TextField emailField;
	
	@FXML
	private PasswordField senhaField;

	public void entrar() {
		boolean emailValido = emailField.getText().equals("kayque@gmail.com");
		boolean senhaValida = senhaField.getText().equals("kaka123");
		
		if(emailValido && senhaValida) {
			Notifications.create()
				.position(Pos.TOP_RIGHT)
				.title("Login FXML")
				.text("Login efetuado com sucesso")
				.showInformation();
		}else {
			Notifications.create()
			.position(Pos.TOP_RIGHT)
			.title("Login FXML")
			.text("Usuario e senha invalido!")
			.showError();
		}
	}
}
