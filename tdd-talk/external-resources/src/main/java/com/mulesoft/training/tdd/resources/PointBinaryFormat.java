package com.mulesoft.training.tdd.resources;

import com.mulesoft.training.spring.Point;

import java.io.*;

public class PointBinaryFormat {
    public void write(OutputStream output, Point point) throws IOException {
        DataOutputStream dataOut = new DataOutputStream(output);
        dataOut.writeInt(point.getX());
        dataOut.writeInt(point.getY());
    }

    public Point read(InputStream input) throws IOException {
        DataInputStream dataIn = new DataInputStream(input);
        return new Point(dataIn.readInt(), dataIn.readInt());
    }
}
