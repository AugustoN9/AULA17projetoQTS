package teste;

import org.junit.Test;

import junit.framework.Assert;
import main.ValidarTelefone;

@SuppressWarnings("deprecation")
public class testeValidarTelefone {

	
	@Test
	public void testTelefoneCorreto() {		
		ValidarTelefone fone = new ValidarTelefone();
		long entrada = 5133412256L;
		boolean saidaExperado = true;
		boolean resultado = fone.foneValido(entrada);
		Assert.assertEquals(saidaExperado, resultado);		
	}
	
	@Test
	public void testTelefoneIncorreto() {		
		ValidarTelefone fone = new ValidarTelefone();
		long entrada = 33412256L;
		boolean saidaExperado = false;
		boolean resultado = fone.foneValido(entrada);
		Assert.assertEquals(saidaExperado, resultado);		
	}
	
	
}
