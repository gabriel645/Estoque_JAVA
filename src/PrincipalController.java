/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author gabri
 */
public class PrincipalController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    public void showCadastro(ActionEvent event){               
        try {
            Parent loader = FXMLLoader.load(this.getClass().getResource("Cadastro.fxml")); 
            Scene home = new Scene(loader);            
            Stage app = new Stage();
            app.setTitle("Olipia SPA - Cadastro");
            app.setScene(home);
            app.show();

        } catch(Exception e) {
           e.printStackTrace();
        }
     }
    public void showEntrada(ActionEvent event){               
        try {
            Parent loader = FXMLLoader.load(this.getClass().getResource("Entrada.fxml")); 
            Scene home = new Scene(loader);
            Stage app = new Stage();
            app.setTitle("Olipia SPA - Entrada");
            app.setScene(home);
            app.show();

        } catch(Exception e) {
           e.printStackTrace();
        }
     }
    public void showSaida(ActionEvent event){               
        try {
            Parent loader = FXMLLoader.load(this.getClass().getResource("Saida.fxml")); 
            Scene home = new Scene(loader);
            Stage app = new Stage();
            app.setTitle("Olipia SPA - Saida");
            app.setScene(home);
            app.show();

        } catch(Exception e) {
           e.printStackTrace();
        }
     }
    public void showRelatorio(ActionEvent event){               
        try {
            Parent loader = FXMLLoader.load(this.getClass().getResource("Relatorio.fxml")); 
            Scene home = new Scene(loader);
            Stage app = new Stage();
            app.setTitle("Olipia SPA - Relatório");
            app.setScene(home);
            app.show();

        } catch(Exception e) {
           e.printStackTrace();
        }
     }
    
}
