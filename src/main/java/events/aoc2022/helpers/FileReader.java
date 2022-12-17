package events.aoc2022.helpers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


public class FileReader {

    /**
     *
     * @param name Name of the File
     * @return contents of given file
     * @throws IOException
     */
    public static List<String> ReadFromFile(String name) throws IOException {
        return Files.readAllLines(Path.of("src/main/resources/"+name));

    }

}
