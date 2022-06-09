package de.wbg.jotte;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CommandLine {

    public static Path getPath(String[] args) throws Exception {
        if (args.length < 1) {
            throw new Exception();
        }

        File file = new File(args[0]);
        if (!file.isDirectory()) {
            throw new Exception();
        }

        return Paths.get(args[0]);
    }

}
