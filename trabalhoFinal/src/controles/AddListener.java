package controles;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddListener implements ActionListener {

    private JTextField tarefaCampo;

    public AddListener(JTextField campo) {

        this.tarefaCampo = campo;

    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if (tarefaCampo.getText().length() > 0) {
            this.tarefaCampo.setText(null);
        }

    }
}
