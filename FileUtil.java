import java.io.*;
import java.util.*;

public class FileUtil {

    public static void write(String file, String data) {
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write(data + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> read(String file) {
        List<String> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void overwrite(String file, List<String> data) {
        try (FileWriter fw = new FileWriter(file)) {
            for (String d : data) {
                fw.write(d + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}