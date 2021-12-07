package gui;

import controles.*;
import javax.swing.*;
import java.awt.*;

public class Ui implements Runnable{

    private JFrame janela;

    @Override
    public void run() {

        janela = new JFrame("Lista ToDo");

        Components(janela.getContentPane());

        janela.setSize(400,800);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        janela.setVisible(true);

    }

    private void Components(Container container) {

        GroupLayout layout = new GroupLayout(container);
        container.setLayout(layout);

        JTextField campo = new JTextField(60);
        JButton adicionarBt = new JButton("Adicionar");
        JButton confirmarBt = new JButton("Confirmar");
        JButton removerBt = new JButton("Remover");

        Tela tela = new Tela();

        AddListener addListener = new AddListener(campo);
        adicionarBt.addActionListener(addListener);

        DoneListener doneListener = new DoneListener();
        confirmarBt.addActionListener(doneListener);

        RemoveListener removeListener = new RemoveListener();
        removerBt.addActionListener(removeListener);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createParallelGroup().addGroup(layout.createSequentialGroup().addComponent(campo).addComponent(adicionarBt).addComponent(removerBt).addComponent(confirmarBt)).addComponent(tela));
        layout.setVerticalGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup().addComponent(campo,10, 10, 30).addComponent(adicionarBt).addComponent(removerBt).addComponent(confirmarBt)).addComponent(tela));
    }
}
