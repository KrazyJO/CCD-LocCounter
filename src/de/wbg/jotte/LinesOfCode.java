package de.wbg.jotte;

import java.util.List;

public class LinesOfCode {

    public static FileInfo countLines(String fileName, List<String> fileContent) {
        // count lines
        FileInfo info = new FileInfo();
        info.setFileName(fileName);

        int loc = 0;
        for (String line : fileContent) {
            if (!isComment(line)) {
                loc++;
            }
        }

        info.setLines(fileContent.size());
        info.setLinesOfCode(loc);

        return info;
    }

    private static boolean isComment(String line) {
        return line.startsWith("#") || line.startsWith("//");
    }
}
