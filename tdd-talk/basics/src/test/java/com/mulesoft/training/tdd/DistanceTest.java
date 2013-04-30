package com.mulesoft.training.tdd;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DistanceTest {
    /*
        1 km == 1 km
     */
    @Test
    public void oneKilometerEqualsToOneKilometer() {
        assertThat(Distance.km(1), equalTo(Distance.km(1)));
    }

    /*
        1 km == 1000 m
     */
    @Test
    public void oneKilometerEqualsOneThousandMeters() {
        assertThat(Distance.km(1), equalTo(Distance.meters(1000)));
    }

    /*
        1 km is displayed as "1 km"
     */
    @Test
    public void oneKilometerToString() {
        assertThat(Distance.km(1).toString(), is("1 km"));
    }

    /*
        1 m is displayed as "1 m"
     */
    @Test
    public void oneMeterToString() {
        assertThat(Distance.meters(1).toString(), is("1 m"));
    }

    /*
        1 km can be expressed as meters
     */
    @Test
    public void kmAsMeters() {
        assertThat(Distance.km(1).asMeters().toString(), is("1000 m"));
    }
}
