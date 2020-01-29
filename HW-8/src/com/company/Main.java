package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Frame frame = new Frame();
        SwingUtilities.invokeLater(() -> new Frame().Startup());

    }
}
