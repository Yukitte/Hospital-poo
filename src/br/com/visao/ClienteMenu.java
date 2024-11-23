package br.com.visao;

//@author User
import br.com.controle.Cliente;
import br.com.controle.Funcionario;
import br.com.controle.Usuario;
import br.com.util.SessaoUsuarioLogado;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ClienteMenu extends javax.swing.JFrame {
    private final Cliente userlogado;

//    public void setUserlogado(Cliente user) {
//        this.userlogado = user;
//    }
   
    public ClienteMenu(Cliente user) {
        this.userlogado = user;
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
       
       jLsaudacao.setText("Olá, " + this.userlogado.getNome_usuario());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG_cliente = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jBsair = new javax.swing.JButton();
        jBsaque = new javax.swing.JButton();
        jTBmostrarsaldo = new javax.swing.JToggleButton();
        jBdeposito = new javax.swing.JButton();
        jBconsultar = new javax.swing.JButton();
        jLsaldo = new javax.swing.JLabel();
        jLsaudacao = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jBsair.setBackground(new java.awt.Color(255, 51, 51));
        jBsair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBsair.setForeground(new java.awt.Color(255, 255, 255));
        jBsair.setText("Sair");
        jBsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsairActionPerformed(evt);
            }
        });

        jBsaque.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBsaque.setText("Saque");
        jBsaque.setMaximumSize(new java.awt.Dimension(80, 23));
        jBsaque.setMinimumSize(new java.awt.Dimension(80, 23));
        jBsaque.setName(""); // NOI18N
        jBsaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsaqueActionPerformed(evt);
            }
        });

        jTBmostrarsaldo.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jTBmostrarsaldo.setText("Mostrar saldo");
        jTBmostrarsaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBmostrarsaldoActionPerformed(evt);
            }
        });

        jBdeposito.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBdeposito.setText("Depósito");
        jBdeposito.setName(""); // NOI18N
        jBdeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBdepositoActionPerformed(evt);
            }
        });

        jBconsultar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBconsultar.setText("Consultar");
        jBconsultar.setName(""); // NOI18N
        jBconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBconsultarActionPerformed(evt);
            }
        });

        jLsaldo.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLsaldo.setForeground(new java.awt.Color(255, 255, 255));
        jLsaldo.setText("XXX");

        jLsaudacao.setBackground(new java.awt.Color(255, 255, 255));
        jLsaudacao.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLsaudacao, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBsair, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTBmostrarsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBdeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jBconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jBsaque, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLsaldo))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLsaudacao, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLsaldo)
                .addGap(18, 18, 18)
                .addComponent(jTBmostrarsaldo)
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBdeposito)
                    .addComponent(jBconsultar)
                    .addComponent(jBsaque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jBsair)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jMenu.setText("Opções");

        jMenuItem1.setText("Logout");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu.add(jMenuItem1);

        jMenuBar1.add(jMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Login2 frame = new Login2(userlogado);
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jBconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBconsultarActionPerformed
        ConsultaConta frame = new ConsultaConta(userlogado);
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBconsultarActionPerformed

    private void jBdepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdepositoActionPerformed
        try {
            Depositar frame = new Depositar(userlogado);
            frame.setVisible(true);
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(ClienteMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBdepositoActionPerformed

    private void jTBmostrarsaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBmostrarsaldoActionPerformed
        AbstractButton abstractButton = (AbstractButton)evt.getSource();
        boolean selected = abstractButton.getModel().isSelected();
        if (selected) {
            String senha = JOptionPane.showInputDialog(jPanel1, "Digite a senha de"
                + "usuário para vizializar o saldo.", "Confirmar usuário.", JOptionPane.INFORMATION_MESSAGE);

            if (this.userlogado.login(senha)) {
                jLsaldo.setText(" "+ this.userlogado.consultarSaldo());
                jTBmostrarsaldo.setText("Ocultar saldo");
            } else {
                JOptionPane.showMessageDialog(jPanel1, "Senha incorreta!", "Tente novamente.", JOptionPane.ERROR);
            }
        } else {
            jTBmostrarsaldo.setText("Mostrar saldo");
            jLsaldo.setText("XXX");
        }

    }//GEN-LAST:event_jTBmostrarsaldoActionPerformed

    private void jBsaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsaqueActionPerformed
        try {
            Sacar frame = new Sacar(userlogado);
            frame.setVisible(true);
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(ClienteMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBsaqueActionPerformed

    private void jBsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jBsairActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ClienteMenu(Cliente c).setVisible(true);
            }
        });        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BG_cliente;
    private javax.swing.JButton jBconsultar;
    private javax.swing.JButton jBdeposito;
    private javax.swing.JButton jBsair;
    private javax.swing.JButton jBsaque;
    private javax.swing.JLabel jLsaldo;
    private javax.swing.JLabel jLsaudacao;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jTBmostrarsaldo;
    // End of variables declaration//GEN-END:variables
}
