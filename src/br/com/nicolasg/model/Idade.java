package br.com.nicolasg.model;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Idade {
    
    private int anoNascimento;
    private int anoAtual;

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public int getAnoAtual() {
        return anoAtual;
    }

    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }
    
    public int getIdade(){
        if(anoNascimento>anoAtual){
            JOptionPane.showMessageDialog(null, "Ano de Nascimento deve ser menor ou igual ao ano atual");
        }
        return anoAtual - anoNascimento;
    }

    public void setAnoAtual(JTextField txAnoAtual) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
