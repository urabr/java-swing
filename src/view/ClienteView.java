package view;

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
