package gui;

import javax.swing.*;
import java.awt.*;

public class Tela extends JPanel {

    public JTabbedPane tabbedPane;

    public Tela() {
        super (new GridLayout(1,1));

        tabbedPane = new JTabbedPane();
        JScrollPane telaNaoFeita = new JScrollPane();
        JScrollPane telaFeita = new JScrollPane();

        tabbedPane.addTab("Tarefas", telaNaoFeita);
        tabbedPane.addTab("Feito", telaFeita);

        add(tabbedPane);
    }

}
