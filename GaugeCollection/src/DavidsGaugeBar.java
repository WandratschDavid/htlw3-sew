import javafx.scene.Group;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class DavidsGaugeBar extends Group
{
    private double value = 0;
    private int width = 100;
    private int height = 50;


    public void redraw()
    {
        HBox rootBox = new HBox();

        ProgressIndicator p1 = new ProgressIndicator();
        p1.setPrefSize(100,100);
        p1.setProgress(this.value / 100);

        rootBox.getChildren().add(p1);

        this.getChildren().add(rootBox);
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
        hidePrevious.setX(0);
        hidePrevious.setY(0);
        hidePrevious.setWidth(width);
        hidePrevious.setHeight(height);
        hidePrevious.setFill(Color.WHITESMOKE);
        this.getChildren().add(hidePrevious);

        this.redraw();
    }
}