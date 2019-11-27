package Telas;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.awt.Color;





/**
 *
 * @author Igor Oliveira
 */
public class Tela_Principal extends javax.swing.JFrame {
    /**
     * Creates new form Tela_Principal
     */
    public Tela_Principal() {
        initComponents();
        
        getContentPane().setBackground(Color.white);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CadLeitor = new javax.swing.JButton();
        CadLivro = new javax.swing.JButton();
        ResLivro = new javax.swing.JButton();
        DevLivro = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        lblData = new javax.swing.JLabel();
        Data = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        CadLeitorMenu = new javax.swing.JMenuItem();
        CadLivroMenu = new javax.swing.JMenuItem();
        CadFuncMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        ConLeitorMenu = new javax.swing.JMenuItem();
        ConLivroMenu = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        SairMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BiblioSystem - Tela Principal");
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 680));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        CadLeitor.setBackground(new java.awt.Color(204, 204, 204));
        CadLeitor.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        CadLeitor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Adicionar Leitor.png"))); // NOI18N
        CadLeitor.setText("Cadastrar Leitor");
        CadLeitor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CadLeitor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        CadLeitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadLeitorActionPerformed(evt);
            }
        });

        CadLivro.setBackground(new java.awt.Color(204, 204, 204));
        CadLivro.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        CadLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Adicionar Livro.png"))); // NOI18N
        CadLivro.setText("Cadastrar Livro");
        CadLivro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CadLivro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        CadLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadLivroActionPerformed(evt);
            }
        });

        ResLivro.setBackground(new java.awt.Color(204, 204, 204));
        ResLivro.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        ResLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Reservar livro.png"))); // NOI18N
        ResLivro.setText("Empréstimo de Livro");
        ResLivro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ResLivro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ResLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResLivroActionPerformed(evt);
            }
        });

        DevLivro.setBackground(new java.awt.Color(204, 204, 204));
        DevLivro.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        DevLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Devolver Livro.png"))); // NOI18N
        DevLivro.setText("Devolução de Livro");
        DevLivro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        DevLivro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DevLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DevLivroActionPerformed(evt);
            }
        });

        botaoSair.setBackground(new java.awt.Color(204, 204, 204));
        botaoSair.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        botaoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Sair.png"))); // NOI18N
        botaoSair.setText("Sair");
        botaoSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        lblData.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        lblData.setText("Data");

        Data.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        Data.setText("Data:");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/bibliosystem.png"))); // NOI18N

        jMenuBar1.setPreferredSize(new java.awt.Dimension(155, 28));

        jMenu1.setText("Cadastros");
        jMenu1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(90, 22));

        CadLeitorMenu.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        CadLeitorMenu.setText("Cadastrar Leitor");
        CadLeitorMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadLeitorMenuActionPerformed(evt);
            }
        });
        jMenu1.add(CadLeitorMenu);

        CadLivroMenu.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        CadLivroMenu.setText("Cadastrar Livro");
        CadLivroMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadLivroMenuActionPerformed(evt);
            }
        });
        jMenu1.add(CadLivroMenu);

        CadFuncMenu.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        CadFuncMenu.setText("Cadastrar Funcionario");
        CadFuncMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadFuncMenuActionPerformed(evt);
            }
        });
        jMenu1.add(CadFuncMenu);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultas");
        jMenu2.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(90, 22));

        ConLeitorMenu.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        ConLeitorMenu.setText("Consultar Leitor");
        ConLeitorMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConLeitorMenuActionPerformed(evt);
            }
        });
        jMenu2.add(ConLeitorMenu);

        ConLivroMenu.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        ConLivroMenu.setText("Consultar Livro");
        ConLivroMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConLivroMenuActionPerformed(evt);
            }
        });
        jMenu2.add(ConLivroMenu);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Relatórios");
        jMenu3.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(90, 22));

        jMenuItem1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jMenuItem1.setText("Relatório de Empréstimo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jMenuItem2.setText("Relatório de Devolução");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        SairMenu.setText("Sair");
        SairMenu.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        SairMenu.setPreferredSize(new java.awt.Dimension(90, 22));
        SairMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SairMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(SairMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(CadLeitor, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(48, 48, 48)
                        .addComponent(Data)
                        .addGap(18, 18, 18)
                        .addComponent(lblData)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CadLivro)
                        .addGap(18, 18, 18)
                        .addComponent(ResLivro)
                        .addGap(18, 18, 18)
                        .addComponent(DevLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 276, Short.MAX_VALUE)
                        .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DevLivro)
                    .addComponent(CadLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CadLeitor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Data)
                            .addComponent(lblData)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel3)))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
    System.exit(0);
    }//GEN-LAST:event_botaoSairActionPerformed

    private void CadLeitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadLeitorActionPerformed
        Cadastro_Leitor Tela = new Cadastro_Leitor();
        Tela.setVisible(true);
    }//GEN-LAST:event_CadLeitorActionPerformed

    private void CadLeitorMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadLeitorMenuActionPerformed
       Cadastro_Leitor Tela = new Cadastro_Leitor();
       Tela.setVisible(true);
    }//GEN-LAST:event_CadLeitorMenuActionPerformed

    private void ResLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResLivroActionPerformed
        Tela_Emprestimo Tela = new Tela_Emprestimo();
        Tela.setVisible(true);
    }//GEN-LAST:event_ResLivroActionPerformed

    private void CadFuncMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadFuncMenuActionPerformed
        Cadastro_Funcionario Tela = new Cadastro_Funcionario();
        Tela.setVisible(true);
    }//GEN-LAST:event_CadFuncMenuActionPerformed

    private void CadLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadLivroActionPerformed
        Cadastro_Livro Tela = new Cadastro_Livro();
        Tela.setVisible(true);
    }//GEN-LAST:event_CadLivroActionPerformed

    private void CadLivroMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadLivroMenuActionPerformed
        Cadastro_Livro Tela = new Cadastro_Livro();
        Tela.setVisible(true);
    }//GEN-LAST:event_CadLivroMenuActionPerformed

    private void ConLeitorMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConLeitorMenuActionPerformed
        Consulta_Leitor Tela = new Consulta_Leitor();
        Tela.setVisible(true);
    }//GEN-LAST:event_ConLeitorMenuActionPerformed

    private void ConLivroMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConLivroMenuActionPerformed
        Consulta_Livro Tela = new Consulta_Livro();
        Tela.setVisible(true);
    }//GEN-LAST:event_ConLivroMenuActionPerformed

    private void SairMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMenuMouseClicked
        System.exit(0);
    }//GEN-LAST:event_SairMenuMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Date d = new Date();
        Calendar c = Calendar.getInstance();
        
        c.setTime(d);

        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        lblData.setText(df.format(c.getTime()) );
       
        

        
         
    }//GEN-LAST:event_formWindowActivated

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Relatorio_Emprestimos Tela = new Relatorio_Emprestimos();
            Tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void DevLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DevLivroActionPerformed
        Tela_Devolucao Tela = new Tela_Devolucao();
            Tela.setVisible(true);
    }//GEN-LAST:event_DevLivroActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Relatorio_Devolucao Tela = new Relatorio_Devolucao();
            Tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CadFuncMenu;
    private javax.swing.JButton CadLeitor;
    private javax.swing.JMenuItem CadLeitorMenu;
    private javax.swing.JButton CadLivro;
    private javax.swing.JMenuItem CadLivroMenu;
    private javax.swing.JMenuItem ConLeitorMenu;
    private javax.swing.JMenuItem ConLivroMenu;
    private javax.swing.JLabel Data;
    private javax.swing.JButton DevLivro;
    private javax.swing.JButton ResLivro;
    private javax.swing.JMenu SairMenu;
    private javax.swing.JButton botaoSair;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel lblData;
    // End of variables declaration//GEN-END:variables

}
