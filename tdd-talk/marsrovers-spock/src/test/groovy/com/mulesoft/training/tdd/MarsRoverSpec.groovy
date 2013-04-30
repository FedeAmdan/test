package com.mulesoft.training.tdd

import spock.lang.Specification

import static com.mulesoft.training.tdd.CardinalPoint.NORTH

class MarsRoverSpec extends Specification {

    MarsRover rover;

    def setup() {
        rover = new MarsRover(10, 20, NORTH)
    }

    def "Rover's location is represented by a combination of x y coordinates"() {
        expect:
        rover.x == 10
        rover.y == 20
    }

    def "A rover heads into one cardinal compass point"() {
        expect:
        rover.heading == NORTH;
    }

    def "When a rover heads north, moving forwards means to increase the Y position"() {
        when:
        def previousY = rover.y
        rover.moveForward()

        then:
        rover.heading == NORTH
        rover.y == (previousY + 1)
    }
}
