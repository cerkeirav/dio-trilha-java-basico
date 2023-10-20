package test;

import java.util.ArrayList;
import java.util.List;

import strategy.Email;
import strategy.EmailSpam;
import strategy.EmailValido;

public class Teste {

	public static void main(String[] args) {
        EstrategiaDeTriagem context = new EstrategiaDeTriagem();

        List<Email> emails = new ArrayList<Email>();
        Email email01 = new Email("cleiton", "Pocao de crescer cabelo", "spam");
        Email email02 = new Email("juca", "Golpe", "spam");
        Email email03 = new Email("jose", "me ligue no teams agora!!!", "importante");
        Email email04 = new Email("Claudia", "Atencao aos ataques ciberneticos", "importante");
        emails.add(email01);
        emails.add(email02);
        emails.add(email03);
        emails.add(email04);

    
        context.setTipoTriagem(new EmailSpam());
        List<Email> filteredEmails = context.filterEmails(emails);
        
        for (Email email : filteredEmails) {
			System.out.println(email.getMensagem());
		}
       
        context.setTipoTriagem(new EmailValido());
        filteredEmails = context.filterEmails(emails);
        for (Email email : filteredEmails) {
        	System.out.println(email.getMensagem());
        }
        
        
    }
}