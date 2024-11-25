package br.com.visao;

import br.com.controle.Cliente;
import br.com.controle.Funcionario;
import br.com.entidade.ClienteDAO;
import br.com.entidade.FuncionarioDAO;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

//@author User
public class Login2 extends javax.swing.JFrame {
    
    //Creates new form tela
    public Login2() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        bGtipo = new javax.swing.ButtonGroup();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPsenha = new javax.swing.JPasswordField();
        jBcadastrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTusuario = new javax.swing.JTextField();
        jRfuncionario = new javax.swing.JRadioButton();
        jRcliente = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jBlogin = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");
        jMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(null);
        jPanel1.add(jPsenha);
        jPsenha.setBounds(270, 170, 140, 22);

        jBcadastrar.setBackground(new java.awt.Color(0, 0, 0));
        jBcadastrar.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jBcadastrar.setForeground(new java.awt.Color(255, 255, 255));
        jBcadastrar.setText("Cadastrar");
        jBcadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(jBcadastrar);
        jBcadastrar.setBounds(200, 350, 140, 25);

        jLabel2.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Senha");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 180, 140, 16);

        jLabel4.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Banco Malvader");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(190, 60, 220, 23);

        jTusuario.setColumns(4);
        jPanel1.add(jTusuario);
        jTusuario.setBounds(270, 130, 140, 22);

        jRfuncionario.setBackground(new java.awt.Color(0, 0, 0));
        bGtipo.add(jRfuncionario);
        jRfuncionario.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jRfuncionario.setForeground(new java.awt.Color(255, 255, 255));
        jRfuncionario.setText("Funcionário");
        jPanel1.add(jRfuncionario);
        jRfuncionario.setBounds(140, 240, 140, 21);

        jRcliente.setBackground(new java.awt.Color(0, 0, 0));
        bGtipo.add(jRcliente);
        jRcliente.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jRcliente.setForeground(new java.awt.Color(255, 255, 255));
        jRcliente.setText("Cliente");
        jPanel1.add(jRcliente);
        jRcliente.setBounds(320, 240, 140, 21);

        jLabel1.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuário");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(120, 130, 140, 16);

        jBlogin.setBackground(new java.awt.Color(51, 51, 255));
        jBlogin.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jBlogin.setForeground(new java.awt.Color(255, 255, 255));
        jBlogin.setText("Login");
        jBlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBloginActionPerformed(evt);
            }
        });
        jPanel1.add(jBlogin);
        jBlogin.setBounds(200, 300, 140, 25);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void jBloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBloginActionPerformed
        if (jRfuncionario.isSelected()) {
            Funcionario f = new Funcionario();
            f.setUser_usuario(jTusuario.getText());
            f.setTipo_usuario("FUNCIONARIO");
            
            boolean login = f.login(String.valueOf(jPsenha.getPassword()));

            if (login) {
                try {
                    Funcionario funcionariologado = FuncionarioDAO.findByUser(f.getUser_usuario());
                    FuncionarioMenu ftela = new FuncionarioMenu(funcionariologado);                    
                    ftela.setVisible(true);
                    this.dispose();
                    
                } catch (Exception ex) {
                    Logger.getLogger(Login2.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "O login falhou! Verifique a senha e usuário inserido.");
            }

        } else if (jRcliente.isSelected()) {
            Cliente c = new Cliente();
            c.setUser_usuario(jTusuario.getText());
            c.setTipo_usuario("CLIENTE");
            boolean login = c.login(String.valueOf(jPsenha.getPassword()));
            
            if (login) {                
                try {
                    Cliente clientelogado = ClienteDAO.findByUser(c.getUser_usuario());
                    ClienteMenu ftela = new ClienteMenu(clientelogado);                    
                    ftela.setVisible(true);
                    this.dispose();
                    
                } catch (Exception ex) {
                    Logger.getLogger(Login2.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "O login falhou! Verifique a senha e usuário inserido.");
            }

        } else {
            JOptionPane.showMessageDialog(null, "É necessário selecionar o tipo de usuário!");
        }

        bGtipo.clearSelection();
        jTusuario.setText("");
        jPsenha.setText("");
        jTusuario.requestFocus();
    }//GEN-LAST:event_jBloginActionPerformed
    
    private void jBcadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcadastrarActionPerformed
        CadaCliente cad = new CadaCliente();
        cad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBcadastrarActionPerformed

    //@param args the command line arguments
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login2().setVisible(true);
            }
        });  
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGtipo;
    private javax.swing.JButton jBcadastrar;
    private javax.swing.JButton jBlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPsenha;
    private javax.swing.JRadioButton jRcliente;
    private javax.swing.JRadioButton jRfuncionario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTusuario;
    // End of variables declaration//GEN-END:variables
}
