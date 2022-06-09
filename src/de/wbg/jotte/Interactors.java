package de.wbg.jotte;

import java.nio.file.Path;
import java.util.List;

public class Interactors {

    public static List<FileInfo> start(String[] args) {

        Path path = null;
        try {
            path = CommandLine.getPath(args);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }

        List<String> filenames = CodeFileProvider.findSourceFilenames(path);

        List<FileInfo> fileInfos = Analyzer.analyzeFiles(filenames);

       return fileInfos;

    }
}
