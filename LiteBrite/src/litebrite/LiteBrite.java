/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package litebrite;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author narayan/Krystle Weinrich
 */
public class LiteBrite extends Application {

    //private GridPane grid;
    private static ColorPicker cp;

    @Override
    public void start(final Stage stage) throws Exception {
        int rows = 50;
        int columns = 50;

        stage.setTitle("Enjoy your game");

        GridPane grid = new GridPane();
        grid.getStyleClass().add("game-grid");

        BorderPane box = new BorderPane();//root scene
        box.setPadding(new Insets(5, 5, 5, 5));
        HBox utilityBox = new HBox(20);//horiz box
        utilityBox.setAlignment(Pos.CENTER);

        //make a new color picker and its prompt
        cp = new ColorPicker();
        //make a reset button
        Button resetButton = new Button("reset board");
        //reset action
        resetButton.setOnMouseClicked(new EventHandler() {
            public void handle(Event event) {
                //go through and make them all black
                for (int i = 0; i < columns; i++) {
                    for (int j = 0; j < rows; j++) {
                        Pane pane = new Pane();
                        pane.getChildren().removeAll(pane.getChildren());
                        pane.setOnMouseReleased(e -> {
                            pane.getChildren().removeAll();
//                            //if there are no colored squares over this peg, color as normal
//                            if (pane.getChildren().isEmpty()) {
//                                pane.getChildren().add(Anims.getAtoms(1, cp.getValue()));
//                            } else {
//                                //check the color of the child, if it is the same then remove or just color over
//                                Rectangle holder = (Rectangle) pane.getChildren().get(0);
//                                Paint p = holder.getFill();
//                                if (p == cp.getValue()) {
//                                    //if the colors are the same, remove the node. (the black css will show)
//                                    pane.getChildren().remove(0);
//                                } else {
//                                    pane.getChildren().remove(0);
//                                    //remove the child and replace with the other color so there is ever only one colored rectangle peg
//                                    pane.getChildren().add(Anims.getAtoms(1, cp.getValue()));
//                                }
//                            }
                        });
                        pane.getStyleClass().add("game-grid-cell");
                        if (i == 0) {
                            pane.getStyleClass().add("first-column");
                        }
                        if (j == 0) {
                            pane.getStyleClass().add("first-row");
                        }
                        grid.add(pane, i, j);
                    }
                }
            }

        });

        //setup utility box to the left
        utilityBox.getChildren().addAll(cp, resetButton);
        //set up game grid

        for (int i = 0; i < columns; i++) {
            ColumnConstraints column = new ColumnConstraints(10);
            grid.getColumnConstraints().add(column);
        }

        for (int i = 0; i < rows; i++) {
            RowConstraints row = new RowConstraints(10);
            grid.getRowConstraints().add(row);
        }

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                Pane pane = new Pane();
                pane.setOnMouseReleased(e -> {
                    if (pane.getChildren().isEmpty()) {
                        pane.getChildren().add(Anims.getAtoms(1, cp.getValue()));
                    } else {
                        //check the color of the child, if it is the same then remove or just color over
                        Rectangle holder = (Rectangle) pane.getChildren().get(0);
                        Paint p = holder.getFill();
                        if (p == cp.getValue()) {
                            //if the colors are the same, remove the node. (the black css will show)
                            pane.getChildren().remove(0);
                        } else {
                            pane.getChildren().remove(0);
                            //remove the child and replace with the other color so there is ever only one colored rectangle peg
                            pane.getChildren().add(Anims.getAtoms(1, cp.getValue()));
                        }
                    }
                });
                pane.getStyleClass().add("game-grid-cell");
                if (i == 0) {
                    pane.getStyleClass().add("first-column");
                }
                if (j == 0) {
                    pane.getStyleClass().add("first-row");
                }
                grid.add(pane, i, j);
            }
        }
        box.setTop(utilityBox);
        box.setCenter(grid);

        //Scene scene = new Scene(grid, (columns * 10)+20, (rows * 10)+20);
        Scene scene = new Scene(box);
        scene.getStylesheets().add(LiteBrite.class.getResource("resources/game.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    public static class Anims {

        public static Node getAtoms(final int number, Color c) {
            //TODO: implement number. (for instance dragging colors)
            Rectangle r = new Rectangle(9, 9);

            r.setFill(c);

            return r;
        }
    }

    public static void main(final String[] arguments) {
        Application.launch(arguments);
    }

}
