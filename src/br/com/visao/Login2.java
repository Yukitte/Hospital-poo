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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        bGtipo = new javax.swing.ButtonGroup();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBlogin = new javax.swing.JButton();
        jTusuario = new javax.swing.JTextField();
        jLerro = new javax.swing.JLabel();
        jRfuncionario = new javax.swing.JRadioButton();
        jRcliente = new javax.swing.JRadioButton();
        jPsenha = new javax.swing.JPasswordField();
        jBcadastrar = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");
        jMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(600, 300));

        jLabel4.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Banco Malvader");

        jLabel1.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Usuário");

        jLabel2.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Senha");

        jBlogin.setBackground(new java.awt.Color(51, 51, 255));
        jBlogin.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jBlogin.setForeground(new java.awt.Color(255, 255, 255));
        jBlogin.setText("Login");
        jBlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBloginActionPerformed(evt);
            }
        });

        jTusuario.setColumns(4);

        bGtipo.add(jRfuncionario);
        jRfuncionario.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jRfuncionario.setForeground(new java.awt.Color(51, 51, 51));
        jRfuncionario.setText("Funcionário");

        bGtipo.add(jRcliente);
        jRcliente.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jRcliente.setForeground(new java.awt.Color(51, 51, 51));
        jRcliente.setText("Cliente");

        jBcadastrar.setBackground(new java.awt.Color(0, 0, 0));
        jBcadastrar.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jBcadastrar.setForeground(new java.awt.Color(255, 255, 255));
        jBcadastrar.setText("Cadastrar");
        jBcadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcadastrarActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBlogin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTusuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLerro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRfuncionario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRcliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPsenha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBcadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jLerro, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(100, 100, 100)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTusuario)
                            .addComponent(jPsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel4))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBcadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jRfuncionario)
                        .addGap(85, 85, 85)
                        .addComponent(jRcliente)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel4)
                .addGap(55, 55, 55)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jTusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jPsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(46, 46, 46)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRfuncionario)
                    .addComponent(jRcliente))
                .addGap(40, 40, 40)
                .addComponent(jBlogin)
                .addGap(18, 18, 18)
                .addComponent(jBcadastrar)
                .addGap(46, 46, 46)
                .addComponent(jLerro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
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
//        CadCliente cad = new CadCliente();
//        cad.setVisible(true);
//        this.dispose();
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
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLerro;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPasswordField jPsenha;
    private javax.swing.JRadioButton jRcliente;
    private javax.swing.JRadioButton jRfuncionario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTusuario;
    // End of variables declaration//GEN-END:variables
}
