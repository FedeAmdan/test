package com.mulesoft.training.tdd;

public class MarsRover {
    private Point location;
    private CardinalPoint heading;

    public MarsRover(int x, int y, CardinalPoint heading) {
        this(new Point(x, y), heading);
    }

    public MarsRover(Point location, CardinalPoint heading) {
        this.location = location;
        this.heading = heading;
    }

    public int getX() {
        return location.getX();
    }

    public int getY() {
        return location.getY();
    }

    public CardinalPoint getHeading() {
        return heading;
    }

    public void moveForward() {
        location = location.add(heading.getDirectionVector());
    }
}
