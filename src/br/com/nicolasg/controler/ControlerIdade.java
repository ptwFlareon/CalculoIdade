package br.com.nicolasg.controler;

import br.com.nicolasg.model.Idade;
import br.com.nicolasg.view.TelaIdade;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlerIdade implements ActionListener{
    
    private TelaIdade viewIdade;
    
    public ControlerIdade(){
        viewIdade = new TelaIdade();
        Idade idade = new Idade();
        viewIdade.setIdade(idade);
        this.viewIdade.addControlerActionListener(this);
        this.viewIdade.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(viewIdade!=null){
            this.calcularIdade();
        }        
    }

    private void calcularIdade() {
        Idade idade = viewIdade.getIdade();
        idade.getIdade();
        viewIdade.setIdade(idade);
    }
    
}