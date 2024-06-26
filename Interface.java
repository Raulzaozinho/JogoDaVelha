public class Interface extends javax.swing.JDialog {
    private boolean jogador1, jogador2;
    private String marcacao;

    public Interface(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        jLStatus.setText("CTRL+N para um novo jogo!");
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        TelaSobre = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PainelBotoes = new javax.swing.JPanel();
        jB00 = new javax.swing.JButton();
        jB01 = new javax.swing.JButton();
        jB02 = new javax.swing.JButton();
        jB10 = new javax.swing.JButton();
        jB11 = new javax.swing.JButton();
        jB12 = new javax.swing.JButton();
        jB20 = new javax.swing.JButton();
        jB21 = new javax.swing.JButton();
        jB22 = new javax.swing.JButton();
        jLStatus = new javax.swing.JLabel();
        jMenu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        TelaSobre.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        TelaSobre.setTitle("Sobre");
        TelaSobre.setMinimumSize(new java.awt.Dimension(350, 196));
        TelaSobre.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        TelaSobre.setPreferredSize(new java.awt.Dimension(400, 250));
        TelaSobre.setResizable(false);
        TelaSobre.setType(java.awt.Window.Type.POPUP);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36));  
        jLabel1.setText("Jogo Da Velha");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); 
        jLabel3.setText("by Raulzão");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Contato para os homens que desejam treinar");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("peito juntos: (61) 9 99585-2502");

        javax.swing.GroupLayout TelaSobreLayout = new javax.swing.GroupLayout(TelaSobre.getContentPane());
        TelaSobre.getContentPane().setLayout(TelaSobreLayout);
        TelaSobreLayout.setHorizontalGroup(
            TelaSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaSobreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TelaSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(TelaSobreLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );
        TelaSobreLayout.setVerticalGroup(
            TelaSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaSobreLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        TelaSobre.getAccessibleContext().setAccessibleParent(TelaSobre);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Jogo Da Velha by raul.costa@undf.edu.br");
        setBackground(java.awt.Color.blue);
        setModalityType(null);
        setResizable(false);

        PainelBotoes.setLayout(new java.awt.GridLayout(3, 3, -1, -1));

        jB00.setBackground(new java.awt.Color(51, 153, 255));
        jB00.setFont(new java.awt.Font("Tahoma", 1, 48)); 
        jB00.setForeground(new java.awt.Color(255, 255, 255));
        jB00.setToolTipText("");
        jB00.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jB00.setEnabled(false);
        jB00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB00ActionPerformed(evt);
            }
        });
        PainelBotoes.add(jB00);

        jB01.setBackground(new java.awt.Color(51, 153, 255));
        jB01.setFont(new java.awt.Font("Tahoma", 1, 48)); 
        jB01.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jB01.setEnabled(false);
        jB01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB01ActionPerformed(evt);
            }
        });
        PainelBotoes.add(jB01);

        jB02.setBackground(new java.awt.Color(51, 153, 255));
        jB02.setFont(new java.awt.Font("Tahoma", 1, 48)); 
        jB02.setForeground(new java.awt.Color(255, 255, 255));
        jB02.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jB02.setEnabled(false);
        jB02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB02ActionPerformed(evt);
            }
        });
        PainelBotoes.add(jB02);

        jB10.setBackground(new java.awt.Color(51, 153, 255));
        jB10.setFont(new java.awt.Font("Tahoma", 1, 48));
        jB10.setForeground(new java.awt.Color(255, 255, 255));
        jB10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jB10.setEnabled(false);
        jB10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB10ActionPerformed(evt);
            }
        });
        PainelBotoes.add(jB10);

        jB11.setBackground(new java.awt.Color(51, 153, 255));
        jB11.setFont(new java.awt.Font("Tahoma", 1, 48));
        jB11.setForeground(new java.awt.Color(255, 255, 255));
        jB11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jB11.setEnabled(false);
        jB11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB11ActionPerformed(evt);
            }
        });
        PainelBotoes.add(jB11);

        jB12.setBackground(new java.awt.Color(51, 153, 255));
        jB12.setFont(new java.awt.Font("Tahoma", 1, 48)); 
        jB12.setForeground(new java.awt.Color(255, 255, 255));
        jB12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jB12.setEnabled(false);
        jB12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB12ActionPerformed(evt);
            }
        });
        PainelBotoes.add(jB12);

        jB20.setBackground(new java.awt.Color(51, 153, 255));
        jB20.setFont(new java.awt.Font("Tahoma", 1, 48)); 
        jB20.setForeground(new java.awt.Color(255, 255, 255));
        jB20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jB20.setEnabled(false);
        jB20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB20ActionPerformed(evt);
            }
        });
        PainelBotoes.add(jB20);

        jB21.setBackground(new java.awt.Color(51, 153, 255));
        jB21.setFont(new java.awt.Font("Tahoma", 1, 48)); 
        jB21.setForeground(new java.awt.Color(255, 255, 255));
        jB21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jB21.setEnabled(false);
        jB21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB21ActionPerformed(evt);
            }
        });
        PainelBotoes.add(jB21);

        jB22.setBackground(new java.awt.Color(51, 153, 255));
        jB22.setFont(new java.awt.Font("Tahoma", 1, 48)); 
        jB22.setForeground(new java.awt.Color(255, 255, 255));
        jB22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jB22.setEnabled(false);
        jB22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB22ActionPerformed(evt);
            }
        });
        PainelBotoes.add(jB22);

        jLStatus.setBackground(new java.awt.Color(51, 153, 235));
        jLStatus.setFont(new java.awt.Font("Arial", 1, 12)); 
        jLStatus.setForeground(new java.awt.Color(0, 61, 234));
        jLStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLStatus.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jMenu1.setText("Arquivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Novo");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Finalizar Partida");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Sair");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenu.add(jMenu1);

        jMenu2.setText("Sobre");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu.add(jMenu2);

        setJMenuBar(jMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {
        TelaSobre.setVisible(true);
    }

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {
        this.novo();
    }

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
        this.novo();
    }

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {
        this.finalizarPartida();
    }

    private void jB00ActionPerformed(java.awt.event.ActionEvent evt) {
        this.jogar(jB00);
    }

    private void jB01ActionPerformed(java.awt.event.ActionEvent evt) {
        this.jogar(jB01);
    }

    private void jB02ActionPerformed(java.awt.event.ActionEvent evt) {
        this.jogar(jB02);
    }

    private void jB10ActionPerformed(java.awt.event.ActionEvent evt) {
        this.jogar(jB10);
    }

    private void jB11ActionPerformed(java.awt.event.ActionEvent evt) {
        this.jogar(jB11);
    }

    private void jB12ActionPerformed(java.awt.event.ActionEvent evt) {
        this.jogar(jB12);
    }

    private void jB20ActionPerformed(java.awt.event.ActionEvent evt) {
        this.jogar(jB20);
    }

    private void jB21ActionPerformed(java.awt.event.ActionEvent evt) {
        this.jogar(jB21);
    }

    private void jB22ActionPerformed(java.awt.event.ActionEvent evt) {
        this.jogar(jB22);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Interface dialog = new Interface(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    private javax.swing.JPanel PainelBotoes;
    private javax.swing.JDialog TelaSobre;
    private javax.swing.JButton jB00;
    private javax.swing.JButton jB01;
    private javax.swing.JButton jB02;
    private javax.swing.JButton jB10;
    private javax.swing.JButton jB11;
    private javax.swing.JButton jB12;
    private javax.swing.JButton jB20;
    private javax.swing.JButton jB21;
    private javax.swing.JButton jB22;
    private javax.swing.JLabel jLStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
   

private void limpar(){
    jB00.setText(null);
    jB01.setText(null);
    jB02.setText(null);
    jB10.setText(null);
    jB11.setText(null);
    jB12.setText(null);
    jB20.setText(null);
    jB21.setText(null);
    jB22.setText(null);
    jLStatus.setText(null);
}

private void desabilitaCampos(){
    jB00.setEnabled(false);
    jB01.setEnabled(false);
    jB02.setEnabled(false);
    jB10.setEnabled(false);
    jB11.setEnabled(false);
    jB12.setEnabled(false);
    jB20.setEnabled(false);
    jB21.setEnabled(false);
    jB22.setEnabled(false);
}

private void habilitaCampos(){
    jB00.setEnabled(true);
    jB01.setEnabled(true);
    jB02.setEnabled(true);
    jB10.setEnabled(true);
    jB11.setEnabled(true);
    jB12.setEnabled(true);
    jB20.setEnabled(true);
    jB21.setEnabled(true);
    jB22.setEnabled(true);
}

private void novo(){
    limpar();
    habilitaCampos();
    habilitaJogador1();
    jLStatus.setText("Partida iniciada!");
}

private void finalizarPartida(){
    limpar();
    desabilitaCampos();
    jLStatus.setText("Partida finalizada!");
}

private void habilitaJogador1(){
    this.jogador1 = true;
    this.jogador2 = false;
    this.marcacao = "X";
    jLStatus.setText("Aguardando jogador 1!");
}

private void habilitaJogador2(){
    this.jogador1 = false;
    this.jogador2 = true;
    this.marcacao = "0";
    jLStatus.setText("Aguardando jogador 2!");
}

private void controleDeJogada(){
    if(jogador1 == true){
        habilitaJogador2();
    }
    else{
        habilitaJogador1();
    }
}

private void jogar(javax.swing.JButton botao){
    if(botao.getText() == null){
        botao.setText(marcacao);
        controleDeJogada();
        verificaGanhador();
    }
    else{
        jLStatus.setText("Jogada inválida!");
    }
}

private String[][] coletarJogadas(){
    String[][] jogadas = new String[3][3];
    jogadas[0][0] = jB00.getText();
    jogadas[0][1] = jB01.getText();
    jogadas[0][2] = jB02.getText();
    jogadas[1][0] = jB10.getText();
    jogadas[1][1] = jB11.getText();
    jogadas[1][2] = jB12.getText();
    jogadas[2][0] = jB20.getText();
    jogadas[2][1] = jB21.getText();
    jogadas[2][2] = jB22.getText();
    return jogadas;
}

private void ganhou(int ganhador){
    desabilitaCampos();
    if(ganhador == 1){
        jLStatus.setText("O jogador n° 1 venceu!");
    }
    else{
        jLStatus.setText("O jogador n° 2 venceu!");
    }
}

private void verificaGanhador(){
    String [][] jogada = coletarJogadas();
    String um = "X", dois = "0";
    
    if((jogada[0][0] != null) && (jogada[1][1] != null) && (jogada[2][2] != null)){
        if((jogada[0][0].equals(um)) && (jogada[1][1].equals(um)) && (jogada[2][2].equals(um))){
            ganhou(1);
            return;
        }
        if((jogada[0][0].equals(dois)) && (jogada[1][1].equals(dois)) && (jogada[2][2].equals(dois))){
            ganhou(2);
            return;
        }
    }
    
    if((jogada[0][2] != null) && (jogada[1][1] != null) && (jogada[2][0] != null)){
        if((jogada[0][2].equals(um)) && (jogada[1][1].equals(um)) && (jogada[2][0].equals(um))){
            ganhou(1);
            return;
        }
        if((jogada[0][2].equals(dois)) && (jogada[1][1].equals(dois)) && (jogada[2][0].equals(dois))){
            ganhou(2);
            return;
        }
    }
    
    if((jogada[0][0] != null) && (jogada[0][1] != null) && (jogada[0][2] != null)){
        if((jogada[0][0].equals(um)) && (jogada[0][1].equals(um)) && (jogada[0][2].equals(um))){
            ganhou(1);
            return;
        }
        if((jogada[0][0].equals(dois)) && (jogada[0][1].equals(dois)) && (jogada[0][2].equals(dois))){
            ganhou(2);
            return;
        }
    }
    
    if((jogada[1][0] != null) && (jogada[1][1] != null) && (jogada[1][2] != null)){
        if((jogada[1][0].equals(um)) && (jogada[1][1].equals(um)) && (jogada[1][2].equals(um))){
            ganhou(1);
            return;
        }
        if((jogada[1][0].equals(dois)) && (jogada[1][1].equals(dois)) && (jogada[1][2].equals(dois))){
            ganhou(2);
            return;
        }
    }
    
    if((jogada[2][0] != null) && (jogada[2][1] != null) && (jogada[2][2] != null)){
        if((jogada[2][0].equals(um)) && (jogada[2][1].equals(um)) && (jogada[2][2].equals(um))){
            ganhou(1);
            return;
        }
        if((jogada[2][0].equals(dois)) && (jogada[2][1].equals(dois)) && (jogada[2][2].equals(dois))){
            ganhou(2);
            return;
        }
    }
    
    if((jogada[0][0] != null) && (jogada[1][0] != null) && (jogada[2][0] != null)){
        if((jogada[0][0].equals(um)) && (jogada[1][0].equals(um)) && (jogada[2][0].equals(um))){
            ganhou(1);
            return;
        }
        if((jogada[0][0].equals(dois)) && (jogada[1][0].equals(dois)) && (jogada[2][0].equals(dois))){
            ganhou(2);
            return;
        }
    }
    
    if((jogada[0][1] != null) && (jogada[1][1] != null) && (jogada[2][1] != null)){
        if((jogada[0][1].equals(um)) && (jogada[1][1].equals(um)) && (jogada[2][1].equals(um))){
            ganhou(1);
            return;
        }
        if((jogada[0][1].equals(dois)) && (jogada[1][1].equals(dois)) && (jogada[2][1].equals(dois))){
            ganhou(2);
            return;
        }
    }
    
    if((jogada[0][2] != null) && (jogada[1][2] != null) && (jogada[2][2] != null)){
        if((jogada[0][2].equals(um)) && (jogada[1][2].equals(um)) && (jogada[2][2].equals(um))){
            ganhou(1);
            return;
        }
        if((jogada[0][2].equals(dois)) && (jogada[1][2].equals(dois)) && (jogada[2][2].equals(dois))){
            ganhou(2);
            return;
        }
    }
    
    if((jogada[0][0] != null) && (jogada[0][1] != null) && (jogada[0][2] != null) &&
       (jogada[1][0] != null) && (jogada[1][1] != null) && (jogada[1][2] != null) &&
       (jogada[2][0] != null) && (jogada[2][1] != null) && (jogada[2][2] != null)){
        jLStatus.setText("Empate!");
        desabilitaCampos();
    }
}

}
