package br.com.nicolasg.view;

import br.com.nicolasg.model.Idade;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaIdade extends JFrame implements ActionListener{
    
    private Idade idade;
    
    private JTextField txAnoNasc, txAnoAtual, txIdade;
    private JButton btCalcular;

    @Override
    public void actionPerformed(ActionEvent e) {
       
    }
    
    public TelaIdade() throws HeadlessException{
        setLayout(new GridLayout(0,2));
        
        txAnoAtual = new JTextField();
        txAnoNasc = new JTextField();
        txIdade = new JTextField();
        txIdade.setEditable(false);
        
        btCalcular = new JButton("Calcular");
        
        this.add(new JLabel("Ano Nascimento"));
        this.add(txAnoNasc);
                
        this.add(new JLabel("Ano Atual"));
        this.add(txAnoAtual);
        
        this.add(new JLabel("Idade"));
        this.add(txIdade);
        
        this.add(btCalcular);
        btCalcular.addActionListener(this);
        
        this.pack();
        this.setLocationRelativeTo(null);
    }
    
    public Idade getIdade() {
        idade.setAnoAtual(Integer.parseInt(txAnoAtual.getText()));
        idade.setAnoNascimento(Integer.parseInt(txAnoNasc.getText()));
        return idade;
    }

    public void setIdade(Idade idade) {
        if(idade.getAnoAtual()>0){
            txIdade.setText(Integer.toString(idade.getIdade()));
        }
        this.idade = idade;
    }
    
     public void addControlerActionListener(ActionListener al){
        btCalcular.addActionListener(al);
    }
     
}