/********************************************************************************************************************
 ********************************************************************************************************************
 *****                                    Chapter 15, Part 2: Problem 4                                         *****
 *****__________________________________________________________________________________________________________*****
 *****          4. Write a program in which the user may press any key and for every key pressed,               *****
 *****                                count the number of key presses and                                       *****
 *****                  output this count along with the key pressed using System.out.println.                  *****
 ********************************************************************************************************************
 ********************************************************************************************************************/

// IMPORTS of needed tools and plug-ins
import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;


public class Chapter15_Part2_4 extends Application {

    // CLASS VARIABLE(s) declaration(s)
    private int keyCounter;


    public static void main(String[] args) {
        launch(args);
    }


    public void start(Stage primaryStage){
        // Create and Initialize the Pane
        Pane pane = new Pane();

        // Create and Initialize the Scene
        Scene scene = new Scene(pane, 500, 500);

        // Initialize keyCounter to 0
        keyCounter = 0;

        // KeyPressed EventHandler
        scene.setOnKeyPressed(e -> {
            // Increment keyCounter
            keyCounter++;

            // if block to check if the key pressed is a visible key (non-visible keys are keys like
                // [SHIFT], [ESCAPE], etc
            if(e.getText().equals("")){
                System.out.println(keyCounter + " " + e.getCode());
            }
            // else if block to check if the key pressed was the "SPACE" key
            else if(e.getText().equals(" ")){
                System.out.println(keyCounter + " SPACE");
            }
            // else block to handle visible keys (numbers, letters, punctuation, etc)
            else{
                System.out.println(keyCounter + " " + e.getText());
            }
        });

        // Set the Title of the Scene, Set the Scene to Stage, Show the Stage
        primaryStage.setTitle("Chapter 15, Part 2: Problem 4");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
