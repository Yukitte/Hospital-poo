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
       
       jLsaudacao.setText("Olá, " + this.userlogado.getNome_usuario());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG_cliente = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jBsaque = new javax.swing.JButton();
        jBdeposito = new javax.swing.JButton();
        jBconsultar = new javax.swing.JButton();
        jBsair = new javax.swing.JButton();
        jLsaldo = new javax.swing.JLabel();
        jTBmostrarsaldo = new javax.swing.JToggleButton();
        jLsaudacao = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        jBsair.setBackground(new java.awt.Color(255, 51, 51));
        jBsair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBsair.setForeground(new java.awt.Color(255, 255, 255));
        jBsair.setText("Sair");
        jBsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsairActionPerformed(evt);
            }
        });

        jLsaldo.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLsaldo.setForeground(new java.awt.Color(51, 0, 51));
        jLsaldo.setText("XXX");

        jTBmostrarsaldo.setText("Mostrar saldo");
        jTBmostrarsaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBmostrarsaldoActionPerformed(evt);
            }
        });

        jLsaudacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jDesktopPane1.setLayer(jBsaque, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBdeposito, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBconsultar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBsair, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLsaldo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTBmostrarsaldo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLsaudacao, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLsaudacao, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTBmostrarsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLsaldo))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jBdeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBsair, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(jBsaque, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLsaudacao, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLsaldo)
                .addGap(18, 18, 18)
                .addComponent(jTBmostrarsaldo)
                .addGap(116, 116, 116)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBdeposito)
                    .addComponent(jBconsultar)
                    .addComponent(jBsaque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(jBsair)
                .addContainerGap(125, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void jBsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jBsairActionPerformed

    private void jBsaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsaqueActionPerformed
        try {
            Sacar frame = new Sacar(userlogado);
            frame.setVisible(true);
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(ClienteMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBsaqueActionPerformed

    private void jTBmostrarsaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBmostrarsaldoActionPerformed
        AbstractButton abstractButton = (AbstractButton)evt.getSource();
        boolean selected = abstractButton.getModel().isSelected();
        if (selected) {
            String senha = JOptionPane.showInputDialog(jDesktopPane1, "Digite a senha de"
                + "usuário para vizializar o saldo.", "Confirmar usuário.", JOptionPane.INFORMATION_MESSAGE);
                
            if (this.userlogado.login(senha)) {                
                jLsaldo.setText(" "+ this.userlogado.consultarSaldo());
                jTBmostrarsaldo.setText("Ocultar saldo");
            } else {
                JOptionPane.showMessageDialog(jDesktopPane1, "Senha incorreta!", "Tente novamente.", JOptionPane.ERROR);
            }
        } else {
            jTBmostrarsaldo.setText("Mostrar saldo");
            jLsaldo.setText("XXX");
        }
        
    }//GEN-LAST:event_jTBmostrarsaldoActionPerformed

    private void jBdepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdepositoActionPerformed
        try {
            Depositar frame = new Depositar(userlogado);
            frame.setVisible(true);
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(ClienteMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBdepositoActionPerformed

    private void jBconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBconsultarActionPerformed
        ConsultaConta frame = new ConsultaConta(userlogado);
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBconsultarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Login2 frame = new Login2();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLsaldo;
    private javax.swing.JLabel jLsaudacao;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JToggleButton jTBmostrarsaldo;
    // End of variables declaration//GEN-END:variables
}
