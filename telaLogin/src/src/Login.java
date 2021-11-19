import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class telaLogin extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel usuario = new JLabel("Usuario:");
    JLabel senha = new JLabel("Senha:");
    JTextField campoUsuario = new JTextField();
    JPasswordField campoSenha = new JPasswordField();
    JButton botaoLogin = new JButton("Login");
    JButton resetarCampos = new JButton("Resetar");
    JLabel loginEfetuado = new JLabel("Login efetuado com sucesso!");

    telaLogin() {

        setLayoutContainer();
        setTamanho();
        addConteudoContainer();
        addAcao();

    }

    public void setLayoutContainer() {
        container.setLayout(null);
    }

    private void setTamanho() {

        usuario.setBounds(50,100,100,30);
        senha.setBounds(50,150,100,30);
        campoUsuario.setBounds(120,100,200,30);
        campoSenha.setBounds(120,150,200,30);
        botaoLogin.setBounds(75,250,100,40);
        resetarCampos.setBounds(200,250,100,40);
        loginEfetuado.setBounds(100,300,200,40);

    }

    private void addConteudoContainer() {

        container.add(usuario);
        container.add(senha);
        container.add(campoUsuario);
        container.add(campoSenha);
        container.add(botaoLogin);
        container.add(resetarCampos);
        container.add(loginEfetuado);
        loginEfetuado.setVisible(false);

    }

    private void addAcao() {

        resetarCampos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                campoUsuario.setText("");
                campoSenha.setText("");
            }
        });

        botaoLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginEfetuado.setVisible(true);
                String usuario = campoUsuario.getText();
                String senha = campoSenha.getText();
                System.out.println("Usuário: " + usuario + " | Senha: " + senha);
            }
        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

public class Login {
    public static void main(String[] args) {

        telaLogin tela = new telaLogin();
        tela.setTitle("Login");
        tela.setVisible(true);
        tela.setBounds(10,10,400,400);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLocationRelativeTo(null);
        tela.setResizable(false);

    }
}
