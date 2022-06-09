package de.wbg.jotte;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CodeFileProvider {

    public static List<String> findSourceFilenames(Path path) {
        List<String> filesNames = new ArrayList<>();
        File directory = new File(path.toString());
        File[] files = directory.listFiles();

        for (File f : files) {
            if (f.getAbsolutePath().endsWith(".java")) {
                filesNames.add(f.getAbsolutePath());
            }
        }

        return filesNames;
    }
}
