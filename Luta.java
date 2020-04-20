
package ufc;

import java.util.Random;

public class Luta {
    
   private Lutador desafiante, desafiado;
   private int rounds;
   private boolean aprovada;
   
   public void marcarLuta(Lutador l1, Lutador l2){
       if(l1.getCategoria().equals(l2.getCategoria()) && (l1 !=l2)){
           this.setAprovada(true);
           this.setDesafiante(l1);
           this.setDesafiado(l2);
           System.out.println(" ***** LUTA MARCADA ****** ");
        } else{
           this.setAprovada(false);
           this.setDesafiante(null);
           this.setDesafiado(null);
           System.out.println(" !!!!!! LUTA NÃO PODE SER CRIADA !!!!!!");
           
       }
       
   }
    
   public void lutar(){
       if(this.isAprovada()){
           System.out.println("*********DESAFIANTE*********");
           this.desafiante.apresentar();
           System.out.println("*********DESAFIADO*********");
           this.desafiado.apresentar();
           Random aleatorio = new Random();
           Integer vencedor = aleatorio.nextInt(4);
           
           switch(vencedor){
               case 0:
                   System.out.println(this.desafiado.getNome() +" GANHOU POR DECISÃO DOS JUÍZES");
                   this.desafiado.decisaoLuta();
                   this.desafiante.perderLuta();
                   break;  
               case 1:
                   System.out.println(this.desafiante.getNome() +  " GANHOU POR DECISÃO DOS JUÍZES");
                   this.desafiado.perderLuta();
                   this.desafiante.decisaoLuta();
                   break;
               case 2:
                   System.out.println(this.desafiado.getNome() +  " GANHOU A LUTA  ");
                   this.desafiado.ganharLuta();
                   this.desafiante.perderLuta();
                   break;
               case 3:
                   System.out.println(this.desafiante.getNome() + " GANHOU A LUTA");
                   this.desafiante.ganharLuta();
                   this.desafiado.perderLuta();
                   break;
           }
       }else{
           System.out.println("LUTA NÃO PODE ACONTECER");
       }
       
   }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
   
   
}
