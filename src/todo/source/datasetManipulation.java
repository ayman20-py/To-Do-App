package todo.source;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
/* 
 *  This file is responsible for managing the database
 *  whether it is read or write the todo json file list.
 */

public class datasetManipulation {
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private static String filePath = "todos.json";
    private static Type todoListType = new TypeToken<List<String>>(){}.getType();

    // Ensures that the file and its folder exist. Create an empty JSON array if missing
    private static void ensureFile() {
        try {

            File file = new File(filePath);
            File parentFolder = file.getParentFile();

            if (parentFolder != null && !parentFolder.exists()) {parentFolder.mkdirs();}
            if (!file.exists()) {
                Writer writer = new FileWriter(file);
                writer.write("[]");
                writer.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Reading all data from the todos.json and returning it in form of List<Todos>. Return an empty list on empty
    public static <T> List<T> readJson() { 
        ensureFile();
        Reader reader = null;

        try {
            reader = new FileReader(filePath);
            List<T> data = gson.fromJson(reader, todoListType);
            if(data == null) return new ArrayList<T>();
            return data;
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        } finally {
            try { if (reader != null) reader.close(); } catch (Exception ignore) {}
        }

    }

    public static <T> void writeJson(List<T> data) {
        ensureFile();
        Writer writer = null;

        try {
            writer = new FileWriter(filePath, false);
            gson.toJson(data, todoListType, writer);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try { if (writer != null) writer.close(); } catch (Exception ignore) {}
        }


    }
}
