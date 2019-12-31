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

        menuCliente.setText("Cliente");

        itemMenuManutencao.setText("Manutenção");
        menuCliente.add(itemMenuManutencao);

        itemMenuPesquisar.setText("Pesquisar");
        menuCliente.add(itemMenuPesquisar);

        menuBarPrincipal.add(menuCliente);

        menuSair.setText("Sair");
        menuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSairMouseClicked(evt);
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
