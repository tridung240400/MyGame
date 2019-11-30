package TowerDefense.Entity.GameTile;

import javafx.scene.image.Image;

public class Rock extends GameTile {
    public static final String IMAGE_URL = "file:img/Retina/towerDefense_tile136.png";
    public Rock(double x, double y) {
        super(x, y);
        img = new Image(IMAGE_URL);
    }
}
