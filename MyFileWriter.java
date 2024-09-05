package Activity1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFileWriter {
    private String fileName;

    public MyFileWriter(String fileName) {
        this.fileName = fileName;
    }

    public void writeToFile(String content) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
            writer.println(content);
            System.out.println("Content successfully written to the file.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        MyFileWriter fileWriter = new MyFileWriter("example.txt");
        fileWriter.writeToFile("Hello, World!");
        fileWriter.writeToFile("This is a new line.");
    }

    // System.out.println("This is a goofy change that will probably be deleted");
}