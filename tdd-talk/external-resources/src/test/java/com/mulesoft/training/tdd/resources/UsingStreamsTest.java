package com.mulesoft.training.tdd.resources;

import com.mulesoft.training.spring.Point;

import org.junit.Test;

import java.io.*;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class UsingStreamsTest {
    private final PointBinaryFormat pointBinaryFormat = new PointBinaryFormat();
    private final PointStringFormat pointStringFormat = new PointStringFormat();

    @Test
    public void verifyBinaryOutput() throws IOException {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        try {

            pointBinaryFormat.write(output, new Point(2, 3));

            // toByteArray() returns an array with the written bytes, it's possible to use that byte array again
            byte[] data = output.toByteArray();

            // ints are stored into four bytes
            assertThat(data[0], equalTo((byte) 0));
            assertThat(data[1], equalTo((byte) 0));
            assertThat(data[2], equalTo((byte) 0));
            assertThat(data[3], equalTo((byte) 2));

            assertThat(data[4], equalTo((byte) 0));
            assertThat(data[5], equalTo((byte) 0));
            assertThat(data[6], equalTo((byte) 0));
            assertThat(data[7], equalTo((byte) 3));

        } finally {

            // NOTE: In this case output.close() does nothing because the stream is in memory, but it's a good practice
            // to always close streams, this is here just as an example.

            // Also in Java 7 this could be simplified by using try-with-resources:
            // http://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
            if (output != null) {
                output.close();
            }
        }
    }

    @Test
    public void passBinaryDataInsteadOfAFile() throws IOException {
        byte[] data = {0, 0, 0, 2, 0, 0, 0, 3};
        Point point = pointBinaryFormat.read(new ByteArrayInputStream(data));

        assertThat(point.getX(), is(2));
        assertThat(point.getY(), is(3));
    }

    @Test
    public void parseAPointFromATextFile() {
        StringReader input = new StringReader("10 20");
        Point point = pointStringFormat.parse(input);

        assertThat(point.getX(), is(10));
        assertThat(point.getY(), is(20));
    }

    @Test
    public void verifyTextOutput() throws IOException {
        StringWriter output = new StringWriter();
        pointStringFormat.write(output, new Point(20, 30));

        assertThat(output.toString(), is("20 30"));
    }
}
