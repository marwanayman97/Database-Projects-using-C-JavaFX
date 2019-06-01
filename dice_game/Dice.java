/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.util.Random;
import java.sql.*;
import javafx.scene.control.Label;


/**
 *
 * @author Marwan Ayman
 */
public class Dice extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        
        Label l1 = new Label("Sum is 0");
        l1.setLayoutX(122);
        l1.setLayoutY(80);
        l1.setTextFill(Color.WHITE);
        
        Rectangle rec = new Rectangle(50, 50, Color.YELLOW);
        rec.setX(120);
        rec.setY(120);
        
        Circle c1 = new Circle(130, 130, 5, Color.WHITE);
        Circle c2 = new Circle(145, 130, 5, Color.WHITE);
        c2.setVisible(false);
        Circle c3 = new Circle(160, 130, 5, Color.WHITE);
        
        Circle c4 = new Circle(130, 145, 5, Color.WHITE);
        Circle c5 = new Circle(145, 145, 5, Color.WHITE);
        c5.setVisible(false);
        Circle c6 = new Circle(160, 145, 5, Color.WHITE);
        
        Circle c7 = new Circle(130, 160, 5, Color.WHITE);
        Circle c8 = new Circle(145, 160, 5, Color.WHITE);
        c8.setVisible(false);
        Circle c9 = new Circle(160, 160, 5, Color.WHITE);
        
        Button btn = new Button();
        btn.setText("Roll !");
        
        btn.setLayoutX(125);
        btn.setLayoutY(200);
        
        
        btn.setOnMouseClicked(e ->{ 
            
        Connection myconn = null;
        Statement mystat = null;
        ResultSet myrs = null;
        Random rand = new Random();
        int n,sum = 0,lst = 0;
        
        try {
            
            myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advanced", "cms_admin", "cms_admin");
            
            String queryx = "TRUNCATE TABLE results";
            PreparedStatement preparedStmt2 = myconn.prepareStatement(queryx);
            preparedStmt2.execute();
            
            
            mystat = myconn.createStatement();
            
            
            for(int i=0;i<1000;i++){
            
            n = rand.nextInt(6)+1;
            String query = "INSERT INTO results (ID, Value) VALUES (NULL, ? ) ";
            PreparedStatement preparedStmt = myconn.prepareStatement(query);
            preparedStmt.setInt(1, n);
            preparedStmt.execute();
            }
            
            String query2 = "SELECT Value FROM results";

            Statement st = myconn.createStatement();

            ResultSet rs = st.executeQuery(query2);

            
            while (rs.next())
            {
              int val = rs.getInt("Value");
              sum += val;
            }
            
            
            String query3 = "SELECT Value FROM results ORDER BY ID DESC LIMIT 1";

            Statement st2 = myconn.createStatement();

            ResultSet rs2 = st.executeQuery(query3);

            
            while (rs2.next())
            {
               lst = rs2.getInt("Value");
              
            }
            
            myconn.close();
            
            
            
            
        } catch (SQLException ex) {
            ex.getMessage();
        }
            
         l1.setText("Sum is " + sum);
         
         
         switch(lst){
            
                case(1):
                    c1.setVisible(false);
                    c2.setVisible(false);
                    c3.setVisible(false);
                    c4.setVisible(false);
                    c5.setVisible(true);
                    c6.setVisible(false);
                    c7.setVisible(false);
                    c8.setVisible(false);
                    c9.setVisible(false);
                    break;
                
                case(2):
                    c1.setVisible(false);
                    c2.setVisible(false);
                    c3.setVisible(true);
                    c4.setVisible(false);
                    c5.setVisible(true);
                    c6.setVisible(false);
                    c7.setVisible(true);
                    c8.setVisible(false);
                    c9.setVisible(false);
                    break;
                    
                case(3):
                    c1.setVisible(false);
                    c2.setVisible(false);
                    c3.setVisible(true);
                    c4.setVisible(false);
                    c5.setVisible(true);
                    c6.setVisible(false);
                    c7.setVisible(true);
                    c8.setVisible(false);
                    c9.setVisible(false);
                    break;
                    
                case(4):
                    c1.setVisible(true);
                    c2.setVisible(false);
                    c3.setVisible(true);
                    c4.setVisible(false);
                    c5.setVisible(false);
                    c6.setVisible(false);
                    c7.setVisible(true);
                    c8.setVisible(false);
                    c9.setVisible(true);
                    break;
                    
                case(5):
                    c1.setVisible(true);
                    c2.setVisible(false);
                    c3.setVisible(true);
                    c4.setVisible(false);
                    c5.setVisible(true);
                    c6.setVisible(false);
                    c7.setVisible(true);
                    c8.setVisible(false);
                    c9.setVisible(true);
                    break;
                    
                case(6):
                    c1.setVisible(true);
                    c2.setVisible(false);
                    c3.setVisible(true);
                    c4.setVisible(true);
                    c5.setVisible(false);
                    c6.setVisible(true);
                    c7.setVisible(true);
                    c8.setVisible(false);
                    c9.setVisible(true);
                    break;
            }
         
    } );
        
        Pane root = new Pane();
        root.setStyle("-fx-background-color: black;");
        root.getChildren().addAll(rec,btn,c1,c2,c3,c4,c5,c6,c7,c8,c9,l1);
        
        Scene scene = new Scene(root, 280, 300);
        
        
        primaryStage.setTitle("Dice Game");
        primaryStage.setScene(scene);
        
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException {
        launch(args);
        
        
    }
    
}
