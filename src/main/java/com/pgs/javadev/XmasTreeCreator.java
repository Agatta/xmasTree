package com.pgs.javadev;

import java.util.ArrayList;
import java.util.List;

public class XmasTreeCreator {

    public String createXmasTree(String text, int levels) {

        String tree = "";

        for (int i = 0; i < levels; i++) {
            if (i < levels -1 ) {
                tree += printLevel(levels, i, text) + "\n";
            }
            else {
                tree += printLevel(levels, i, text);
            }

        }


        return tree;
    }

    private String printLevel(int level, int currentLevel, String text) {
        String space = "";
        String body = "";
        for (int i = 0; i < level - currentLevel - 1; i++) {
            space += " ";
        }
        for (int i = 0; i < currentLevel * 2 + 1; i++) {
            body += text;
        }
        space +=  body;
        return space;

    }

}


