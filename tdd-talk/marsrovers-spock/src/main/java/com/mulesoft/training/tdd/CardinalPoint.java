package com.mulesoft.training.tdd;

public enum CardinalPoint {
    NORTH(new Point(0, 1)),
    /*
    These are not used in tests yet:

    EAST(new Point(1, 0)),
    SOUTH(new Point(0, -1)),
    WEST(new Point(-1, 0))
    */;

    private Point directionVector;

    private CardinalPoint(Point directionVector) {
        this.directionVector = directionVector;
    }

    public Point getDirectionVector() {
        return directionVector;
    }
}
