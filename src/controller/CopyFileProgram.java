
package controller;

import common.Algorithm;
import view.Menu;


public class CopyFileProgram extends Menu<String> {

    static String[] options = {"Copy file", "Exit"};
    Algorithm ar;

    public CopyFileProgram() {
        super("========== COPY PROGRAM ==========", options);
        ar = new Algorithm();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                ar.readFileConfig();
                break;
            case 2:
                System.exit(0);
                break;
        }

    }

}
