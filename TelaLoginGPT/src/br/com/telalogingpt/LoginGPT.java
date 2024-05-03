package br.com.telalogingpt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class LoginGPT extends JFrame implements ActionListener {
    private JTextField textFieldUsuario;
    private JPasswordField passwordFieldSenha;
    private JButton buttonLogin;
    private JButton buttonRegistrar;
    private Connection connection;

    public LoginGPT() {
        // Configurações básicas do frame
        setTitle("Tela de Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null); // Centraliza a janela na tela
        setLayout(new GridLayout(4, 2));

        // Componentes da tela
        JLabel labelUsuario = new JLabel("Usuário:");
        textFieldUsuario = new JTextField();
        JLabel labelSenha = new JLabel("Senha:");
        passwordFieldSenha = new JPasswordField();
        buttonLogin = new JButton("Login");
        buttonRegistrar = new JButton("Registrar");

        // Adicionando componentes ao frame
        add(labelUsuario);
        add(textFieldUsuario);
        add(labelSenha);
        add(passwordFieldSenha);
        add(buttonLogin);
        add(buttonRegistrar);

        // Adicionando listener para os botões
        buttonLogin.addActionListener(this);
        buttonRegistrar.addActionListener(this);

        // Conectar ao banco de dados SQLite
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:usuarios.db");
            criarTabelaUsuarios();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    private void criarTabelaUsuarios() throws SQLException {
        Statement statement = connection.createStatement();
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS usuarios (usuario TEXT PRIMARY KEY, senha TEXT)");
        statement.close();
    }

    private boolean verificarCredenciais(String usuario, String senha) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM usuarios WHERE usuario = ? AND senha = ?");
        preparedStatement.setString(1, usuario);
        preparedStatement.setString(2, senha);
        ResultSet resultSet = preparedStatement.executeQuery();
        boolean encontrado = resultSet.next();
        preparedStatement.close();
        return encontrado;
    }

    private void registrarUsuario(String usuario, String senha) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO usuarios (usuario, senha) VALUES (?, ?)");
        preparedStatement.setString(1, usuario);
        preparedStatement.setString(2, senha);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonLogin) {
            String usuario = textFieldUsuario.getText();
            String senha = new String(passwordFieldSenha.getPassword());

            try {
                if (verificarCredenciais(usuario, senha)) {
                    JOptionPane.showMessageDialog(this, "Login bem sucedido!");
                } else {
                    JOptionPane.showMessageDialog(this, "Usuário ou senha incorretos.", "Erro de login", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } else if (e.getSource() == buttonRegistrar) {
            String usuario = textFieldUsuario.getText();
            String senha = new String(passwordFieldSenha.getPassword());

            try {
                registrarUsuario(usuario, senha);
                JOptionPane.showMessageDialog(this, "Usuário registrado com sucesso!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Erro ao registrar usuário.", "Erro", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginGPT telaLogin = new LoginGPT();
            telaLogin.setVisible(true);
        });
    }
}
