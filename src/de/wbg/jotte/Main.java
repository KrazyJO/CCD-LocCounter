package de.wbg.jotte;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<FileInfo> infos = Interactors.start(args);
        Ui.printInfos(infos);
    }
}
