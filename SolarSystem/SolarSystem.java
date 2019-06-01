/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solarsystem;


import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Marwan
 */
public class SolarSystem extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Circle mercury = new Circle(10, 10, 4.25, Color.GREY);
        Circle venus = new Circle(20, 20, 7, Color.ORANGERED);
        Circle earth = new Circle(40, 40, 7.6, Color.BLUE);
        Circle mars = new Circle(60, 60, 5, Color.BROWN);
        Circle jupiter = new Circle(80, 80, 16, Color.YELLOW);
        Circle saturn = new Circle(100, 100, 14, Color.YELLOWGREEN);
        Circle uranus = new Circle(120, 120, 8, Color.CYAN);
        Circle neptune = new Circle(150, 150, 7.5, Color.PURPLE);
        Circle bg = new Circle(400, 300, 500, Color.BLACK);
        
        Circle p1 = new Circle(400, 300, 260, Color.BLACK);
        p1.setStroke(Color.WHITE);
        Circle p2 = new Circle(400, 300, 230, Color.BLACK);
        p2.setStroke(Color.WHITE);
        Circle p3 = new Circle(400, 300, 200, Color.BLACK);
        p3.setStroke(Color.WHITE);
        Circle p4 = new Circle(400, 300, 170, Color.BLACK);
        p4.setStroke(Color.WHITE);
        Circle p5 = new Circle(400, 300, 140, Color.BLACK);
        p5.setStroke(Color.WHITE);
        Circle p6 = new Circle(400, 300, 110, Color.BLACK);
        p6.setStroke(Color.WHITE);
        Circle p7 = new Circle(400, 300, 80, Color.BLACK);
        p7.setStroke(Color.WHITE);
        Circle p8 = new Circle(400, 300, 50, Color.BLACK);
        p8.setStroke(Color.WHITE);
        Pane root = new Pane();
        root.getChildren().addAll(bg,p1,p2,p3,p4,p5,p6,p7,p8,mercury,venus,earth,mars,jupiter,saturn,uranus,neptune);
        
        
        PathTransition pt1 = new PathTransition();
        pt1.setDuration(Duration.millis(3000));
        pt1.setPath(p8);
        pt1.setNode(mercury);
        pt1.setOrientation(PathTransition.OrientationType.NONE);
        pt1.setCycleCount(Timeline.INDEFINITE);
        pt1.setAutoReverse(false);
        pt1.play();
        
        
        PathTransition pt2 = new PathTransition();
        pt2.setDuration(Duration.millis(5000));
        pt2.setPath(p7);
        pt2.setNode(venus);
        pt2.setOrientation(PathTransition.OrientationType.NONE);
        pt2.setCycleCount(Timeline.INDEFINITE);
        pt2.setAutoReverse(false);
        pt2.play();
        
        
        PathTransition pt3 = new PathTransition();
        pt3.setDuration(Duration.millis(7000));
        pt3.setPath(p6);
        pt3.setNode(earth);
        pt3.setOrientation(PathTransition.OrientationType.NONE);
        pt3.setCycleCount(Timeline.INDEFINITE);
        pt3.setAutoReverse(false);
        pt3.play();
        
        
        PathTransition pt4 = new PathTransition();
        pt4.setDuration(Duration.millis(10000));
        pt4.setPath(p5);
        pt4.setNode(mars);
        pt4.setOrientation(PathTransition.OrientationType.NONE);
        pt4.setCycleCount(Timeline.INDEFINITE);
        pt4.setAutoReverse(false);
        pt4.play();
        
        
        PathTransition pt5 = new PathTransition();
        pt5.setDuration(Duration.millis(13000));
        pt5.setPath(p4);
        pt5.setNode(jupiter);
        pt5.setOrientation(PathTransition.OrientationType.NONE);
        pt5.setCycleCount(Timeline.INDEFINITE);
        pt5.setAutoReverse(false);
        pt5.play();
        
        
        PathTransition pt6 = new PathTransition();
        pt6.setDuration(Duration.millis(16000));
        pt6.setPath(p3);
        pt6.setNode(saturn);
        pt6.setOrientation(PathTransition.OrientationType.NONE);
        pt6.setCycleCount(Timeline.INDEFINITE);
        pt6.setAutoReverse(false);
        pt6.play();
        
        
        PathTransition pt7 = new PathTransition();
        pt7.setDuration(Duration.millis(19000));
        pt7.setPath(p2);
        pt7.setNode(uranus);
        pt7.setOrientation(PathTransition.OrientationType.NONE);
        pt7.setCycleCount(Timeline.INDEFINITE);
        pt7.setAutoReverse(false);
        pt7.play();
        
        
        PathTransition pt8 = new PathTransition();
        pt8.setDuration(Duration.millis(24000));
        pt8.setPath(p1);
        pt8.setNode(neptune);
        pt8.setOrientation(PathTransition.OrientationType.NONE);
        pt8.setCycleCount(Timeline.INDEFINITE);
        pt8.setAutoReverse(false);
        pt8.play();
        
        Label l1 = new Label("playing");
        Label l2 = new Label("playing");
        Label l3 = new Label("playing");
        Label l4 = new Label("playing");
        Label l5 = new Label("playing");
        Label l6 = new Label("playing");
        Label l7 = new Label("playing");
        Label l8 = new Label("playing");
        
        //create the same for all other planets
        mercury.setOnMouseClicked(e ->{ 
        if(l1.getText()== "playing"){    
        pt1.pause();
        l1.setText("paused");
        }else{
        pt1.play();
        l1.setText("playing");
        }
    } );
        
        venus.setOnMouseClicked(e ->{ 
        if(l2.getText()== "playing"){    
        pt2.pause();
        l2.setText("paused");
        }else{
        pt2.play();
        l2.setText("playing");
        }
    } );
        
        earth.setOnMouseClicked(e ->{ 
        if(l3.getText()== "playing"){    
        pt3.pause();
        l3.setText("paused");
        }else{
        pt3.play();
        l3.setText("playing");
        }
    } );
        
        mars.setOnMouseClicked(e ->{ 
        if(l4.getText()== "playing"){    
        pt4.pause();
        l4.setText("paused");
        }else{
        pt4.play();
        l4.setText("playing");
        }
    } );
        
        jupiter.setOnMouseClicked(e ->{ 
        if(l5.getText()== "playing"){    
        pt5.pause();
        l5.setText("paused");
        }else{
        pt5.play();
        l5.setText("playing");
        }
    } );
        
        
        saturn.setOnMouseClicked(e ->{ 
        if(l6.getText()== "playing"){    
        pt6.pause();
        l6.setText("paused");
        }else{
        pt6.play();
        l6.setText("playing");
        }
    } );
        
        uranus.setOnMouseClicked(e ->{ 
        if(l7.getText()== "playing"){    
        pt7.pause();
        l7.setText("paused");
        }else{
        pt7.play();
        l7.setText("playing");
        }
    } );
        
        neptune.setOnMouseClicked(e ->{ 
        if(l8.getText()== "playing"){    
        pt8.pause();
        l8.setText("paused");
        }else{
        pt8.play();
        l8.setText("playing");
        }
    } );
       
        
        
        
        Label l_space = new Label("playing");
        
        Scene scene = new Scene(root, 800, 600);
        
        
        scene.setOnKeyPressed(e -> {
            
      if (e.getCode() == KeyCode.UP) {
                    mercury.setRadius(mercury.getRadius()+ 4);
                    venus.setRadius(venus.getRadius()+ 4);
                    earth.setRadius(earth.getRadius()+ 4);
                    mars.setRadius(mars.getRadius()+ 4);
                    jupiter.setRadius(jupiter.getRadius()+ 4);
                    saturn.setRadius(saturn.getRadius()+ 4);
                    uranus.setRadius(uranus.getRadius()+ 4);
                    neptune.setRadius(neptune.getRadius()+ 4);
      }else  if (e.getCode() == KeyCode.SPACE) {
                    
                if(l_space.getText()=="playing"){
                    
                    pt1.pause();
                    pt2.pause();
                    pt3.pause();
                    pt4.pause();
                    pt5.pause();
                    pt6.pause();
                    pt7.pause();
                    pt8.pause();
                    l_space.setText("paused");
                }else{
                    pt1.play();
                    pt2.play();
                    pt3.play();
                    pt4.play();
                    pt5.play();
                    pt6.play();
                    pt7.play();
                    pt8.play();
                    l_space.setText("playing");
                }
      }else  if (e.getCode() == KeyCode.DOWN) {
                   
                    mercury.setRadius(mercury.getRadius()- 2);
                    venus.setRadius(venus.getRadius()- 2);
                    earth.setRadius(earth.getRadius()- 2);
                    mars.setRadius(mars.getRadius()- 2);
                    jupiter.setRadius(jupiter.getRadius()- 2);
                    saturn.setRadius(saturn.getRadius()- 2);
                    uranus.setRadius(uranus.getRadius()- 2);
                    neptune.setRadius(neptune.getRadius()- 2);
      
      }                            
                
    }) ;
        
        
        
        primaryStage.setTitle("Solar System");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

   
    public static void main(String[] args) {
        launch(args);
    }
    
}
