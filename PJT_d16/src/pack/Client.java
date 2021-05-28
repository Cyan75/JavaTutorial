/*
package pack;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client
{
    public static void main(String[] args)
    {
        System.out.println("Client");
        Socket cs = new Socket();
        try
        {
            System.out.println("type any number to link");
            cs.connect(new InetSocketAddress("localhost",5001));
        }catch (Exception e) {}
        System.out.println("type any number to unlink");
        new Scanner(System.in).nextInt();
        System.out.println("Client terminated");
    }
}
*/

package pack;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client  extends Application{

    public void start(Stage primaryStage) throws Exception {
        VBox root = new VBox();
        root.setPrefSize(400, 300);

        Button btn1 = new Button("접속");
        btn1.setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("호랑");
            }
        });

        root.getChildren().add( btn1 );
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);

        primaryStage.setTitle("Client");
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
