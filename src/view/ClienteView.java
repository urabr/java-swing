package view;

import javax.swing.JOptionPane;

public class ClienteView extends javax.swing.JFrame {

    public ClienteView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBarPrincipal = new javax.swing.JMenuBar();
        menuCliente = new javax.swing.JMenu();
        itemMenuManutencao = new javax.swing.JMenuItem();
        itemMenuPesquisar = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Clientes");
        setName("frmClienteView"); // NOI18N

        menuCliente.setMnemonic('C');
        menuCliente.setText("Cliente");

        itemMenuManutencao.setMnemonic('M');
        itemMenuManutencao.setText("Manutenção");
        itemMenuManutencao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMenuManutencaoMouseClicked(evt);
            }
        });
        itemMenuManutencao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuManutencaoActionPerformed(evt);
            }
        });
        menuCliente.add(itemMenuManutencao);

        itemMenuPesquisar.setMnemonic('P');
        itemMenuPesquisar.setText("Pesquisar");
        itemMenuPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMenuPesquisarMouseClicked(evt);
            }
        });
        itemMenuPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuPesquisarActionPerformed(evt);
            }
        });
        menuCliente.add(itemMenuPesquisar);

        menuBarPrincipal.add(menuCliente);

        menuSair.setMnemonic('r');
        menuSair.setText("Sair");
        menuSair.setToolTipText("");
        menuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSairMouseClicked(evt);
            }
        });
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        menuBarPrincipal.add(menuSair);

        setJMenuBar(menuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSairMouseClicked
        String msg = "Deseja sair do sistema?";
        int opcao = JOptionPane.showConfirmDialog(null, msg, "Confirmação", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_menuSairMouseClicked

    private void itemMenuManutencaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMenuManutencaoMouseClicked
        
    }//GEN-LAST:event_itemMenuManutencaoMouseClicked

    private void itemMenuPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMenuPesquisarMouseClicked
        
    }//GEN-LAST:event_itemMenuPesquisarMouseClicked

    private void itemMenuManutencaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuManutencaoActionPerformed
        new ManutencaoView().show();
    }//GEN-LAST:event_itemMenuManutencaoActionPerformed

    private void itemMenuPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuPesquisarActionPerformed
        new PesquisaView().show();
    }//GEN-LAST:event_itemMenuPesquisarActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        
    }//GEN-LAST:event_menuSairActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemMenuManutencao;
    private javax.swing.JMenuItem itemMenuPesquisar;
    private javax.swing.JMenuBar menuBarPrincipal;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenu menuSair;
    // End of variables declaration//GEN-END:variables
}
