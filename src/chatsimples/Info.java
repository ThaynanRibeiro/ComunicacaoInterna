package chatsimples;

import javax.swing.JOptionPane;

public class Info {
 
  public Info(){
    String  ip;
    int porta=0,i = 0;
    boolean aux;

    // RECEBENDO O IP
    do{    
        ip = (String)JOptionPane.showInputDialog("Informe o IP:");
        if(ip == null) System.exit(0);       
    }while(ip.equals("")); 
    
    // RECEBENDO A PORTA
    do{    
        try{
         porta = Integer.parseInt(JOptionPane.showInputDialog("Informe a Porta:"));
         aux = true;
        }catch(java.lang.NumberFormatException e){
         JOptionPane.showMessageDialog(null,"DIGITE SOMENTE NÚMEROS!","ERRO",JOptionPane.ERROR_MESSAGE);
         aux = false;
        } 
    }while(aux == false); 
    
    // INSTANCIA DAS CLASSES Conexao e JanelaChat
        Conexao c = new Conexao(ip,porta);       
        JanelaChat jc = new JanelaChat(c);
        
    // MÉTODOS PARA INICIAR A JANELA NO MEIO DA TELA E TORNAR VISÍVEL    
        jc.setLocationRelativeTo(null);
        jc.setVisible(true);
    }

  }
    



   
