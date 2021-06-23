package main;

public class ValidarTelefone {		
	
		public boolean foneValido(long fone1){
			
			String fone2 = Long.toString(fone1);
			int tamfone2 = fone2.length();
			if(tamfone2 == 10){
				return true;
			}else{
				return false;
			}
		}

}
