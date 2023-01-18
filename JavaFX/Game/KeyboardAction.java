


/*
  Keyboard Action left and right button with Images.
  18-January-2023
  Output: http://lyksoomu.com/xFwB
*/

package com.game;
import java.util.ArrayList;
import java.util.List;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class MouseEvent extends Application {
  public void start(Stage outputStageObject) {
    // setting title to the application
    outputStageObject.setTitle("Keyboard Events Demo");
    // creating the group object
    Group groupRef = new Group();
    // creating the scene object
    Scene sceneObject = new Scene(groupRef);
    outputStageObject.setScene(sceneObject);
    // creating canvas object
    Canvas canvasObject = new Canvas(500, 400);
    groupRef.getChildren().add(canvasObject);
    // Creating array list object
    List<String>arrayListObjectString = new ArrayList<String>();
    // setting keyword pressing event by setOnKeyPressed method
    sceneObject.setOnKeyPressed(new EventHandler<KeyEvent>() {
      public void handle(KeyEventkeyEvent) {
        String contnet = keyEvent.getCode().toString();
        // overcomes duplicate data
        if (!arrayListObjectString.contains(contnet))
          arrayListObjectString.add(contnet);
      }
    });
    // setting keyword pressing event by setOnKeyReleased method
    sceneObject.setOnKeyReleased(new EventHandler<KeyEvent>() {
      public void handle(KeyEventkeyEvet) {
        String content = keyEvet.getCode().toString();
        arrayListObjectString.remove(content);
      }
    });
    // adding 2d graphics to the canvas object
    GraphicsContextgraphicContext = canvasObject.getGraphicsContext2D();
    // Creating left and right images
    Image leftImage1 = new Image("L1.jpg");
    Image leftImage2 = new Image("L2.jpg");
    Image rightImage1 = new Image("R1.jpg");
    Image rightImage2 = new Image("R2.jpg");
    // this function makes the moon to revolving around the sun with some
    // time interval
    new AnimationTimer() {
      // handler method for timer
      public void handle(long currentNanoTime) {
        // clearing the canvas
        graphicContext.clearRect(0, 0, 520, 520);
        // checking whether left key is pressed
        if (arrayListObjectString.contains("LEFT"))
          graphicContext.drawImage(leftImage2, 65, 65);
        else
          graphicContext.drawImage(leftImage1, 65, 65);
        // checking whether right key is pressed
        if (arrayListObjectString.contains("RIGHT"))
          graphicContext.drawImage(rightImage2, 260, 65);
        else
          graphicContext.drawImage(rightImage1, 260, 65);
      }
    }.start();
    // displaying output
    outputStageObject.show();
  }
  public static void main(String args[]) {
    // JVM calls start method automatically
    launch(args);
  }
}
