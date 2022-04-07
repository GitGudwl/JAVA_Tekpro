import javax.swing.text.StyledEditorKit.BoldAction;

public class Shape {
    private String color;
    private Boolean filled;

    public Shape() {
        filled = true;
        color = "Red";
    }

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        if (filled = true) {
            return true;
        } else {
            return false;
        }
    }

    public void setFilled(boolean filledSet) {
        filled = filledSet;
    }

    public String toString() {
        String isNot = "";
        if (isFilled() == false) {
            isNot = "Not";
        }
        return "A Shape with color" + color + "and is" + isNot + "filled";
    }
}
