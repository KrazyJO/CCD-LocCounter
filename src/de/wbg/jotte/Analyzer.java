package de.wbg.jotte;

import java.util.ArrayList;
import java.util.List;

public class Analyzer {

    public static List<FileInfo> analyzeFiles(List<String> filenames) {
        List<FileInfo> infos = new ArrayList<>();

        for (String fileName : filenames) {
            List<String> lines = FileProvider.ReadFile(fileName);
            FileInfo info = LinesOfCode.countLines(fileName, lines);
            infos.add(info);
        }

        return infos;
    }

}
