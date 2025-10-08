package todo;

import todo.source.Todos;
import todo.source.datasetManipulation;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Todos x = new Todos("T001", "Hello This is the content", "2025-10-08", "NA");

        List<String> y = datasetManipulation.readJson();
        System.out.println(y);


    }
}