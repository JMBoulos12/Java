


/*
  Timer with moving moon around sun.
  18-January-2023
    Output: http://lyksoomu.com/xFtj
*/

package com.game;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class TimerDemo extends Application {
  public void start(Stage outStageObject)
  {
    //setting the title to the application
    outStageObject.setTitle( "Timer Demo" );
    Group groupObject = new Group();
    Scene scenRef = new Scene( groupObject );
    outStageObject.setScene( scenRef );
    //creating canvas object
    Canvas canvasRef = new Canvas( 600, 512 );
    groupObject.getChildren().add( canvasRef );
    // adding 2d graphics to the canvas object
    GraphicsContextgraphicsContext= canvasRef.getGraphicsContext2D();
    //creating image for draw them on the out screen
    Image moonImage = new Image( "m1.jpg" );
    Image sunImAGE   = new Image( "s2.jpg" );
    //getting nano time for time interval operation within the AnimationTimer() constructor
    final long tempNanoTIme = System.nanoTime();
    //this function makes the moon to revolving around the sun with some time interval
    new AnimationTimer()
    {
      //handler method for timer
      public void handle(long presentNanoTime)
      {
        double time = (presentNanoTime - tempNanoTIme) / 1000000000;
        double xAxis = 231 + 127 * Math.cos(time);
        double yAxis = 231 + 127 * Math.sin(time);
        // background images for timer functionality illustration
        graphicsContext.drawImage( moonImage, xAxis, yAxis );
        graphicsContext.drawImage( sunImAGE, 196, 196 );
      }
    }.start();
    outStageObject.show();
  }
  public static void main(String args[]) {
    // JVM calls start method automatically
    launch(args);
  }
}
