import javafx.scene.Group;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import static javafx.scene.paint.Color.*;


public class MoKrBar extends Group
{

    private int radius = 25;
    private double value = 0;

    public MoKrBar()
    {
        //nothing to do here
    }

    public void redraw()
    {

        final ProgressIndicator pi = new ProgressIndicator();
        pi.setMinSize(100,100);

        Rectangle hidePrevious = new Rectangle();
        hidePrevious.setX(0);
        hidePrevious.setY(0);
        hidePrevious.setWidth(radius);
        hidePrevious.setHeight(radius);
        hidePrevious.setFill(Color.WHITESMOKE);
        this.getChildren().add(hidePrevious);

        value = value / 100;




        pi.setProgress(value);


        this.getChildren().addAll(pi);
    }

    public void init( int radius)
    {

        this.radius = radius;
        this.redraw();
    }

    public void setValue(int v)
    {
        this.value = v;
        this.redraw();
    }
}