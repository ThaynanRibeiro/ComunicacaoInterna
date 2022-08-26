package chatsimples;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ProgramaAPS {
    
    public static void main(String[] args) {
     
    // MENU   
    JButton botaoIniciar = new JButton("Iniciar Chat");
    JButton botaoInstrucao = new JButton("Instruções");
    JButton botaoSair = new JButton("Sair");

    JPanel painel = new JPanel();
    painel.add(botaoIniciar);
    painel.add(botaoInstrucao);
    painel.add(botaoSair);
    JFrame janela = new JFrame("IP CHAT");
    janela.add(painel);
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janela.pack();
    janela.setVisible(true);
    janela.setLocationRelativeTo(null);
    janela.setSize(300,80);
    janela.setResizable(false);
    
    // EVENTO DO BOTÃO SAIR
    ActionListener sairListener = new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
         System.exit(0);
       }
    };
    botaoSair.addActionListener(sairListener);

    // EVENTO DO BOTÃO INSTRUÇÃO
    ActionListener instrucaoListener = new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
          JOptionPane.showMessageDialog(null,"COMO ACESSAR O CHAT:\n"
            + "1. Informe o IP do computador de destino.\n"
            + "2. Informe a Porta.\n"
            + "3. O chat será iniciado.\n"
            + "ATENÇÃO: O IP deve estar correto e as Portas terão que ser iguais, caso contrário"
            + " a conexão não será estabelecida!",
            "Intruções",JOptionPane.PLAIN_MESSAGE);
       }
    };
     botaoInstrucao.addActionListener(instrucaoListener);

     // EVENTO DO BOTÃO INICIAR CHAT
     ActionListener iniciarListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           janela.setVisible(false);
            Info info = new Info();       
        }
     };
     botaoIniciar.addActionListener(iniciarListener); 
    
    }
}