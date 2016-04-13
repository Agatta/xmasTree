package com.pgs.javadev;

import java.util.ArrayList;
import java.util.List;

public class XmasTreeCreator {

    public String createXmasTree(String text, int levels, int growDir) {
        String tree = "";
        int rows;
        switch (growDir) {
            case 1:
                rows = levels;
                for (int i = 1; i <= rows; i++) {
                    int chars = levels - 1  + i;
                    int spaces = levels - i;
                    tree += printLevel(chars, spaces, text) + printLineBreak(i, rows);
                }
                break;

            case 2:
                rows = levels;
                for (int i = 1; i <= rows; i++) {
                    int chars = levels * 2 - i;
                    int spaces = i - 1;
                    tree += printLevel(chars, spaces, text) + printLineBreak(i, rows);
                }
                break;

            case 3:
                rows = levels * 2 - 1;
                for (int i = 1; i <= rows; i++) {
                    if (i <= levels) {
                        int chars = i;
                        int spaces = 0;
                        tree += printLevel(chars, spaces, text) + printLineBreak(i, rows);
                    }
                    else  {
                        int chars =  rows + 1 - i;
                        int spaces = 0;
                        tree += printLevel(chars, spaces, text) + printLineBreak(i, rows);
                    }
                }
                break;

            case 4:
                rows = levels * 2 - 1;
                for (int i = 1; i <= rows; i++) {
                    if (i <= levels) {
                        int chars = levels;
                        int spaces = levels - i;
                        tree += printLevel(chars, spaces, text) + printLineBreak(i, rows);
                    }
                    else  {
                        int chars =  levels;
                        int spaces = i - levels;
                        tree += printLevel(chars, spaces, text) + printLineBreak(i, rows);
                    }
                }
                break;

            default:
                tree = "Coś poszło nie tak?";
                return tree;
        }
        return tree;
    }

    private String printLevel(int chars, int spaces, String text) {
        String line = "";
        for (int i = 0; i < chars; i++) {
            if (i < spaces) {
                line += " ";
            } else {
                line += text;
            }

        }
        return line;
    }

    private String printLineBreak (int i, int rows) {
        boolean isNotLastLevel = i < rows;
        if (isNotLastLevel) {
            return "\n";
        }
        else return "";
    }

}


