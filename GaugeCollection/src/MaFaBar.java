/**class MaFaBar
 * @authors Matteo Falkenberg
 * @version 1.20, 03.11.2020
 */

import javafx.scene.Group;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class MaFaBar extends Group
{

    private int posX = 0;
    private int posY = 0;
    private int width = 100;
    private int height = 100;
    private double value = 0;

    public MaFaBar()
    {
        //nothing to do here
    }

    public void redraw()
    {
        HBox myGauge = new HBox();
        myGauge.setSpacing(5);

        ProgressBar progress = new ProgressBar();
        progress.setLayoutX(50);
        progress.setLayoutY(50);
        progress.setProgress(this.value / 100);
        ProgressIndicator indicator = new ProgressIndicator(this.value / 100);
        progress.setPrefSize(width, height);

        myGauge.getChildren().addAll(progress, indicator);

        this.getChildren().add(myGauge);
    }

    public void init(int width, int height)
    {
        this.width = width;
        this.height = height;
        this.redraw();
    }

    public void setValue(int v)
    {
        this.value = v;

        Rectangle hidePrevious = new Rectangle();
        hidePrevious.setX(posX);
        hidePrevious.setY(posY);
        hidePrevious.setWidth(width + 50);
        hidePrevious.setHeight(height);
        hidePrevious.setFill(Color.WHITESMOKE);
        this.getChildren().add(hidePrevious);

        this.redraw();
    }
}