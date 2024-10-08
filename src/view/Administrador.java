/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import servicos.GeradorRelatorioPDF;

/**
 *
 * @author 182310076
 */
public class Administrador extends javax.swing.JFrame {

    /**
     * Creates new form Administrador
     */
    public Administrador() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTecnicos = new javax.swing.JTable();
        jScrollPaneListaProjeto = new javax.swing.JScrollPane();
        jTableOrdemdeServico = new javax.swing.JTable();
        jScrollPaneTecnico = new javax.swing.JScrollPane();
        jTableProjetos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuAdministrador = new javax.swing.JMenuBar();
        jMenuCriarAdministrador = new javax.swing.JMenu();
        jMenuItemCriarTecnico = new javax.swing.JMenuItem();
        jMenuItemCriarProjeto = new javax.swing.JMenuItem();
        jMenuCriarRelatorio = new javax.swing.JMenu();
        jMenuItemRelatorioOS = new javax.swing.JMenuItem();
        jMenuEditarAdministrador = new javax.swing.JMenu();
        jMenuItemEditarTécnico = new javax.swing.JMenuItem();
        jMenuItemEditarProjeto = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableTecnicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableTecnicos);

        jTableOrdemdeServico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Data de Criação", "Condição", "Descrição", "Técnico"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneListaProjeto.setViewportView(jTableOrdemdeServico);
        if (jTableOrdemdeServico.getColumnModel().getColumnCount() > 0) {
            jTableOrdemdeServico.getColumnModel().getColumn(0).setResizable(false);
            jTableOrdemdeServico.getColumnModel().getColumn(1).setResizable(false);
            jTableOrdemdeServico.getColumnModel().getColumn(2).setResizable(false);
            jTableOrdemdeServico.getColumnModel().getColumn(3).setResizable(false);
            jTableOrdemdeServico.getColumnModel().getColumn(4).setResizable(false);
        }

        jTableProjetos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPaneTecnico.setViewportView(jTableProjetos);

        jLabel1.setText("Ordem de Serviços:");

        jLabel2.setText("Projetos:");

        jLabel3.setText("Técnicos:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(33, 33, 33)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                    .addComponent(jScrollPaneTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPaneListaProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPaneListaProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jScrollPaneTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(86, 86, 86))))
        );

        jMenuCriarAdministrador.setText("Criar");

        jMenuItemCriarTecnico.setText("Criar Técnico");
        jMenuItemCriarTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCriarTecnicoActionPerformed(evt);
            }
        });
        jMenuCriarAdministrador.add(jMenuItemCriarTecnico);

        jMenuItemCriarProjeto.setText("Criar Projeto");
        jMenuCriarAdministrador.add(jMenuItemCriarProjeto);

        jMenuCriarRelatorio.setText("Criar Relatórios");

        jMenuItemRelatorioOS.setText("Ordem de Serviço");
        jMenuItemRelatorioOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelatorioOSActionPerformed(evt);
            }
        });
        jMenuCriarRelatorio.add(jMenuItemRelatorioOS);

        jMenuCriarAdministrador.add(jMenuCriarRelatorio);

        jMenuAdministrador.add(jMenuCriarAdministrador);

        jMenuEditarAdministrador.setText("Editar/Deletar");

        jMenuItemEditarTécnico.setText("Editar/Deletar Técnico");
        jMenuEditarAdministrador.add(jMenuItemEditarTécnico);

        jMenuItemEditarProjeto.setText("Editar/Deletar Projeto");
        jMenuEditarAdministrador.add(jMenuItemEditarProjeto);

        jMenuAdministrador.add(jMenuEditarAdministrador);

        setJMenuBar(jMenuAdministrador);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCriarTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCriarTecnicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemCriarTecnicoActionPerformed

    private void jMenuItemRelatorioOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelatorioOSActionPerformed
        // TODO add your handling code here:
        GeradorRelatorioPDF GerarOS = new GeradorRelatorioPDF();
        GerarOS.gerarRelatorioOrdemDeServico(ordens);
    }//GEN-LAST:event_jMenuItemRelatorioOSActionPerformed

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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuAdministrador;
    private javax.swing.JMenu jMenuCriarAdministrador;
    private javax.swing.JMenu jMenuCriarRelatorio;
    private javax.swing.JMenu jMenuEditarAdministrador;
    private javax.swing.JMenuItem jMenuItemCriarProjeto;
    private javax.swing.JMenuItem jMenuItemCriarTecnico;
    private javax.swing.JMenuItem jMenuItemEditarProjeto;
    private javax.swing.JMenuItem jMenuItemEditarTécnico;
    private javax.swing.JMenuItem jMenuItemRelatorioOS;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneListaProjeto;
    private javax.swing.JScrollPane jScrollPaneTecnico;
    private javax.swing.JTable jTableOrdemdeServico;
    private javax.swing.JTable jTableProjetos;
    private javax.swing.JTable jTableTecnicos;
    // End of variables declaration//GEN-END:variables
}
