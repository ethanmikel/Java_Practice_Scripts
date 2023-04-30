public class Pacman {

private String pacmanup = "dude.gif";
private String pacmandown = "dudeL.girl";
private String pacmanleft = "dudeR.gif";
private String pacmanright = "dudeU.gif";

private int dx;
private int dy;
private int x;
private int y;
private int width;
private int height;
private boolean visible;

private Image imageup;
private Image imagedown;
private Image imageleft;
private Image imageright;

public Pacman() {

    ImageIcon i1 = new ImageIcon(this.getClass().getResource(pacmanup));
    imageup = i1.getImage();

    ImageIcon i2 = new ImageIcon(this.getClass().getResource(pacmandown));
    imagedown = i2.getImage();

    ImageIcon i3 = new ImageIcon(this.getClass().getResource(pacmanleft));
    imageleft = i3.getImage();

    ImageIcon i4 = new ImageIcon(this.getClass().getResource(pacmanright));
    imageright = i4.getImage();

    width = imageup.getWidth(null);
    height = imageup.getHeight(null);
    visible = true;
    x = 270;
    y = 189;

}

public int getDx() {
    return dx;
}

public void setDx(int dx) {
    this.dx = dx;
}

public int getDy() {
    return dy;
}

public void setDy(int dy) {
    this.dy = dy;
}

public int getX() {
    return x;
}

public int getY() {
    return y;
}

public void setX(int x) {
    this.x = x;
}

public void setY(int y) {
    this.y = y;
}

public Image getImageup() {
    return imageup;
}

public Image getImagedown() {
    return imagedown;
}

public Image getImageleft() {
    return imageleft;
}

public Image getImageright() {
    return imageright;
}

public void setVisible(boolean visible) {
    this.visible = visible;
}

public boolean isVisible() {
    return visible;
}

public Rectangle getBounds() {
    return new Rectangle(x, y, width, height);
}

public void move() {

    x += dx;
    y += dy;
}

public void keyPressed(KeyEvent e) {

    int key = e.getKeyCode();

    if (key == KeyEvent.VK_LEFT) {
        dx = -2;
        dy = 0;
    }

    if (key == KeyEvent.VK_RIGHT) {
        dx = 2;
        dy = 0;
    }

    if (key == KeyEvent.VK_UP) {
        dx = 0;
        dy = -2;
    }

    if (key == KeyEvent.VK_DOWN) {
        dx = 0;
        dy = 2; 
    }
}
}