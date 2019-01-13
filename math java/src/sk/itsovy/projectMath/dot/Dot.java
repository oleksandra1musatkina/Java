package sk.itsovy.projectMath.dot;

public class Dot {
    private int x, y;
    private char name;

    public Dot() {
        this(0, 0);
    }

    public Dot(int x) {
        this(x, x);

    }

    public Dot(int x, int y, char name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
        this.name = 'A';
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public void flip(char axis) {
        if (axis == 'x') {
            this.x *= -1;
        } else if (axis == 'y') {
            this.y *= -1;
        }
    }

    public double getMidpoindDistance() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public Queadrant getQuadrant() {
        if (x > 0 && y > 0) {
            return Queadrant.I;
        } else if (x > 0 && y < 0) {
            return Queadrant.IV;
        } else if (x < 0 && y > 0) {
            return Queadrant.II;
        } else if (x < 0 && y < 0) {
            return Queadrant.III;
        } else {
            return Queadrant.UNDEFINED;
        }
    }

    @Override
    public String toString() {
        return "x: " + this.x + " y: " + this.y + " name: " + this.name +
                " mpd: " + getMidpoindDistance() + " quadrant: " + getQuadrant();
    }
}

