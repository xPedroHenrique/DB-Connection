package View;

import Controller.ContaController;
import Controller.PessoaController;
import Model.Conta;
import Model.Pessoa;
import javax.swing.JOptionPane;

public class Gerencia extends javax.swing.JFrame {

    private final PessoaController pessoaController;
    private final ContaController contaController;

    public Gerencia() {
        initComponents();
        pessoaController = new PessoaController();
        contaController = new ContaController();
    }

    private void limparCampos() {
        this.nomeTitular.setText("");
        this.cpf.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        nomeTitular = new javax.swing.JTextField();
        senha = new javax.swing.JPasswordField();
        confirmaSenha = new javax.swing.JPasswordField();
        contaCorrente = new javax.swing.JRadioButton();
        contaPoupanca = new javax.swing.JRadioButton();
        contaSalario = new javax.swing.JRadioButton();
        tipoTitular = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cpf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cliente = new javax.swing.JButton();
        criarConta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nomeTitular.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nomeTitular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTitularActionPerformed(evt);
            }
        });

        senha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        confirmaSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        contaCorrente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        contaCorrente.setText("Conta Corrente");

        contaPoupanca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        contaPoupanca.setText("Conta Poupança");

        contaSalario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        contaSalario.setText("Conta Salário");

        tipoTitular.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pessoa Física", "Pessoa Juridica" }));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Nome do Titular:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Senha:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Confirmar Senha:");

        cpf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("CPF:");

        cliente.setText("Cliente");
        cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteActionPerformed(evt);
            }
        });

        criarConta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        criarConta.setText("Criar Conta");
        criarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarContaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(senha)
                    .addComponent(cpf)
                    .addComponent(nomeTitular)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cliente))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(270, 270, 270)
                                .addComponent(tipoTitular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(criarConta)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(contaCorrente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(contaPoupanca)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(contaSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addComponent(confirmaSenha))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cliente)
                .addGap(2, 2, 2)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeTitular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(criarConta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(tipoTitular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contaCorrente)
                    .addComponent(contaPoupanca)
                    .addComponent(contaSalario))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeTitularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTitularActionPerformed

    }//GEN-LAST:event_nomeTitularActionPerformed

    private void clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteActionPerformed
        this.dispose();
        new Cliente().setVisible(true);
    }//GEN-LAST:event_clienteActionPerformed

    private void criarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarContaActionPerformed
        // PEGA INFORMAÇÕES DA PESSOA
        String nome = this.nomeTitular.getText();
        String cpfOuCnpj = this.cpf.getText();
        String tipo = (String) this.tipoTitular.getSelectedItem();
        String Senha = new String(this.senha.getPassword());
        String confirmaSenha = new String(this.confirmaSenha.getPassword());

        if (!Senha.equals(confirmaSenha)) {
            JOptionPane.showMessageDialog(this, "Senha inválida! Digite novamente");
            return;
        }

        // CHAMA QUEM CRIA PESSOA
        Pessoa pessoa = pessoaController.criarPessoa(nome, cpfOuCnpj, tipo);

        // PEGAR INFORMAÇÕES DA CONTA
        boolean corrente = this.contaCorrente.isSelected();
        boolean poupanca = this.contaPoupanca.isSelected();
        boolean salario = this.contaSalario.isSelected();

        // CHAMA QUEM CRIA CONTA
        int numeroConta = contaController.criaConta(pessoa, corrente, poupanca, salario, Senha);

        JOptionPane.showMessageDialog(this, "Conta criada com sucesso. O número dela é: " + numeroConta);
        limparCampos();

        for (Conta c : main.Main.banco) {
            System.out.println("Número da conta: " + c.getNumero() + "\nTitular: " + c.getTitular().getNome());
        }
    }//GEN-LAST:event_criarContaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cliente;
    private javax.swing.JPasswordField confirmaSenha;
    private javax.swing.JRadioButton contaCorrente;
    private javax.swing.JRadioButton contaPoupanca;
    private javax.swing.JRadioButton contaSalario;
    private javax.swing.JTextField cpf;
    private javax.swing.JButton criarConta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nomeTitular;
    private javax.swing.JPasswordField senha;
    private javax.swing.JComboBox<String> tipoTitular;
    // End of variables declaration//GEN-END:variables
}
