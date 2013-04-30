package com.mulesoft.training.spring;


import org.junit.Before;
import org.junit.Test;

import com.mulesoft.training.spring.MarsRover;

import static com.mulesoft.training.spring.CardinalPoint.NORTH;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MarsRoverTest {
    private MarsRover rover;

    @Before
    public void setUpRover() {
        rover = new MarsRover(10, 20, NORTH);
    }

    /*
        Rover's location is represented by a combination of x y coordinates
     */
    @Test
    public void roverLocation() {
        assertThat(rover.getX(), is(10));
        assertThat(rover.getY(), is(20));
    }

    /*
        A rover heads into one cardinal compass point.
     */
    @Test
    public void roverHeadsToOneCardinalPoint() {
        assertThat(rover.getHeading(), is(NORTH));
    }

    /*
        When a rover heads north, moving forwards means to increase the Y position.
     */
    @Test
    public void moveForwardWhenHeadingNorth() {
        int previousY = rover.getY();

        assertThat(rover.getHeading(), is(NORTH));
        rover.moveForward();
        assertThat(rover.getY(), is(previousY + 1));
    }
}
