package View;

import Controller.ContaController;
import Model.Conta;
import javax.swing.JOptionPane;

public class Cliente extends javax.swing.JFrame {

    private ContaController contaController;
    Conta conta = null;

    public Cliente() {
        initComponents();
        contaController = new ContaController();
        solicitaDocumentoCliente();
    }

    private void solicitaDocumentoCliente() {

        do {
            String doc = JOptionPane.showInputDialog("Informe seu documento (CPF/CNPJ) ");
            conta = (Conta) contaController.buscarContaDocumento(doc);

            if (conta != null) {
                boolean senhaValida = false;
                do {
                    String senha = JOptionPane.showInputDialog("Informe sua senha: ");
                    senhaValida = conta.validaSenha(senha);
                    if (senhaValida == false) {
                        JOptionPane.showMessageDialog(null, "Senha incorreta");
                    }
                } while (!senhaValida);
            }

        } while (conta == null);

        this.nomeTitular.setText(String.valueOf(conta.getNumero()));
        this.numeroConta.setText(conta.getTitular().getNome());
        this.saldo.setText("R$" + String.valueOf(conta.getSaldo()));
    }

    private String obterExtratoDoCliente(Conta conta) {
        String extrato = "";
        extrato += "ID: " + conta.getId() + "\n";
        extrato += "Data: " + conta.getData() + "\n";
        extrato += "N° Conta: " + conta.getNumero() + "\n";
        extrato += "Titular: " + conta.getTitular().getNome() + "\n";
        extrato += "Saldo: R$" + conta.getSaldo() + "\n";

        return extrato;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        voltar = new javax.swing.JButton();
        extrato = new javax.swing.JButton();
        depositar = new javax.swing.JButton();
        sacar = new javax.swing.JButton();
        transferir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        historicoTransacoes = new javax.swing.JTextArea();
        nomeTitular = new javax.swing.JTextField();
        numeroConta = new javax.swing.JTextField();
        saldo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        extrato.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        extrato.setText("Extrato");
        extrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extratoActionPerformed(evt);
            }
        });

        depositar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        depositar.setText("Depositar");
        depositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositarActionPerformed(evt);
            }
        });

        sacar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        sacar.setText("Sacar");
        sacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sacarActionPerformed(evt);
            }
        });

        transferir.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        transferir.setText("Transferir");
        transferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferirActionPerformed(evt);
            }
        });

        historicoTransacoes.setColumns(20);
        historicoTransacoes.setRows(5);
        jScrollPane1.setViewportView(historicoTransacoes);

        nomeTitular.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        numeroConta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        saldo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saldo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 55, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(voltar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(extrato, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sacar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(transferir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(depositar, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                                .addGap(43, 43, 43))))
                    .addComponent(numeroConta, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nomeTitular)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(voltar)
                .addGap(14, 14, 14)
                .addComponent(nomeTitular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numeroConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depositar)
                    .addComponent(extrato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sacar)
                    .addComponent(transferir))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void extratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extratoActionPerformed
        if (conta != null) {
            historicoTransacoes.setText(obterExtratoDoCliente(conta));
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma conta válida.");
        }
    }//GEN-LAST:event_extratoActionPerformed

    private void depositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositarActionPerformed
        String valor = JOptionPane.showInputDialog("Informe o valor a ser depositado:");
        double valorDeposito = Double.parseDouble(valor);

        this.contaController.depositar(this.conta, valorDeposito);

        this.saldo.setText("R$" + String.valueOf(conta.getSaldo()));
    }//GEN-LAST:event_depositarActionPerformed

    private void sacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sacarActionPerformed
        String valor = JOptionPane.showInputDialog("Informe o valor a ser sacado:");
        double valorDeposito = Double.parseDouble(valor);

        this.contaController.sacar(this.conta, valorDeposito);

        this.saldo.setText("R$" + String.valueOf(conta.getSaldo()));

    }//GEN-LAST:event_sacarActionPerformed

    private void transferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferirActionPerformed
        String resp = JOptionPane.showInputDialog("Informe para quem será a transferência (CPF/CNPJ): ");
        Conta pessoa = (Conta) contaController.buscarContaDocumento(resp);

        String valor = JOptionPane.showInputDialog("Informe o valor a ser transferido:");
        double valorTransferencia = Double.parseDouble(valor);

        conta = contaController.transferir(this.conta, pessoa, valorTransferencia);

        this.saldo.setText("R$" + String.valueOf(conta.getSaldo()));
    }//GEN-LAST:event_transferirActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        this.dispose();
        new Sistema().setVisible(true);
    }//GEN-LAST:event_voltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton depositar;
    private javax.swing.JButton extrato;
    private javax.swing.JTextArea historicoTransacoes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomeTitular;
    private javax.swing.JTextField numeroConta;
    private javax.swing.JButton sacar;
    private javax.swing.JTextField saldo;
    private javax.swing.JButton transferir;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
