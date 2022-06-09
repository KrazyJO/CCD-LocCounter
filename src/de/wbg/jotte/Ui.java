package de.wbg.jotte;

import java.util.List;

public class Ui {
    public static void printInfos(List<FileInfo> infos) {
        int totalLines = 0;
        int totalLinesOfCode = 0;

        for (FileInfo info : infos) {
            System.out.println(info.fileName + " " + info.getLines() + " " + info.getLinesOfCode());
            totalLines += info.getLines();
            totalLinesOfCode += info.getLinesOfCode();
        }

        System.out.println("Total: ");
        System.out.println("    Lines: " + totalLines);
        System.out.println("    LOC: " + totalLinesOfCode);
    }
}
