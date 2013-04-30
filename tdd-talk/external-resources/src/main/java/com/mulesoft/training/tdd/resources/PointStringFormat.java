package com.mulesoft.training.tdd.resources;

import com.mulesoft.training.spring.Point;

import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Scanner;

public class PointStringFormat {
    public Point parse(Reader input) {
        Scanner scanner = new Scanner(input);
        return new Point(scanner.nextInt(), scanner.nextInt());
    }

    public void write(Writer output, Point point) throws IOException {
        output.write(point.getX() + " " + point.getY());
    }
}
