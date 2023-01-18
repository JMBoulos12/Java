
/*
  Canvas Demo with an Image.
  18-January-2023
  OUTPUT IMAGE : http://lyksoomu.com/xFpT
*/

package com.game;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class CanvasDemo extends Application {
  public void start(Stage stageOutput) {
    // setting the title to the application
    stageOutput.setTitle("Canvas Demo");
    // creating group object
    Group groupRef = new Group();
    // creating scene object and add the group
    Scene sceneRef = new Scene(groupRef);
    stageOutput.setScene(sceneRef);
    // Creating canvas object for add an image
    Canvas canvasRef = new Canvas(600, 500);
    groupRef.getChildren().add(canvasRef);
    // adding 2d graphics to the canvas object
    GraphicsContextgraphicCOntext = canvasRef.getGraphicsContext2D();
    // adding color to the graphic
    graphicCOntext.setFill(Color.BLUE);
    // adding stroke color to graphic
    graphicCOntext.setStroke(Color.BROWN);
    // adding line width
    graphicCOntext.setLineWidth(3);
    // setting font
    Font theFont = Font.font("Times New Roman", FontWeight.BOLD, 48);
    graphicCOntext.setFont(theFont);
    // adding text to the application
    graphicCOntext.fillText("Hi, I am Canvas Demo", 61, 52);
    graphicCOntext.strokeText("Hi, I am Canvas Demo", 61, 52);
    // creating an image object
    Image earth = new Image("s2.jpg");
    // draw the image on the application
    graphicCOntext.drawImage(earth, 182, 102);
    // dsiplay the output
    stageOutput.show();
  }
  public static void main(String args[])
    // JVM calls start method automatically
    launch(args);
  }
}
