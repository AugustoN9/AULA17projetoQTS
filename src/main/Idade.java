package main;

import java.util.Date;
import java.util.GregorianCalendar;

public class Idade {
	
	 GregorianCalendar calendar = new GregorianCalendar();
	    public int idade;
	    public final int anoatual= calendar.get(GregorianCalendar.YEAR);
	    public final int mesatual = calendar.get(GregorianCalendar.MONTH);
	    public final int diaatual = calendar.get(GregorianCalendar.DAY_OF_MONTH); 
	    public int anoNasc;
	    public int mesNsac;
	    public int diaNasc;

	    public Idade(int diaNasc, int mesNsac, int anoNasc ) {
	        this.diaNasc = diaNasc;
	        this.mesNsac = mesNsac;
	        this.anoNasc = anoNasc;
	    }

	    public void calculandoIdade() {
	       Date data = new Date(System.currentTimeMillis());
	        System.out.println(data);

	        System.out.println("                                          Data:"+this.diaatual+"/"+(this.mesatual+1)+"/"+this.anoatual);
	        if (this.diaNasc>31 || this.mesNsac > 12 || this.diaatual>31 || this.mesatual > 12){
	            System.out.println("Você digitou alguma data errada confira novamente!");
	                    }else{System.out.println("Você nasceu em: "+this.diaNasc+"/"+this.mesNsac+"/"+this.anoNasc);}

	        if (this.diaNasc>31 || this.mesNsac > 12 || this.diaatual>31 || this.mesatual > 12){
	            System.out.println("Você digitou alguma data errada confira novamente!");
	          }else if(this.mesNsac < this.mesatual ){
	            this.idade = this.anoNasc - this.anoatual;
	            System.out.println("Idade: "+this.idade+" anos");
	        }else if (this.mesNsac > this.mesatual){
	            this.idade = this.anoatual - this.anoNasc - 1;
	            System.out.println("Idade: "+this.idade+" anos");
	      }else if (this.mesNsac == this.mesatual && this.diaNasc == this.diaatual ){
	            this.idade = this.anoatual - this.anoNasc;
	            System.out.println("Idade: "+this.idade+" anos");
	            System.out.println("Parabens!! Feliz Aniversário");
	        }else if(this.mesNsac == this.mesatual && this.diaNasc < this.diaatual){
	            this.idade = this.anoatual - this.anoNasc - 1;
	            System.out.println("Idade: "+this.idade+" anos");
	        }else if(this.mesNsac == this.mesatual && this.diaNasc > this.diaatual){
	            this.idade = this.anoatual - this.anoNasc;

	     };
	   }

}
