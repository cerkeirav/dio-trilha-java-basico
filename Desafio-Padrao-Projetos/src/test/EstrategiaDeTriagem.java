package test;

import java.util.List;

import strategy.Email;
import strategy.Triagem;

public class EstrategiaDeTriagem {
	private Triagem tipoTriagem;
	
	public void setTipoTriagem(Triagem triagem) {
		this.tipoTriagem = triagem;
	}
	 public List<Email> filterEmails(List<Email> emails) {
	        return tipoTriagem.filterEmails(emails);
	    }
}
